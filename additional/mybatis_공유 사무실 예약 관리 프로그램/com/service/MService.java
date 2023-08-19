package com.service;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.CDTO;
import com.dto.MDTO;
import com.dto.PDTO;
import com.dto.RDTO;

public interface MService {

	// 회원가입
	public int addC(CDTO dto);
	public int addM(MDTO dto);
	
	// 로그인
	public CDTO clientLogin(String client_id, String client_pw);
	public MDTO managerLogin(String manager_id, String manager_pw);
	
	// 클라이언트
	public List<RDTO> selectResAll();
	public List<RDTO> placeResList(int place_no);
	public List<RDTO> selectReservation();
	public int addRes(RDTO dto);
	public List<RDTO> selectClientNoRes(int client_no);
	public int deleteRes(int res_no);
	public int updateResDate(HashMap<String, Object> map);
	
	// 매니저
	public List<PDTO> manageAllPlace(int manager_no);
	public List<RDTO> reservationClientFind(int manager_no);
	public List<PDTO> managePlace(int manager_no);
	public int updateResEndUse(int place_no);
	
	// 검증절차
	public List<RDTO> selectPlaceNoResDate(int res_no);
	public List<RDTO> selectResDateWherePNo(int place_no);
}
