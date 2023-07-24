package exam09;

class Test2 {
	public void a() {
		System.out.println("Test.a");
		
		// 연산작업
		try {
			int num = 0;
			int result = 10/num; // 예외발생 ==> 비정상종료됨 ==> 정상종료됨
			System.out.println("결과값: "+result);
		} catch(ArithmeticException e) {
//			System.out.println("error: 0으로 나누어 발생"); // 사용자 입장에서 알기 쉬움
//			System.out.println("error: "+e.getMessage());
			e.printStackTrace(); // 예외발생시 개발자가 디버깅용으로 많이 사용
		} 
	}
}

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		// 정상종료
		
		System.out.println("1");
		System.out.println("2");
		
		Test2 t = new Test2();
		t.a();
		
		System.out.println("end. 정상종료");
		
	}

}
