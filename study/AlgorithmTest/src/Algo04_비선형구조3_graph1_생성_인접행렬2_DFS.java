import java.util.Stack;

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
public class Algo04_비선형구조3_graph1_생성_인접행렬2_DFS {
	
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
		
		// DFS(깊이 우선 탐색)
		/*
		 	알고리즘 순서
		 	1. 스택 생성, boolean배열로 정점 방문 여부 확인
		 	2. 시작노드 저장(1 push), boolean 값을 true
		 	3. pop 1
		 	4. pop한 1과 연결된 정점 저장(2,3 push)
		 	5. pop 3
		 	6. pop한 3과 연결된 정점 저장(6 push)
		 	=> 맨 위에 있는 요소를 pop -> pop한 정점의 자식을 push -> 작업 반복
		 	
		 */
		
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] visited = new boolean[9]; // 인접행렬의 0번째가 비어있기 때문에 9개로 지정, 방문 여부 확인용, 초기값 false
		
		stack.push(1); // 시작 정점 저장
		visited[1] = true; // 시작 정점 방문처리
		
		while(!stack.isEmpty()) { // 스택이 비어있으면 while문 종료
			int idx = stack.pop();
			
			sb.append(idx+" -> "); // 방문 순서 저장용
			
			// pop한 정점과 인접한 정점 찾아 저장(push)
			for(int linkedNode : graph[idx]) {
				
				// 방문하지 않았을 경우만 push
				if(!visited[linkedNode]) {
					stack.push(linkedNode);	
					visited[linkedNode] = true;
				}
				
			}
		}
		
		System.out.println("DFS 순회 순서 : "+sb);
		
	}
	
}
