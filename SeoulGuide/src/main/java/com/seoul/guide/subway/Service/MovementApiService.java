package com.seoul.guide.subway.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.subway.DAO.SubwayDAO;
import com.seoul.guide.subway.DTO.MovementDTO;
import com.seoul.guide.subway.DTO.SubwayDTO;

@Service
public class MovementApiService {
	
	@Autowired
	private SubwayDAO subwayDAO;

	public List<MovementDTO> getMovementList(String station, String line) throws Exception {
		
		Map<String, String> param = new HashMap<>();
		param.put("name", station);
		param.put("line", line);
		System.out.println(param);
		SubwayDTO subwayDTO =  subwayDAO.selectSubwayByNameAndLine(param);

		String serviceKey = "$2a$10$NSxOe2TxYvVukT1fQ9lpguw5kzO6EJFk90FZ2sU8W85mmTLO.BxBS";
		String format = "json";
		String lnCd = subwayDTO.getLN_CD();
		String railOprIsttCd = subwayDTO.getRAIL_OPR_ISTT_CD();
		String stinCd = subwayDTO.getSTIN_CD();

		String baseUrl = "https://openapi.kric.go.kr/openapi/handicapped/stationMovement";
		String encodedServiceKey = URLEncoder.encode(serviceKey, "UTF-8");
		String encodedFormat = URLEncoder.encode(format, "UTF-8");
		String encodedLnCd = URLEncoder.encode(lnCd, "UTF-8");
		String encodedRailOprIsttCd = URLEncoder.encode(railOprIsttCd, "UTF-8");
		String encodedStinCd = URLEncoder.encode(stinCd, "UTF-8");

		String urlString = String.format("%s?serviceKey=%s&format=%s&lnCd=%s&railOprIsttCd=%s&stinCd=%s", baseUrl,
				encodedServiceKey, encodedFormat, encodedLnCd, encodedRailOprIsttCd, encodedStinCd);

		System.out.println(urlString);
		URL url = new URL(urlString);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/xml");

		BufferedReader br;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}

		System.out.println(urlString.toString());
		StringBuilder resSb = new StringBuilder();

		while ((line = br.readLine()) != null) {
			resSb.append(line);
		}
		br.close();
		conn.disconnect();

		List<MovementDTO> moveList = new ArrayList<MovementDTO>();
		JSONParser parser = new JSONParser();
		JSONObject mobj = (JSONObject) parser.parse(resSb.toString());
		JSONArray body = (JSONArray) mobj.get("body");

		for (int i = 0; i < body.size(); i++) {
			JSONObject ac = (JSONObject) body.get(i);
			String mvContDtl = (String) ac.get("mvContDtl");
			String imgPath = (String) ac.get("imgPath");
			MovementDTO movementDTO = new MovementDTO();
			movementDTO.setMvContDtl(mvContDtl);
			movementDTO.setImgPath(imgPath);

			moveList.add(movementDTO);
		}

		return moveList;
	}
}
