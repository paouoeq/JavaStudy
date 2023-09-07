package exam02;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		// 익명클래스
		Consumer<String> c = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println("Consumer : "+t);
			}
		};
		c.accept("홍길동");
		
		// 람다 표현식 (축약: 데이터타입 생략, 괄호 생략)
		Consumer<String> c2 = t -> {
			System.out.println("Consumer : "+t);
		};
		c2.accept("유관순");
		
		////////////////////////////////////////
		// IntConsumer
		
		// 익명클래스
		IntConsumer ic = new IntConsumer() {
			
			@Override
			public void accept(int value) {
				System.out.println("IntConsumer : " + value);
			}
		};
		ic.accept(10);
		
		// 람다 표현식
		IntConsumer ic2 = value -> {
			System.out.println("IntConsumer : " + value);
		};
		ic.accept(20);
	}

}
