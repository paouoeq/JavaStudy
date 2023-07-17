package exam02;

public class ConstantTest {

	public static void main(String[] args) {

		// 상수 : final 키워드 사용
		
		final int NUM = 10; // 상수명은 대문자
		final int MAX_NUM = 10; // 단어 사이는 _로 구분
		
//		NUM = 20; // error = 값변경이 불가
		System.out.println(NUM);
		System.out.println(MAX_NUM); // 읽기만 가능
		
	}

}
