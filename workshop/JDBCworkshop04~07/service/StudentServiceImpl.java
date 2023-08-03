package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.dao.StudentDAO;
import com.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "WORKSHOP";
	String passwd = "workshop";
	
	
	
	public StudentServiceImpl() { // 드라이버 로딩
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	@Override
	public List<StudentDTO> findAll() {
		List<StudentDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			StudentDAO dao = new StudentDAO();
			list = dao.findAll(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}


	@Override
	public List<StudentDTO> findName(String name) {
		List<StudentDTO> list = null;
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			StudentDAO dao = new StudentDAO();
			list = dao.findName(con, name);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}


	@Override
	public List<StudentDTO> findYear(HashMap<Integer, String> map) {
		List<StudentDTO> list = null;
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			StudentDAO dao = new StudentDAO();
			list = dao.findYear(con, map);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}


	@Override
	public List<StudentDTO> findNo(String sNo) {
		List<StudentDTO> list = null;
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			StudentDAO dao = new StudentDAO();
			list = dao.findNo(con, sNo);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}


	@Override
	public int updateAbs(String sNo) {
		int n = 0;
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			StudentDAO dao = new StudentDAO();
			n = dao.updateAbs(con, sNo);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return n;
	}


	
	@Override
	public int updateCap() {
		
		int n = 0;
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			StudentDAO dao = new StudentDAO();
			n = dao.updateCap(con);
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return n;
	}


	
	@Override
	public List<HashMap<String, String>> findPoint(String sNo) {
		List<HashMap<String, String>> list = null;
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			StudentDAO dao = new StudentDAO();
			list = dao.findPoint(con, sNo);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

}
