package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI_3_최종처리1_allMatch_anyMatch_noneMatch {

	public static void main(String[] args) {
		
		/*
		 	최종처리 단계에서 요소들이 특정 조건에 만족하는지 여부를 확인
		 	
		 	1) allMatch(Predicate)  : 모든 요소들이 Predicate 조건에 일치하는지 체크
		 	2) anyMatch(Predicate)  : 일부 요소들이 Predicate 조건에 일치하는지 체크
		 	3) noneMatch(Predicate) : 모든 요소들이 Predicate 조건에 일치하지 않는지 체크
		 	
		 	==> 최종 결과는 boolean값으로 반환됨
		 */
		
		// 1) allMatch
		int[] arr = {1,2,3,4,15};
		
		// 익명함수
		IntPredicate predicate = new IntPredicate() {
			
			@Override
			public boolean test(int t) {
				return t<10;
			}
		};
		
		boolean result = Arrays.stream(arr).allMatch(predicate);
		System.out.println("모든 요소가 10보다 작냐? "+result); // false
		
		// 람다 표현식
		result = Arrays.stream(arr).allMatch(t->t<10);
		System.out.println("모든 요소가 10보다 작냐? "+result); // false
		
		
		// 2) anyMatch
		boolean result2 = Arrays.stream(arr).anyMatch(t->t%3==0);
		System.out.println("요소 중 3의 배수가 있나? "+result2); // true
		
		
		// 3) nonMatch
		boolean result3 = Arrays.stream(arr).noneMatch(t->t%3==0);
		System.out.println("모든 요소 중 3의 배수가 없나? "+result3); // false
		
	}

}
