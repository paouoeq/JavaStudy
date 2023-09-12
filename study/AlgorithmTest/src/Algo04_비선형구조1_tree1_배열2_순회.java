import java.util.Scanner;
/*
 				0
 			   / \
 			  1   2
 			 / \   \
 			3   4   5
 			
 		입력:
 			6 -> 노드개수
 			0  1  2 -> 노드값 왼쪽자식값 오른쪽자식값
 			1  3  4
 			2 -1  5 -> -1은 해당 위치에 자식이 없음을 의미
 			3 -1 -1
 			4 -1 -1
 			5 -1 -1
 */
public class Algo04_비선형구조1_tree1_배열2_순회 {
	
	static int n; // 노드 개수
	static int[][] tree; // 노드 저장을 위한 2차원 배열
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		// 노드 개수 입력
		n = sc.nextInt();
		
		// 2차원 배열 생성
		tree = new int[n][2]; // 행은 데이터 개수(n), 열은 2(이진트리) => [n][0]은 왼쪽 자식, [n][1]은 오른쪽 자식
		
		for(int i=0; i<n; i++) {
			// 노드값 입력
			int x = sc.nextInt(); // 해당 노드
			int l_child = sc.nextInt(); // 왼쪽 자식 값
			int r_child = sc.nextInt(); // 오른쪽 자식 값
			tree[x][0] = l_child;
			tree[x][1] = r_child;
		}
		
		for(int i=0; i<tree.length; i++) {
			for(int j=0; j<tree[i].length; j++) {
				System.out.println(i+"값의 자식 : "+tree[i][j]);
			}
		}
		
		// 순회 : 재귀함수 이용
		order(0);
		
		sc.close();
	}
	
	// 순회 메서드
	private static void order(int x) {
		// x : 노드값
		// 자식여부 확인
		if(tree[x][0]==-1 && tree[x][1]==-1) { // 자식 없는 경우
			System.out.print(x+" ");
		}
		else { // 자식 있는 경우
//			System.out.print(x+" "); // 전위 : 0 1 3 4 2 5
			
			if(tree[x][0]!=-1) { // 왼쪽 자식이 있는 경우
				order(tree[x][0]); // 왼쪽 자식 탐색
			}
			
//			System.out.print(x+" "); // 중위 : 3 1 4 0 2 5
			
			if(tree[x][1]!=-1) { // 오른쪽 자식이 있는 경우
				order(tree[x][1]); // 오른쪽 자식 탐색
			}
			
			System.out.print(x+" "); // 후위 : 3 4 1 5 2 0
		}
	}
}
