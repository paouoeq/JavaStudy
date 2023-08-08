package com.service;

import java.util.HashMap;
import java.util.List;

import com.dto.StudentDTO;

public interface MyBatisService {
	public List<StudentDTO> findAll();
	public List<StudentDTO> findName(String name);
	public List<StudentDTO> findYear(HashMap<String, Integer> map);
	public List<StudentDTO> findNumAll(String sNum);
}
