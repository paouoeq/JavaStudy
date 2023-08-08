package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MyBatisDAO;
import com.dto.StudentDTO;

public class MyBatisServiceImpl implements MyBatisService {

	@Override
	public List<StudentDTO> findAll() {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			MyBatisDAO dao = new MyBatisDAO();
			list = dao.findAll(session);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<StudentDTO> findName(String name) {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			MyBatisDAO dao = new MyBatisDAO();
			list = dao.findName(session, name);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<StudentDTO> findYear(HashMap<String, Integer> map) {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			MyBatisDAO dao = new MyBatisDAO();
			list = dao.findYear(session, map);
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<StudentDTO> findNumAll(String sNum) {
		List<StudentDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			MyBatisDAO dao = new MyBatisDAO();
			list = dao.findNumAll(session, sNum);
		} finally {
			session.close();
		}
		return list;
	}

}
