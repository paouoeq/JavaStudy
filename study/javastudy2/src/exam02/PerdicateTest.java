package exam02;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PerdicateTest {

	public static void main(String[] args) {

		// 파라미터 한개
		// 익명 클래스
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.length()==5;
			}
		};
		System.out.println("결과 : "+p.test("hello"));
		
		// 람다 표현식
		Predicate<String> p2 = t -> t.length()==5;
		System.out.println("결과 : "+p2.test("apple")); // true
		
		///////////////////////////////////////////////////////////////////////
		
		// IntPredicate 
		// 익명 클래스
		IntPredicate ip = new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				return value > 10;
			}
		};
		System.out.println("결과 : "+ip.test(20));
		
		// 람다 표현식
		IntPredicate ip2 = value -> value > 10;
		System.out.println("결과 : "+ip2.test(5)); // false
		
		///////////////////////////////////////////////////////////////////////
		
		// 파라미터 두개
		// 익명 클래스
		BiPredicate<String, Integer> bp = new BiPredicate<String, Integer>() {
			
			@Override
			public boolean test(String t, Integer u) {
				return t.length() == u;
			}
		};
		System.out.println("결과 : "+bp.test("hello world", 5)); // false
		
		// 람다 표현식
		BiPredicate<String, Integer> bp2 = (t, u) -> t.length() == u;
		System.out.println("결과 : "+bp2.test("hello world", 11)); // true
	}
}
