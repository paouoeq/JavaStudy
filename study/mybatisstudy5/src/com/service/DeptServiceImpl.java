package com.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptServiceImpl implements DeptService{

	static SqlSessionFactory sqlSessionFactory = null; // staitc은 인스턴스변수에 접근할 수 없음(제일 먼저 생성되기 때문) -> satic 변수로 변경해줘야함
	
	static { // 생성자보다 먼저 실행됨
		String resource = "com/config/Configuration.xml";
		InputStream inputStream = null; // 초기화 해줘야 에러 안남
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	} //end static
	
	@Override
	public List<DeptDTO> findAll() {
		List<DeptDTO> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		// SqlSession 얻기
		try {
		////////////DAO 연동/////////////////
		
		DeptDAO dao = new DeptDAO();
		list = dao.findAll(session);
		
		////////////////////////////////////
		} finally { // 반드시 수행할 문장 명시
			session.close();
		}
		
		return list;
	}

	
	@Override
	public DeptDTO findByDeptno(int deptno) {
		DeptDTO dto = null;
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			
			DeptDAO dao = new DeptDAO();
			dto = dao.findByDeptno(session, deptno);
			
		} finally {
			session.close();
		}
		return dto;
	}


	@Override
	public int addDept(DeptDTO dto) {
		int n=0;
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			
			DeptDAO dao = new DeptDAO();
			n = dao.addDept(session, dto);
			session.commit(); // 명시적 commit
		} finally {
			session.close();
		}
		
		return n;
	}


	@Override
	public int updateDept(HashMap<String, Object> map) {
		int n = 0;
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			
			DeptDAO dao = new DeptDAO();
			n = dao.updateDept(session, map);
			session.commit();
			
		} finally {
			session.close();
		}
		
		return n;
	}


	@Override
	public int deleteDept(int deptno) {
		int n = 0;
		SqlSession session = sqlSessionFactory.openSession();
		try {
			
			DeptDAO dao = new DeptDAO();
			n = dao.deleteDept(session, deptno);
			session.commit();
			
		} finally {
			session.close();
		}
		
		return n;
	}
	
	
}
