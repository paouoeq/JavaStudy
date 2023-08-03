package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "SCOTT";
		String passwd = "TIGER";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select deptno as no, dname, loc from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt("no"); // getInt(1) 가능 (권장X)
				String dname = rs.getString("dname"); // getString(2) 가능 (권장X)
				String loc = rs.getString("loc"); // getString(3) 가능 (권장X)
				System.out.println(deptno+"\t"+dname+"\t"+loc);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 역순으로 작업
				if(rs != null) rs.close(); // if(rs != null) 가 없으면 nullpointexception 발생(런타임 에러)
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}// end main

}
