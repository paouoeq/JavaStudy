import java.util.Arrays;

public class Algo05_정렬2_삽입정렬_insertion_sort {
	
	// 교환 메서드
	public static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	// 정렬할 데이터 저장
	static int[] arr = {7,3,2,8,9,4,6,1,5};
	
	// 정렬 메서드
	// 삽입정렬 : 현재 타겟이 되는 요소값과 이전 위치의 요소값을 비교해서 작으면 교환(첫 번째 타겟은 2번째부터 시작)
	public static void insertion_sort(int[] arr, int size) {
		// 2번째 요소부터 시작
		for(int i=1; i<size; i++) {
			System.out.printf("%d라운드\n", i);
			
			// 이전 요소와 비교. j 감소시키면서 이전 요소들과 비교하여 작으면 교환
			for(int j=i; j>0; j--) {
				System.out.print("타겟값 : "+arr[j]);
				if(arr[j-1] > arr[j]) { // 이전 요소보다 타겟의 값이 작으면 교환
					System.out.print(", 이전값 : "+arr[j-1]);
					swap(arr, j-1, j);
				}
				System.out.println(", 교환 결과 : "+Arrays.toString(arr));
			}
		}
	}
	public static void main(String[] args) {
		int size = arr.length;
		
		insertion_sort(arr, size);
		
		System.out.println("===================================================");
		System.out.println("최종결과 : "+Arrays.toString(arr));
	}
	
}
