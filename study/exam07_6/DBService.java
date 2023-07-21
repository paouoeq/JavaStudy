package exam07_6;

public class DBService {

//	OracleDAO dao; // 오라클
	MySQLDAO dao; // mysql
	
//	public void setDAO(OracleDAO dao) { // 오라클
//		this.dao = dao; 
//	}
	
	public void setDAO(MySQLDAO dao) { // mysql
		this.dao = dao; 
	}
	
//	public void connect() { // 오라클
//		dao.connect_oracle();
//	}
	
	public void connect() { // mysql
		dao.connect_mysql();
	}
}
