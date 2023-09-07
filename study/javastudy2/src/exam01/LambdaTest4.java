package exam01;

// 인터페이스
@FunctionalInterface
interface Flyer4 {
	// 가. 파라미터 O 리턴값 O
	public int fly(int n, int n2);
}


public class LambdaTest4 {
	public static void main(String[] args) {
		
		// 익명 클래스
		Flyer4 f = new Flyer4() {
			
			@Override
			public int fly(int n, int n2) {
				return n+n2;
			}
		};
		System.out.println("result : "+f.fly(10, 20));
		
		// 람다 표현식
		Flyer4 f2 = (int n, int n2) -> {
			return n+n2;
		};
		System.out.println("result : "+f2.fly(30, 40));
		
		// 축약 : 데이터타입 생략
		Flyer4 f3 = (n, n2) -> {
			return n+n2;
		};
		System.out.println("result : "+f3.fly(50, 60));
		
		// 매개변수가 두개 이상 -> 괄호 생략 불가능
		
		// return 문장만 있으면 {}와 return 키워드 생략 가능
		Flyer4 f4 = (n, n2) -> n+n2;
		System.out.println("result : "+f4.fly(70, 80));
	}
}
