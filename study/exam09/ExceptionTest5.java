package exam09;

class Test4 {
	public void b() throws ArithmeticException, NullPointerException {
		System.out.println("Test.a");

		// ArithmeticException 발생 가능한 코드
		int num = 1;
		int result= 10/num;  
		System.out.println("결과값:" + result);
		
		// NullPointerException 발생 가능한 코드
		String n=null;
		System.out.println(n.length());

	}
	public void a() throws ArithmeticException, NullPointerException {
		b();
	}
}

public class ExceptionTest5 {

	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("2");
		
		Test4 t = new Test4();
		try {
			t.a();
			
		} catch(ArithmeticException e) {
			System.out.println("error: 0으로 나누어 발생");
		} catch(NullPointerException e) {
			System.out.println("error: 객체 생성 필요");
		}
		
		System.out.println("end. 정상종료");
		
	}

}
