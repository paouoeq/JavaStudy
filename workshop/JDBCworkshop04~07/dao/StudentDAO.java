package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import com.dto.StudentDTO;

public class StudentDAO {

	// select *
	public List<StudentDTO> findAll(Connection con) {

		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select STUDENT_NO 학번, STUDENT_NAME 이름, "
					+ " (substr(STUDENT_SSN,1,8)||'******') 주민번호, "
					+ " (substr(STUDENT_ADDRESS, 1, 10)||'...') 주소, "
					+ " to_char(ENTRANCE_DATE, 'YYYY/MM/DD') 입학년도, "
					+ " ABSENCE_YN 휴학여부  from TB_STUDENT ORDER by 5";
			
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
					" WHERE STUDENT_NAME LIKE ? order by 1";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "%"+name+"%");
			
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
	
	public List<StudentDTO> findYear(Connection con, HashMap<Integer, String> map) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "select STUDENT_NO 학번, STUDENT_NAME 이름, " + 
					" (substr(STUDENT_SSN,1,8)||'******') 주민번호, (substr(STUDENT_ADDRESS, 1, 10)||'...') 주소, " + 
					" to_char(ENTRANCE_DATE, 'YYYY/MM/DD') 입학년도, ABSENCE_YN 휴학여부  " + 
					" from TB_STUDENT " + 
					" where to_char(ENTRANCE_DATE, 'YYYY') BETWEEN ? AND ? ORDER BY 5 desc";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, map.get(0));
			pstmt.setString(2, map.get(1));
			
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
	
	public List<StudentDTO> findNo(Connection con, String sNo) {
		
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringTokenizer st = new StringTokenizer(sNo, ",");
		
		try {
			String sql = "select STUDENT_NO 학번, STUDENT_NAME 이름, " + 
					" (substr(STUDENT_SSN,1,8)||'******') 주민번호, (substr(STUDENT_ADDRESS, 1, 10)||'...') 주소, " + 
					" to_char(ENTRANCE_DATE, 'YYYY/MM/DD') 입학년도, ABSENCE_YN 휴학여부  " + 
					" from TB_STUDENT " + 
					" where STUDENT_NO IN (";
			
			
			for(int i=0; i<st.countTokens(); i++) {
				sql += "?";
				if(i != st.countTokens()-1) sql += ",";
			}
			sql += ")";
			
			pstmt = con.prepareStatement(sql);
			
			int j = 1;
			while(st.hasMoreTokens()) {
				pstmt.setString(j, st.nextToken());
				j++;
			}
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
	
	public int updateAbs(Connection con, String sNo) {
		int n = 0;
		PreparedStatement pstmt = null;
		StringTokenizer st = new StringTokenizer(sNo, ",");
		
		// 솔루션
//		String[] search = searchNo.split(",");
//		String binaryVariable = null;
//		for (int i=0; i<search.length; i++) {
//			if(i==0) {
//				binaryVariable = "?";
//				continue;
//			}
//			binaryVariable +=",?";
//		}
//		
//		String sql = "update tb_student set absence_yn = 'Y' where student_no in (" + binaryVariable +")";
		
		try {
		
			String sql = "update TB_STUDENT " + 
					" set ABSENCE_YN = 'Y' " + 
					" where STUDENT_NO in (";
			
			for(int i=0; i<st.countTokens(); i++) {
				sql += "?,";
				if(i != st.countTokens()-1) sql += ",";
			}
			sql += ")";
			
			pstmt = con.prepareStatement(sql);
			
			int j = 1;
			while (st.hasMoreTokens()) {
				pstmt.setString(j,st.nextToken());
				j++;
			}
			
			n = pstmt.executeUpdate();
			
			
		} catch(SQLException e) {
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

	public int updateCap(Connection con) {
		
		int n = 0;
		PreparedStatement pstmt = null;
		try {
			
			String sql = "update TB_DEPARTMENT " + 
					"SET CAPACITY = CASE when capacity BETWEEN 0 and 20 then capacity+5 " + 
					" when capacity BETWEEN 21 and 25 then capacity+4 " + 
					" when capacity BETWEEN 26 and 30 then capacity+3 " + 
					" else capacity " + 
					" end";
			
			pstmt = con.prepareStatement(sql);
			n = pstmt.executeUpdate();
			
			
		} catch(SQLException e) {
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

	public List<HashMap<String, String>> findPoint(Connection con, String sNo) {
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "select TERM_NO 학기, student_no 학번, student_name 이름, CLASS_NAME 과목명, TO_CHAR(POINT, '9.99') 점수, " + 
					" case when POINT BETWEEN 0 and 1.9 then 'F 학점' " + 
					" when POINT BETWEEN 2.0 and 2.9 then 'C 학점' " + 
					" when POINT BETWEEN 3.0 and 3.4 then 'B 학점' " + 
					" when POINT BETWEEN 3.5 and 3.9 then 'B 학점' " + 
					" else 'A 학점'\r\n" + 
					" end 학점\r\n" + 
					" from TB_STUDENT join TB_GRADE using (STUDENT_NO) " + 
					" join TB_CLASS using (CLASS_NO) " + 
					" where student_no = ? " + 
					" order by 1";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sNo);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				HashMap<String, String> map = new HashMap<String, String>();
				map.put("학기", rs.getString("학기"));
				map.put("학번", rs.getString("학번"));
				map.put("이름", rs.getString("이름"));
				map.put("과목명", rs.getString("과목명"));
				map.put("점수", rs.getString("점수"));
				map.put("학점", rs.getString("학점"));
				
				list.add(map);
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
