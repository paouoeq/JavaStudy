package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.StudentDTO;

public class StudentDAO {

	// select *
	public List<StudentDTO> findAll(Connection con) {

		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select STUDENT_NO 학번, STUDENT_NAME 이름, (substr(STUDENT_SSN,1,8)||'******') 주민번호, (substr(STUDENT_ADDRESS, 1, 10)||'...') 주소, to_char(ENTRANCE_DATE, 'YYYY/MM/DD') 입학년도, ABSENCE_YN 휴학여부  from TB_STUDENT ORDER by 5";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String stuNo = rs.getString("학번");
				String stuName = rs.getString("이름");
				String stuSsn = rs.getString("주민번호");
				String stuAddress = rs.getString("주소");
				String entDate = rs.getString("입학년도");
				String absYn = rs.getString("휴학여부");
				StudentDTO dto = new StudentDTO(stuNo, null, stuName, stuSsn, stuAddress, entDate, absYn.charAt(0), null);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return list;
	}
	
	// 이름으로 찾기
	public List<StudentDTO> findName(Connection con, String name) {
		List<StudentDTO> list =new ArrayList<StudentDTO>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select STUDENT_NO 학번, STUDENT_NAME 이름, " + 
					" (substr(STUDENT_SSN,1,8)||'******') 주민번호, (substr(STUDENT_ADDRESS, 1, 10)||'...') 주소, " + 
					" to_char(ENTRANCE_DATE, 'YYYY/MM/DD') 입학년도, ABSENCE_YN 휴학여부 " + 
					" from TB_STUDENT " + 
					" WHERE STUDENT_NAME LIKE '%'||?||'%'";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String stuNo = rs.getString("학번");
				String stuName = rs.getString("이름");
				String stuSsn = rs.getString("주민번호");
				String stuAddress = rs.getString("주소");
				String entDate = rs.getString("입학년도");
				String absYn = rs.getString("휴학여부");
				
				if (stuAddress.equals("...")) {
					stuAddress = "***주소 미상***";
				}
				
				StudentDTO dto = new StudentDTO(stuNo, null, stuName, stuSsn, stuAddress, entDate, absYn.charAt(0), null);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public List<StudentDTO> findYear(Connection con, String sYear, String eYear) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "select STUDENT_NO 학번, STUDENT_NAME 이름, " + 
					" (substr(STUDENT_SSN,1,8)||'******') 주민번호, (substr(STUDENT_ADDRESS, 1, 10)||'...') 주소, " + 
					" to_char(ENTRANCE_DATE, 'YYYY/MM/DD') 입학년도, ABSENCE_YN 휴학여부  " + 
					" from TB_STUDENT " + 
					" where ENTRANCE_DATE BETWEEN to_date(?||'01', 'YYYYMM') AND to_date(?||'12', 'YYYYMM') ORDER BY 5 desc";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, sYear);
			pstmt.setString(2, eYear);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String stuNo = rs.getString("학번");
				String stuName = rs.getString("이름");
				String stuSsn = rs.getString("주민번호");
				String stuAddress = rs.getString("주소");
				String entDate = rs.getString("입학년도");
				String absYn = rs.getString("휴학여부");
				
				if(stuAddress.equals("...")) {
					stuAddress = "***주소 미상***";
				}
				
				StudentDTO dto = new StudentDTO(stuNo, null, stuName, stuSsn, stuAddress, entDate, absYn.charAt(0), null);
				list.add(dto);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
}
