package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

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
			String sql = "insert into dept (deptno, dname, loc) " // 줄 나눠서 쓸거면 공백 하나 띄워주기
					   + " values(?, ?, ?)"; // ?는 바인딩 변수 -> 나중에 값을 설정한다.
			
			pstmt = con.prepareStatement(sql);
			
			// ? 대신 값 설정 : setXXX(?위치, 값);
			pstmt.setInt(1, 12);
			pstmt.setString(2,"개발");
			pstmt.setString(3,"서울"); 
			// 주의 : 한번만 실행할 것. 두번 실행하면 pk 중복됨
			
			int num = pstmt.executeUpdate();
			
			System.out.println("레코드 생성갯수: "+num);
			
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
