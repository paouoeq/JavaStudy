import java.util.Scanner;

/*
		1*****2*****5
		*          *
		 *        *
		  *3*****4

	생성 : 인접행렬(2차원 배열)
		
		 * 연결되어 있으면 1, 안되어 있으면 0
			1  2  3  4  5
		──┼───────────────
		 1│ 0  1  1  0  0
		 2│ 1  0  0  0  1
		 3│ 1  0  0  1  0  
		 4│ 0  0  1  0  1
		 5│ 0  1  0  1  0
		 
	입력 : 
		 5 5 -> 정점개수 간선개수
		 
		 5 4 -> 5와 4가 연결되어 있음
		 5 2 -> 5와 2가 연결되어 있음
		 4 3
		 3 1
		 2 1
	
 */
public class Algo04_비선형구조3_graph1_생성_인접행렬 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int vertex = sc.nextInt(); // 정점 개수 입력
		int edge = sc.nextInt(); // 간선 개수 입력
		
		// 인접행렬(2차원 배열)
		int[][] adjArray = new int[vertex+1][vertex+1]; // 요소를 1부터 접근하기 위해 +1을 함
		
		// 간선의 개수만큼 반복하여 인접행렬에 저장
		for(int i=0; i<edge; i++) {
			
			// 연결되어 있는 요소 입력
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			// 배열에 저장, 무방향이기 때문에 5-4와 4-5 연결되어 있음을 모두 표현해줘야 함.
			adjArray[v1][v2] = 1; // 5-4 연결 표현
			adjArray[v2][v1] = 1; // 4-5 연결 표현
		}
		
		// 인접행렬 출력
		System.out.println("  1 2 3 4 5");
		for(int i=1; i<adjArray.length; i++) {
			System.out.print(i+" ");
			for(int j=1; j<adjArray[i].length; j++) {
				System.out.print(adjArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
