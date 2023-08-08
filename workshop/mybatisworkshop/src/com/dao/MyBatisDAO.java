package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.ibatis.session.SqlSession;

import com.dto.StudentDTO;

public class MyBatisDAO {

	public List<StudentDTO> findAll(SqlSession session) {
		
		List<StudentDTO> list = session.selectList("StudentMapper.findAll");
		return list;
	}
	
	public List<StudentDTO> findName(SqlSession session, String name) {
		List<StudentDTO> list = session.selectList("StudentMapper.findName", name);
		return list;
	}
	
	public List<StudentDTO> findYear(SqlSession session, HashMap<String, Integer> map) {
		List<StudentDTO> list = session.selectList("StudentMapper.findYear", map);
		return list;
	}
	
	public List<StudentDTO> findNumAll(SqlSession session, String sNum) {
		
		StringTokenizer st = new StringTokenizer(sNum,",");
		List<String> stuNum = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			stuNum.add(st.nextToken());
		}
		
		
		List<StudentDTO> list = session.selectList("StudentMapper.findNumAll", stuNum);
		return list;
	}
}
