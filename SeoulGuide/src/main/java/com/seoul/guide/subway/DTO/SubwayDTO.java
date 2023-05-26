package com.seoul.guide.subway.DTO;

public class SubwayDTO {
	private Integer sub_id;
	private String sub_name;
	private String sub_line;
	private String sub_id_api;
	private String sub_name_api;
	private String sub_line_api;
	
	public SubwayDTO() {}

	public SubwayDTO(Integer sub_id, String sub_name, String sub_line, String sub_id_api, String sub_name_api,
			String sub_line_api) {
		this.sub_id = sub_id;
		this.sub_name = sub_name;
		this.sub_line = sub_line;
		this.sub_id_api = sub_id_api;
		this.sub_name_api = sub_name_api;
		this.sub_line_api = sub_line_api;
	}

	public Integer getSub_id() {
		return sub_id;
	}

	public void setSub_id(Integer sub_id) {
		this.sub_id = sub_id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public String getSub_line() {
		return sub_line;
	}

	public void setSub_line(String sub_line) {
		this.sub_line = sub_line;
	}

	public String getSub_id_api() {
		return sub_id_api;
	}

	public void setSub_id_api(String sub_id_api) {
		this.sub_id_api = sub_id_api;
	}

	public String getSub_name_api() {
		return sub_name_api;
	}

	public void setSub_name_api(String sub_name_api) {
		this.sub_name_api = sub_name_api;
	}

	public String getSub_line_api() {
		return sub_line_api;
	}

	public void setSub_line_api(String sub_line_api) {
		this.sub_line_api = sub_line_api;
	}

	@Override
	public String toString() {
		return "SubwayDTO [sub_id=" + sub_id + ", sub_name=" + sub_name + ", sub_line=" + sub_line + ", sub_id_api="
				+ sub_id_api + ", sub_name_api=" + sub_name_api + ", sub_line_api=" + sub_line_api + "]";
	}

		
}
