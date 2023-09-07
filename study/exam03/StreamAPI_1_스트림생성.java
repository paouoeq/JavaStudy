package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI_1_스트림생성 {

	public static void main(String[] args) {
		
		// 1. 컬렉션에서 Stream 생성
		List<String> list = Arrays.asList("홍길동", "이순신", "유관순");
		Stream<String> s = list.stream(); // sterma()을 쓰면 리스트에서 스트림을 얻을 수 있음
		System.out.println("스트림 요소 개수:"+s.count());
		
		// 익명클래스
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
//		s.forEach(c); // error 발생 => stream을 count에서 사용하여 남아있는 자원이 없기 때문.
		// 해결방법 : 자원을 다시 얻기 또는 count 없애기
		
		list.stream().forEach(c); // stream 자원들을 foreach를 통해 출력
		System.out.println();		
		
		// 람다표현식
		list.stream().forEach(t->System.out.println(t));
		System.out.println();
		
		// 메서드 레퍼런스
		list.stream().forEach(System.out::println);
		System.out.println("#####################################\n");
		
		// 2. 배열에서 Stream 생성
		String[] names = {"홍길동1", "이순신1", "유관순1"};
		Stream<String> x = Stream.of(names); // of는 static 메서드 -> 클래스명으로 사용, of 인자값으로 배열을 넣으면 stream으로 반환해줌
		x.forEach(System.out::println);
		System.out.println();
		
		// Array.stream(T[] t) => 배열을 스트림으로 반환해줌
		Stream<String> x2 = Arrays.stream(names);
		x2.forEach(System.out::println);
		System.out.println("#####################################\n");
		
		// 3. 리터럴에서 Stream 생성
		Stream<String> y = Stream.of("홍길동2", "이순신2", "유관순2");
		y.forEach(System.out::println);
		System.out.println();
		
		Stream<Integer> y2 = Stream.of(10,20,30);
		y2.forEach(System.out::println);
		
		
	}

}
