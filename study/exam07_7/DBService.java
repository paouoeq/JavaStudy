package exam07_7;

public class DBService {

	DBDAO dao; // 인터페이스와 연결
	
	public void setDAO(DBDAO dao) { // => 다형성이용 : DBDAO dao = new mysql() or new oralce()
		this.dao = dao; 
	}
	
	public void connect() {
		dao.connect();
	}
}
