package exam02;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class OperatorTest {

	public static void main(String[] args) {

		// 매개변수가 한 개인 경우
		// 익명 클래스
		UnaryOperator<String> x = new UnaryOperator<String>() {
			
			@Override
			public String apply(String t) {
				return t+"~";
			}
		};
		System.out.println("값 : "+x.apply("hello"));
		
		// 람다 표현식
		UnaryOperator<String> x2 = t -> t+"~";
		System.out.println("값 : "+x2.apply("hi"));
		
		/////////////////////////////////////////////////////////////////
		
		// IntUnaryOperator
		// 익명 클래스
		IntUnaryOperator k = new IntUnaryOperator() {
			
			@Override
			public int applyAsInt(int operand) {
				return operand*2;
			}
		};
		System.out.println("값 : "+k.applyAsInt(100));
		
		// 람다 표현식
		IntUnaryOperator k2 = operand -> operand*2;
		System.out.println("값 : "+k2.applyAsInt(50));
		
		/////////////////////////////////////////////////////////////////
		
		// 매개변수가 두 개인 경우
		// 익명 클래스
		BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		System.out.println("값 : "+bo.apply(100, 200));
		
		// 람다 표현식
		BinaryOperator<Integer> bo2 = (t, u) -> t+u;
		System.out.println("값 : "+bo2.apply(50, 60));
		
		/////////////////////////////////////////////////////////////////
		
		// IntBinaryOperator
		// 익명클래스
		IntBinaryOperator ibo = new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {
				return left*right;
			}
		};
		System.out.println(ibo.applyAsInt(5, 7));
		
		// 람다 표현식
		IntBinaryOperator ibo2 = (left, right) -> left*right;
		System.out.println(ibo2.applyAsInt(10, 20));
		
	}
}
