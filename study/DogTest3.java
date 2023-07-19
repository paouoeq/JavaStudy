import java.sql.Date;

public class DogTest3 {

	public static void main(String[] args) {
		
		// 다른 패키지의 같은 이름의 클래스 접근하는 방법
		
		// 하나는 import
		Date d = new Date(25);
		
		// 나머지는 명시적 패키지 지정
		java.util.Date d2 = new java.util.Date();
	}

}
