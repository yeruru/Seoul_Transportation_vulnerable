package com.seoul.guide.like.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.guide.like.DAO.likeDAO;
import com.seoul.guide.like.DTO.likeDTO;

@Service
public class likeServiceImpl implements likeService {
	
	@Autowired
	private likeDAO likedao;

	@Override
	public void insertlike(likeDTO like) throws Exception {
		likedao.insertlike(like);
	}

	@Override
	public Integer selectlike(likeDTO like) throws Exception {
		return likedao.selectlike(like);
	}

	@Override
	public void deletelike(likeDTO like) throws Exception {
		likedao.deletelike(like);
	}

}
