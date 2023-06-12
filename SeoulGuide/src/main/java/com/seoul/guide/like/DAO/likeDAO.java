package com.seoul.guide.like.DAO;

import com.seoul.guide.like.DTO.likeDTO;

public interface likeDAO {
	public void insertlike(likeDTO like) throws Exception;
	public Integer selectlike(likeDTO like) throws Exception;
	public void deletelike(likeDTO like) throws Exception;
}
