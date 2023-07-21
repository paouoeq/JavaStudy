package exam07_7;

public class TestMain {

	public static void main(String[] args) {
		DBService service = new DBService();
		service.setDAO(new OracleDAO()); // 오라클
		//service.setDAO(new MySQLDAO()); // mysql
		service.connect();
		
		
		// 오라클에서 mysql로 변경하였더니, DBService의 내용이 변경되지 않아도 됨=> DBService와 DAO들은 loosely coupling
	}
}
