package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPI_2_중간처리1_distinct_filter {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동", "이순신", "유관순", "이순신", "이만수");
		
		// 1. 중간처리 : 중복제거(distinct)
		list.stream().distinct().forEach(System.out::println); // 이순신이 한번만 출력됨
		System.out.println();
		
		
		// 2. 중간처리 : 필터링(filter)
		
		// 익명함수
		Predicate<String> predicate = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.startsWith("이"); // 어떤 값으로 시작하는지 startWith로 확인할 수 있음
			}
		};
		
		list.stream().filter(predicate).forEach(System.out::println); // predicate의 true인 값만 출력
		System.out.println();
		
		// 람다 표현식
		list.stream().filter(t->t.startsWith("이")).forEach(System.out::println);
		System.out.println();
		
		
		// 3. 혼합(distinct + filter)
		list.stream().distinct().filter(t->t.startsWith("이")).forEach(System.out::println);
		System.out.println();
	}

}
