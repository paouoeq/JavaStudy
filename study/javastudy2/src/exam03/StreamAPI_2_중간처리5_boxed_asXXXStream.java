package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI_2_중간처리5_boxed_asXXXStream {

	public static void main(String[] args) {
		
		/*
		 	boxed()
		 	- 기본형 --> 참조형
		 	
		 	asDoubleStream()
		 	- IntStream -> DoubleStream
		 	asLongStream()
		 	- IntStream -> DoubleStream
		 	
		 	* DoubleStream->IntStream, LongStream->IntStream, DoubleStream<->LongStream 변경할 수 있는 메서드는 없음
		 */
		
		int[] arr = {1,2,3,4,5};
		
		// 1) boxed : int -> Integer
		IntStream s = Arrays.stream(arr);
		s.boxed().forEach(System.out::println); // boxed에 의해 int가 아닌 Integer로 출력됨
		System.out.println();
		
		// 2) asDoubleStream()
		Arrays.stream(arr).asDoubleStream().forEach(System.out::println);
		System.out.println();
	}

}
