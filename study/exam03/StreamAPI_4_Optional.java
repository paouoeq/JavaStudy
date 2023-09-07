package exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StreamAPI_4_Optional {

	public static void main(String[] args) {
		
		/*
		 	OptionalInt, OptionalDouble, OptionalLong
		 	- 역할 : 컬렉션에 값이 없을 경우 집계 메서드(sum, average 등)를 사용하면 예외 발생
    			   => 이러한 예외를 방지하고 default 값을 설정하는 기능을 제공한다.
		 */
		
		// 1. 컬렉션에 값이 존재하는 경우
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(25);
		
		OptionalDouble avg = list.stream()
								 .mapToDouble(a->a) // 10 -> 10.5, 25 -> 25.0
								 .average(); // return 값이 OptionalDouble
		System.out.println(avg); // OptionalDouble[17.5]
		System.out.println(avg.getAsDouble()); // 17.5 => getAsDouble()을 사용하면 숫자만 출력
		System.out.println(avg.orElse(0.0)); // orElse : 값이 있으면 그 값을 출력, 없으면 기본값 출력 => 17.5 출력
		
		// 2. 컬렉션에 값이 없는 경우
		List<Integer> list2 = new ArrayList<Integer>();
		OptionalDouble avg2 = list2.stream().mapToDouble(a->a).average();
		
		System.out.println(avg2); // OptionalDouble.empty
//		System.out.println(avg2.getAsDouble()); // 값이 없기 때문에 예외 발생(NoSuchElementException)
		System.out.println(avg2.orElse(0.0)); // orElse(기본값) : 값이 있으면 그 값을 출력, 없으면 기본값 출력 => 0.0 출력
		
		
		
	}

}
