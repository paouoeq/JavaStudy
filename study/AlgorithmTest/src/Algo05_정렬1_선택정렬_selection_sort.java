import java.util.Arrays;

public class Algo05_정렬1_선택정렬_selection_sort {
	
	// 교환 메서드
	public static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	// 정렬할 데이터 저장
	static int[] arr = {7,3,2,8,9,4,6,1,5};
	
	// 정렬 메서드
	// 선택정렬 : 정렬되지 않은 배열에서 최소값을 찾아 가장 맨 앞의 요소과 교환
	public static void selection_sort(int[] arr, int size) {
		for(int i=0; i<size-1; i++) { // 마지막 요소는 제일 큰 요소이기 때문에 배열크기-1만큼만 반복해도 된다.
		System.out.printf("%d 라운드 : ", i+1);	
			int minIdx = i; // 최소값을 가진 인덱스
			
			// 최소값 찾기
			for(int j=i+1; j<size; j++) {
				if(arr[j]<arr[minIdx]) {
					minIdx = j;
				}
			}
			
			System.out.print("교환 위치 및 값 : "+i+", "+arr[i]);
			System.out.println(" 최소값 : "+arr[minIdx]);
			// i번째 값과 찾은 최소값(minIdx)을 서로 교환
			swap(arr, i, minIdx);
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void main(String[] args) {
		int size = arr.length;
		selection_sort(arr, size);
		System.out.println("결과 : "+Arrays.toString(arr));
	}
	
}
