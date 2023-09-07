package exam01;

// 인터페이스
@FunctionalInterface
interface Flyer3 {
	// 가. 파라미터 O 리턴값 X
	public void fly(int n, int n2);
}


public class LambdaTest3 {
	public static void main(String[] args) {
		
		// 익명 클래스
		Flyer3 f = new Flyer3() {
			
			@Override
			public void fly(int n, int n2) {
				System.out.println("Flayer2 fly("+n+"," +n2+")");
			}
		};
		f.fly(10, 20);
		
		// 람다 표현식
		Flyer3 f2 = (int n, int n2) -> {
			System.out.println("Flayer2 fly("+n+"," +n2+")");
		};
		f2.fly(30, 40);
		
		// 축약 : 데이터타입 생략
		Flyer3 f3 = (n, n2) -> {
			System.out.println("Flayer2 fly("+n+"," +n2+")");
		};
		f3.fly(50, 60);
		
		// 매개변수가 두개 이상 -> 괄호 생략 불가능
	}
}
