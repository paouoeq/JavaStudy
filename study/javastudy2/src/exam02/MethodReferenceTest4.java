package exam02;

import java.util.function.Consumer;

public class MethodReferenceTest4 {
	public static void main(String[] args) {

		// 4. System.out.println 메서드 method reference
	
		// 파라미터 O 리턴 X
		// 익명 클래스
		Consumer<String> c = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		// 람다
		Consumer<String> c2 = t -> System.out.println(t);
		
		// method reference <매우 중요>
		Consumer<String> c3 = System.out::println;
		c3.accept("이순신");
	}
}
