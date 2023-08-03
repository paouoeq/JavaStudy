package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {

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
			String sql = "delete from dept where deptno=? ";
			
			pstmt = con.prepareStatement(sql);
			
			// ? 대신 값 설정 : setXXX(?위치, 값);
			pstmt.setInt(1,12);
			
			
			int num = pstmt.executeUpdate();
			
			System.out.println("레코드 삭제갯수: "+num);
			
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
