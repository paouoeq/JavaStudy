import java.util.LinkedList;
import java.util.Queue;

/*
			1
		 2     3
	   4   5     6
	 7             8

	생성 : 인접행렬(2차원 배열)
		
		 * 연결되어 있으면 1, 안되어 있으면 0
			1  2  3  4  5  6  7  8
		──┼───────────────────────
		 1│ 0  1  1  0  0  0  0  0
		 2│ 1  0  0  1  1  0  0  0
		 3│ 1  0  0  0  0  1  0  0
		 4│ 0  1  0  0  0  0  1  0
		 5│ 0  1  0  0  0  0  0  0
		 6│ 0  0  1  0  0  0  0  1
		 7│ 0  0  0  1  0  0  0  0
		 8│ 0  0  0  0  0  1  0  0
	
 */
public class Algo04_비선형구조3_graph1_생성_인접행렬3_BFS {
	
	public static void main(String[] args) {

		// 인덱스값을 각각의 노드값으로 처리
		int[][] graph = {{}, 		// 0에 대한 노드
						 {2, 3}, 	// 1번 인덱스 = 1번 노드 -> 1의 이웃은 2와 3
						 {4, 5}, 	// 2번 인덱스 = 2번 노드 -> 이웃은 4와 5
						 {6}, 		// 3번 인덱스 = 3번 노드 -> 이웃은 6
						 {7}, 		// 4번 인덱스 = 4번 노드 -> 이웃은 7
						 {}, 		// 5번 인덱스 = 5번 노드 -> 이웃 없음
						 {8}, 		// 6번 인덱스 = 6번 노드 -> 이웃은 8
						 {}, 		// 7번 인덱스 = 7번 노드 -> 이웃 없음
						 {}}; 		// 8번 인덱스 = 8번 노드 -> 이웃 없음
		
		// BFS(너비 우선 탐색)
		/*
		 	알고리즘 순서
		 	1. 큐 생성, boolean배열로 정점 방문 여부 확인
		 	2. 시작노드 저장(1 offer), boolean 값을 true
		 	3. poll 1(맨 앞 요소 제거)
		 	4. poll한 1과 연결된 정점 저장(2,3 offer)
		 	5. poll 2
		 	6. poll한 2과 연결된 정점 저장(4,5 offer)
		 	=> 맨 앞에 있는 요소를 poll -> poll한 정점의 자식을 offer -> 작업 반복
		 	
		 */
		
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		// 방문 여부 확인용
		boolean[] visited = new boolean[9];
		
		q.offer(1); // 시작 정점 저장
		visited[1] = true; // 시작 정점 방문처리
		
		while(!q.isEmpty()) { // 큐가 비어있으면 반복문 종료
			
			int idx = q.poll(); // 맨 앞의 요소 제거
			
			sb.append(idx+" -> "); // 방문 순서 저장용
			
			// 꺼낸(poll)한 정점과 인접한 노드를 찾아 저장(offer)
			for(int linkedNode : graph[idx]) {
				
				// 방문하지 않은 경우에만 저장(offer)
				if(!visited[linkedNode]) {
					q.offer(linkedNode);
					visited[linkedNode] = true;
				}
			}
			
		}
		
		 System.out.println("BFS 순회 : "+sb);
		
				
		
	}
	
}
