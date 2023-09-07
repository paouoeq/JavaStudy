package exam01;

// 인터페이스
@FunctionalInterface
interface Flyer {
	// 가. 파라미터 X 리턴값 X
	public void fly();
}


public class LambdaTest {
	public static void main(String[] args) {
		
		// 익명 클래스
		/*
			인터페이스명 변수명 = new 인터페이스명() {
		   		// 인터페이스의 추상 메서드 재정의
			};
			
		 */
		
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("Flyer fly()");
			}
		};
		f.fly();
		
		// 람다 표현식
		Flyer f2 = () -> { System.out.println("Flyer fly()"); };
		f2.fly();
	}
}
