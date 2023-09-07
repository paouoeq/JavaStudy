package exam02;

import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

class Calculator2 {
	// 인스턴스 메서드
	public int methodA(int x, int y) {
		return x+y;
	}
}
public class MethodReferenceTest2 {
	public static void main(String[] args) {

		// 2. 인스턴스 메서드 method reference
		
		// 가. 파라미터 두개, 리턴값 O
		// 익명 클래스
		Calculator2 c = new Calculator2();
		IntBinaryOperator x = new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {
				// TODO Auto-generated method stub
				return c.methodA(left,right);
			}
		};
		
		// 람다
		IntBinaryOperator x2 = (left, right) -> c.methodA(left, right);
		
		// method reference
		IntBinaryOperator x3 = c::methodA; // 객체 생성한 클래스 변수::메서드명
		System.out.println("결과 : "+x3.applyAsInt(100, 200));
		
		///////////////////////////////////////////////////////////////
		
		// API 클래스 : String 클래스의 인스턴스 메서드 사용하는 경우
		// 익명 클래스
		UnaryOperator<String> y = new UnaryOperator<String>() {
			
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		};
		
		// 람다
		UnaryOperator<String> y2 = t -> t.toUpperCase();
		
		// method reference
		UnaryOperator<String> y3 = String::toUpperCase; // API 클래스 객체생성 한 적 X -> 클래스명::메서드명
		System.out.println(y3.apply("hello")); // HELLO
		
		
		
	}
}
