package exam02;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Calculator {
	public Calculator() { System.out.println("Calculator 생성자"); }
	public Calculator(int x) { 
		System.out.println("Calculator 생성자(int x)");
	}
	public Calculator(int x, String x2) { 
		System.out.println("Calculator 생성자(int x, String x2)");
	}
}
public class MethodReferenceTest {
	public static void main(String[] args) {

		// 1. 생성자 method reference
		
		// 가. 파라미터 X 리턴타입 O (기본생성자)
		// 익명 클래스
		Supplier<Calculator> s = new Supplier<Calculator>() {
			
			@Override
			public Calculator get() {
				return new Calculator();
			}
		};
		
		// 람다 표현식
		Supplier<Calculator> s2 = () -> new Calculator();
		
		// 메서드 참조(method reference)
		Supplier<Calculator> s3 = Calculator::new;
		Calculator c = s3.get();
		System.out.println(c);
		
		
		// 나. 파라미터 O 리턴타입 O 파라미터 한개인 경우 (public Calculator(int x))
		// 익명 클래스
		Function<Integer, Calculator> f = new Function<Integer, Calculator>() {
			@Override
			public Calculator apply(Integer t) {
				return new Calculator(t);
			}
		};
		
		// 람다 표현식
		Function<Integer, Calculator> f2 = t -> new Calculator(t);
		
		// 메서드 참조
		Function<Integer, Calculator> f3 = Calculator::new; // 파라미터가 자동 삽입됨
		Calculator c2 = f3.apply(100);
		System.out.println(c2);
		
		// 다. 파라미터 O 리턴타입 O 파라미터 두개인 경우 (public Calculator(int x, String x2))
		// 익명 클래스
		BiFunction<Integer, String, Calculator> bf = new BiFunction<Integer, String, Calculator>() {
			
			@Override
			public Calculator apply(Integer t, String u) {
				return new Calculator(t, u);
			}
		};
		
		// 람다 표현식
		BiFunction<Integer, String, Calculator> bf2 = (t, u) -> new Calculator(t, u);
		
		// 메서드 참조
		BiFunction<Integer, String, Calculator> bf3 = Calculator::new; // 파라미터 자동 삽입
		Calculator c3 = bf3.apply(100, "홍길동");
		System.out.println(c3);
		
	}
}
