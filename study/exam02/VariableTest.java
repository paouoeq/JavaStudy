package exam02;

public class VariableTest {
	
	int n2; // 인스턴스 변수 : 0으로 자동 초기화
	static int n3; // 클래스 변수(static 변수) : 0으로 자동 초기화
	
	
	// main 메서드
	public static void main(String[] args) {
		
		
		int n = 0; // 로컬변수, 자동 초기화 안됨. 따라서 반드시 값을 지정(초기화)해줘야함.
		
		System.out.println(n); // 에러발생
		//System.out.println(n2);
		System.out.println(n3);
		
	}

}
