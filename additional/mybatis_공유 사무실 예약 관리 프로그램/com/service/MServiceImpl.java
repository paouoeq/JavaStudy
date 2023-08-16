package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MainDAO;
import com.dto.CDTO;
import com.dto.MDTO;
import com.dto.PDTO;
import com.dto.RDTO;

public class MServiceImpl implements MService {

	// 회원가입
	@Override
	public int addC(CDTO dto) {
		int n = 0;
		
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			n = dao.addC(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}
	
	@Override
	public int addM(MDTO dto) {
		int n = 0;
		
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			n = dao.addM(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	// 로그인
	@Override
	public CDTO clientLogin(String client_id, String client_pw) {
		CDTO dto = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			dto = dao.clientLogin(session, client_id, client_pw);
		} finally {
			session.close();
		}
		return dto;
	}

	@Override
	public MDTO managerLogin(String manager_id, String manager_pw) {
		MDTO dto = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			dto = dao.managerLogin(session, manager_id, manager_pw);
		} finally {
			session.close();
		}
		return dto;
	}

	
	
	// 클라이언트
	@Override
	public List<RDTO> placeResList(int place_no) {
		List<RDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			list = dao.placeResList(session, place_no);

		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<RDTO> selectReservation() {
		List<RDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			list = dao.selectReservation(session);

		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public int addRes(RDTO dto) {
		int n=0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			n = dao.addRes(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public List<RDTO> findRes(int client_no) {
		List<RDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			list = dao.findRes(session, client_no);
		} finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public int deleteRes(int res_no) {
		int n=0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			n = dao.deleteRes(session, res_no);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}
	
	@Override
	public int updateResDate(HashMap<String, Object> map) {
		int n=0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			n = dao.updateResDate(session, map);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}
	
	
	
	// 매니저
	@Override
	public List<PDTO> manageAllPlace(int manager_no) {
		List<PDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			list = dao.manageAllPlace(session, manager_no);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<RDTO> reservationClientFind(int manager_no) {
		List<RDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			list = dao.reservationClientFind(session, manager_no);
		} finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public List<PDTO> managePlace(int manager_no) {
		List<PDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			list = dao.managePlace(session, manager_no);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public int updateResEndUse(int place_no) {
		int n=0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			n = dao.updateResEndUse(session, place_no);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	
	// 검증절차
	@Override
	public List<RDTO> selectPlaceNoResDate(int res_no) {
		List<RDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			list = dao.selectPlaceNoResDate(session, res_no);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<RDTO> selectResDateWherePNo(int place_no) {
		List<RDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			MainDAO dao = new MainDAO();
			list = dao.selectResDateWherePNo(session, place_no);
		} finally {
			session.close();
		}
		return list;
	}




}
