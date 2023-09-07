package exam02;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionTest {

	public static void main(String[] args) {

		// 파라미터 한 개인 경우
		// 익명클래스
		Function<String, Integer> f = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		System.out.println("문자열 길이 : " + f.apply("홍길동"));
		
		// 람다 표현식 : 데이터 타입 생략 가능, 파라미터 한개라면 괄호 생략 가능
		Function<String, Integer> f2 = t -> t.length();
		System.out.println("문자열 길이 : " + f2.apply("홍길동"));
		
		////////////////////////////////////////////////////////////
		
		// IntFunction
		// 익명 클래스
		IntFunction<Integer> x = new IntFunction<Integer>() {
			
			@Override
			public Integer apply(int value) {
				return value * 2;
			}
		};
		System.out.println("값 : "+x.apply(2));
		
		// 람다 표현식
		IntFunction<Integer> x2 = value -> value * 2;
		System.out.println("값 : "+x2.apply(4));
		
		////////////////////////////////////////////////////////////
		
		// 파라미터 두 개인 경우
		// 익명 클래스
		BiFunction<String, Integer, String> bf = new BiFunction<String, Integer, String>() {
			
			@Override
			public String apply(String t, Integer u) {
				return t.substring(0,u);
			}
		};
		System.out.println("부분열 : "+bf.apply("HelloWorld", 5));
		
		// 람다 표현식
		BiFunction<String, Integer, String> bf2 = (t, u) -> t.substring(0,u);
		System.out.println("부분열 : "+bf2.apply("HelloWorld", 4));
		
	}
}
