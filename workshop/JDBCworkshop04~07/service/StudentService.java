package com.service;

import java.util.HashMap;
import java.util.List;

import com.dto.StudentDTO;

public interface StudentService {

	//select
	public List<StudentDTO> findAll();
	public List<StudentDTO> findName(String name);	
	public List<StudentDTO> findYear(HashMap<Integer, String> map);
	public List<StudentDTO> findNo(String sNo);
	public List<HashMap<String, String>> findPoint(String sNo);
	
	// DML
	public int updateAbs(String sNo);
	public int updateCap();
}
