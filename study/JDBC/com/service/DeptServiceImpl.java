package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.dao.DeptDAO;
import com.dto.DeptDTO;
import com.exception.DuplicatedDeptnoException;

public class DeptServiceImpl implements DeptService {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "SCOTT";
	String passwd = "TIGER";

	public DeptServiceImpl() { // 서비스 객체가 생성됐을 때 드라이버 로딩
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// select 기능하는 메서드
	// connection 까지만 얻는다. 나머지 작업은 DAO에서
	@Override
	public List<DeptDTO> findAll() {
		List<DeptDTO> list = null;
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			//DAO 접근
			DeptDAO dao = new DeptDAO();
			list = dao.findAll(con); // connect dao에 넘겨줌 & list(dto) 받아옴
			
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
	public int insert(DeptDTO dto) throws DuplicatedDeptnoException {
		Connection con = null;
		int n = 0;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			// DAO 연동
			DeptDAO dao = new DeptDAO();
			n = dao.insert(con, dto);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n;
	}

	@Override
	public int update(DeptDTO dto) {
		Connection con = null;
		int n = 0;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			// DAO 연동
			DeptDAO dao = new DeptDAO();
			n = dao.update(con, dto);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n;
	}

	@Override
	public int delete(DeptDTO dto) {
		Connection con = null;
		int n = 0;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			// DAO 연동
			DeptDAO dao = new DeptDAO();
			n = dao.delete(con, dto);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n;
	}
	
	

}
