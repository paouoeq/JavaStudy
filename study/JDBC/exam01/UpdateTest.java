package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

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
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "update dept set dname=?, loc=? where deptno=? ";
			
			pstmt = con.prepareStatement(sql);
			
			// ? 대신 값 설정 : setXXX(?위치, 값);
			pstmt.setString(1,"개발부");
			pstmt.setString(2,"서울시");
			pstmt.setInt(3,12);
			
			
			int num = pstmt.executeUpdate();
			
			System.out.println("레코드 수정갯수: "+num);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 역순으로 작업
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}// end main

}
