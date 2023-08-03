package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.DeptDTO;
import com.exception.DuplicatedDeptnoException;

// Oralce DB의 dept 테이블을 연동하는 클래스
public class DeptDAO {
	
	// select 기능하는 메서드
	public List<DeptDTO> findAll(Connection con) {
		
		//DeptDTO 누적용
		List<DeptDTO> list = new ArrayList<DeptDTO>(); // 다형성 적용
		
		// 연동
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select deptno as no, dname, loc from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt("no");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				DeptDTO dto = new DeptDTO(deptno, dname, loc); // 행을  DTO에 저장
				// 누적
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 역순으로 작업
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	
	// insert 작업
	public int insert(Connection con, DeptDTO dto) throws DuplicatedDeptnoException { // 저장할 데이터(DTO)도 받아야 DB로 넘길 수 있음
		
		int n = 0;
		PreparedStatement pstmt = null;
		try {
			
			String sql = "insert into dept (deptno, dname, loc) " // 줄 나눠서 쓸거면 공백 하나 띄워주기
					+ " values(?, ?, ?)"; // ?는 바인딩 변수 -> 나중에 값을 설정한다.
			
			pstmt = con.prepareStatement(sql);
			
			// ? 대신 값 설정 : setXXX(?위치, 값);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2,dto.getDname());
			pstmt.setString(3,dto.getLoc()); 
			// 주의 : 한번만 실행할 것. 두번 실행하면 pk 중복됨
			
			n = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			//e.printStackTrace();
			throw new DuplicatedDeptnoException(dto.getDeptno()+"값이 중복됨"); // 명시적 예외 발생
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
		return n;
	}
	
	//update 작업
	public int update(Connection con, DeptDTO dto) {
		
		int n = 0;
		PreparedStatement pstmt = null;
		try {
			
			String sql = "update dept set dname=?, loc=? where deptno=?";
			
			pstmt = con.prepareStatement(sql);
			
			// ? 대신 값 설정 : setXXX(?위치, 값);
			pstmt.setString(1,dto.getDname());
			pstmt.setString(2,dto.getLoc()); 
			pstmt.setInt(3, dto.getDeptno());
			
			n = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
		return n;
	}
	
	// delete 작업
public int delete(Connection con, DeptDTO dto) {
		
		int n = 0;
		PreparedStatement pstmt = null;
		try {
			
			String sql = "delete from dept where deptno=?";
			
			pstmt = con.prepareStatement(sql);
			
			// ? 대신 값 설정 : setXXX(?위치, 값);
			pstmt.setInt(1, dto.getDeptno());
			
			n = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
		return n;
	}
	
	
}
