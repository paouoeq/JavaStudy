package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.CDTO;
import com.dto.MDTO;
import com.dto.PDTO;
import com.dto.RDTO;

public class MainDAO {
	
	// 로그인/회원가입
	public int addM(SqlSession session, MDTO dto) {
		int n = session.insert("MinipjMapper.addM", dto);
		return n;
	}
	
	public int addC(SqlSession session, CDTO dto) {
		int n = session.insert("MinipjMapper.addC", dto);
		return n;
	}
	
	public CDTO clientLogin(SqlSession session, String client_id, String client_pw) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("client_id", client_id);
		map.put("client_pw", client_pw);
		CDTO dto = session.selectOne("MinipjMapper.findClientOne", map);
		
		return dto;
	}
	
	public MDTO managerLogin(SqlSession session, String manager_id, String manager_pw) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("manager_id", manager_id);
		map.put("manager_pw", manager_pw);
		MDTO dto = session.selectOne("MinipjMapper.findManagerOne", map);
		
		return dto;
	}
	
	
	// 클라이언트
	public List<RDTO> selectResAll(SqlSession session) {
		List<RDTO> list = session.selectList("MinipjMapper.selectResAll");
		return list;
	}
	public List<RDTO> placeResList(SqlSession session, int place_no) {
		List<RDTO> list = session.selectList("MinipjMapper.placeResList", place_no);
		return list;
	}
	public List<RDTO> selectReservation(SqlSession session) {
		List<RDTO> list = session.selectList("MinipjMapper.selectReservation");
		return list;
	}
	
	public int addRes(SqlSession session, RDTO dto) {
		int n = session.insert("MinipjMapper.addRes", dto);
		return n;
	}
	
	public List<RDTO> selectClientNoRes(SqlSession session, int client_no) {
		List<RDTO> list = session.selectList("MinipjMapper.selectClientNoRes", client_no);
		return list;
	}
	
	public int deleteRes(SqlSession session, int res_no) {
		int n = session.insert("MinipjMapper.deleteRes", res_no);
		return n;
	}
	
	public int updateResDate(SqlSession session, HashMap<String, Object> map) {
		int n = session.update("MinipjMapper.updateResDate", map);
		return n;
	}
	
	// 매니저
	public List<PDTO> manageAllPlace(SqlSession session, int manager_no) {
		List<PDTO> list = session.selectList("MinipjMapper.manageAllPlace", manager_no);
		return list;
	}
	
	public List<RDTO> reservationClientFind(SqlSession session, int manager_no) {
		List<RDTO> list = session.selectList("MinipjMapper.reservationClientFind", manager_no);
		return list;
	}
	
	public List<PDTO> managePlace(SqlSession session, int manager_no) {
		List<PDTO> list = session.selectList("MinipjMapper.managePlace", manager_no);
		return list;
	}
	
	public int updateResEndUse(SqlSession session, int place_no) {
		int n = session.update("MinipjMapper.updateResEndUse", place_no);
		return n;
	}
	
	// 검증절차
	public List<RDTO> selectPlaceNoResDate(SqlSession session, int res_no) {
		List<RDTO> list = session.selectList("MinipjMapper.selectPlaceNoResDate", res_no);
		return list;
	}
	
	public List<RDTO> selectResDateWherePNo(SqlSession session, int place_no) {
		List<RDTO> list = session.selectList("MinipjMapper.selectResDateWherePNo", place_no);
		return list;
	}

}
