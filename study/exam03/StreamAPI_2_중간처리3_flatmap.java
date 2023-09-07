package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI_2_중간처리3_flatmap {

	public static void main(String[] args) {
		
		/*
		 	Map(Function<T,R>)
		 	flatMap(Function<T,Stream>)
		 	- 인자값인 function의 return 타입이 stream이다.
		 	- 역할 : 요소를 가공하여 복수개의 요소들로 구성된 새로운 스트림을 반환한다.
		 */
		
		List<String> list = Arrays.asList("hello world", "happy virus");
		
		// 실습1 : 공백문자 기준으로 분리
		// 익명 클래스
		Function<String, Stream<? extends String>> mapper = new Function<String, Stream<? extends String>>() {
			@Override
			public Stream<String> apply(String t) {
				String[] names = t.split(" ");
				return Arrays.stream(names);
			}
		};
		
		list.stream().flatMap(mapper).forEach(System.out::println);
		System.out.println();
		
		// 람다
		list.stream().flatMap(t->Arrays.stream(t.split(" "))).forEach(System.out::println);
		System.out.println();
		
		// 실습2 : 쉽표 기준으로 분리 + 정수값으로 출력
		List<String> list2 = Arrays.asList("10,20,30", "40,50,60");
		
		// 익명 클래스
		Function<String, IntStream> mapper2 = new Function<String, IntStream>() {

			@Override
			public IntStream apply(String t) {
				String[] arr = t.split(",");
				// String 배열을 int 배열로 변환하는 방법 <암기>
				int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray(); // toArray로 배열로 바꾸지 않으면 map이 stream으로 반환되기 때문에 오류 발생.
				return Arrays.stream(nums);
				
			}
		};
		
		list2.stream().flatMapToInt(mapper2).forEach(System.out::println);
		System.out.println();
		
		// 람다
		list2.stream().flatMapToInt(t->Arrays.stream(Arrays.stream(t.split(",")).mapToInt(Integer::parseInt).toArray())).forEach(System.out::println);
		System.out.println();
	}

}
