package exam01;

// 인터페이스
@FunctionalInterface
interface Flyer2 {
	// 가. 파라미터 O 리턴값 X
	public void fly(int n);
}


public class LambdaTest2 {
	public static void main(String[] args) {
		
		// 익명 클래스
		Flyer2 f = new Flyer2() {
			
			@Override
			public void fly(int n) {
				System.out.println("Flayer2 fly(int n)"+n);
			}
		};
		f.fly(10);
		
		// 람다 표현식
		Flyer2 f2 = (int n) -> { System.out.println("람다 표현식 Flayer2 fly(int n)"+n); };
		f2.fly(20);
		
		// 축약1 : 데이터타입 생략 가능
		Flyer2 f3 = (n) -> { System.out.println("람다 표현식 Flayer2 fly(int n)"+n); };
		f3.fly(30);
		
		// 축약2 : 변수가 하나인 경우 괄호 생략 가능
		Flyer2 f4 = n -> { System.out.println("람다 표현식 Flayer2 fly(int n)"+n); };
		f4.fly(40);
	}
}
