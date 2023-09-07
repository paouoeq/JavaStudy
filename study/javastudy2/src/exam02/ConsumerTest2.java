package exam02;

import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerTest2 {

	public static void main(String[] args) {
		
		// 파라미터가 2개인 경우
		
		// 익명클래스
		BiConsumer<String, Integer> x = new BiConsumer<String, Integer>() {
			
			@Override
			public void accept(String t, Integer u) {
				System.out.println("BiConsumer: "+t+"\t"+u);
			}
		};
		x.accept("홍길동", 10);
		
		// 람다 표현식
		BiConsumer<String, Integer> x2 = (t, u) -> {
			System.out.println("람다 표현식 BiConsumer: "+t+"\t"+u);
		};
		x2.accept("이순신", 20);
		
		///////////////////////////////////////////////////////////////////
		
		// ObjIntConsumer
		
		// 익명클래스
		ObjIntConsumer<String> y = new ObjIntConsumer<String>() {
			
			@Override
			public void accept(String t, int value) {
				System.out.println("ObjIntConsumer: "+t+"\t"+value);
			}
		};
		y.accept("유관순", 30);
		
		// 람다
		ObjIntConsumer<String> y2 = (t, value) -> {
			System.out.println("람다 표현식 ObjIntConsumer: "+t+"\t"+value);
		};
		y2.accept("강감찬", 40);
	}

}
