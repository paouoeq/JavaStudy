package exam02;

import java.util.function.BinaryOperator;
import java.util.function.Function;

class Calculator3 {
	// 인스턴스 메서드
	public static int methodA(int x, int y) {
		return x+y;
	}
}
public class MethodReferenceTest3 {
	public static void main(String[] args) {

		// 3. static 메서드 method Reference
		// 파라미터 O 리턴값 O
		// 익명클래스
		BinaryOperator<Integer> x = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return Calculator3.methodA(t, u);
			}
		};
		
		// 람다
		BinaryOperator<Integer> x2 = (t, u) -> Calculator3.methodA(t, u);
		
		// method reference
		BinaryOperator<Integer> x3 = Calculator3::methodA; // 클래스명:변수명
		System.out.println("결과 : "+x3.apply(10, 20));
		
		
		/////////////////////////////////////////////////////////////////
		
		// API 중 대표적인 static 메서드 : Integer.parseInt("10"), String.valueof(10);
		
		// int xxx = Integer.parseInt("10");
		// 익명 클래스
		Function<String, Integer> f = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		};
		
		// 람다
		Function<String, Integer> f2 = t -> Integer.parseInt(t);
		
		// method reference
		Function<String, Integer> f3 = Integer::parseInt;
		System.out.println("결과 : "+(f3.apply("10")+10));
	
	}
}
