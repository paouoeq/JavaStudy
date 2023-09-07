package exam03;

import java.util.Arrays;

public class StreamAPI_3_최종처리2_sum_average_max_min_count {

	public static void main(String[] args) {
		
		/*
		 	통계처리
		 	IntStream, LongStream, DoubleStream의 집계 메서드
		 	
		 	합계 : sum
		 	평균 : average
		 	최대 : max
		 	최소 : min
		 	개수 : count (Stream도 사용 가능)
		 */
		
		int[] arr = {1,2,3,4,5};
		
		// 1) 합계
		int sum = Arrays.stream(arr).sum();
		System.out.println("합계: " + sum); // 15
		
		sum = Arrays.stream(arr).filter(t->t%2==0).sum(); // 짝수의 합계
		System.out.println("짝수의 합계: " + sum); // 6
		
		
		// 2) 평균
		double avg = Arrays.stream(arr).average().orElse(0.0);
		System.out.println("평균: " + avg); // 3.0
		
		avg = Arrays.stream(arr).filter(t->t%2==0).average().orElse(0.0); // 짝수의 평균
		System.out.println("짝수의 평균: " + avg); // 3.0
		
		
		// 3) 최대
		int max = Arrays.stream(arr).max().orElse(0);
		System.out.println("최대: " + max); // 5
		
		max = Arrays.stream(arr).filter(t->t%2==0).max().orElse(0); // 짝수의 최대
		System.out.println("짝수의 최대: " + max); // 4
		
		
		// 4) 최소
		int min = Arrays.stream(arr).min().orElse(0);
		System.out.println("최대: " + min); // 1
		
		min = Arrays.stream(arr).filter(t->t%2==0).min().orElse(0); // 짝수의 최대
		System.out.println("짝수의 최대: " + min); // 2
		
		
		// 5) 개수
		long cnt = Arrays.stream(arr).count();
		System.out.println("개수: "+cnt); // 5
		
	}

}
