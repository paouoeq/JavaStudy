import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algo03_선형구조_01_배열2_Arrays {
	public static void main(String[] args) {
		// Arrays 클래스
		// 1. 리스트 생성
		List<String> list = Arrays.asList("A", "B");
		
		// 2. 임의값으로 채우기
		String[] name = {"A", "B", "C"};
		Arrays.fill(name, "x");
		System.out.println("임의값으로 채우기 : "+Arrays.toString(name)); // 임의값으로 채우기 : [x, x, x]
		
		Arrays.fill(name, 0, 2, "a"); // 인덱스 0부터 2 전까지 채움
		System.out.println("일부분 임의값으로 채우기 : "+Arrays.toString(name)); // 일부분 임의값으로 채우기 : [a, a, x]
		
		// 3. 배열값 비교
		int[] n = {1,2,3};
		int[] n2 = {1,2,3};
		System.out.println("배열값 비교 : "+Arrays.equals(n, n2)); // 배열값 비교 : true
		
		// 4. 정렬
//		int[] n3 = {6,2,7,98,24};
		Integer[] n3 = {6,2,7,98,24};
		Arrays.sort(n3); // 오름차순 정렬 // 정렬 : [2, 6, 7, 24, 98]
		Arrays.sort(n3, Comparator.reverseOrder()); // 내림차순, but error
		// => Comparator.reverseOrder() 사용하기 위해서는 클래스타입이어야 된다.(int를 Integer로 변경하기)
		
		System.out.println("정렬 : "+Arrays.toString(n3)); // 정렬 : [98, 24, 7, 6, 2]
		
		// 5. 특정 값의 위치 검색
		int[] n4 = {6,2,7,98,24};
		int idx = Arrays.binarySearch(n4, 98); // Arrays.binarySearch(배열, 찾을값);
		System.out.println("특정 값(98)의 위치 : "+idx); // 특정 값(98)의 위치 : 3
		
		// 6. 배열 크기 변경
		int[] n5 = {1,2,3};
		n5 = Arrays.copyOf(n5, 5); // copyOf(기존배열, 새로운길이값);
		System.out.println("배열 크기 변경 : "+Arrays.toString(n5)); // 배열 크기 변경 : [1, 2, 3, 0, 0]

		// 7. 배열에서 스트림 생성
		int[] n6 = {1,2,3};
		Arrays.stream(n6).forEach(System.out::println); // intStream 생성
	}
}
