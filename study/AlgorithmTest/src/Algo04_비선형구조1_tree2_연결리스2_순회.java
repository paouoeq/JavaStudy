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


public class Algo04_비선형구조1_tree2_연결리스2_순회 {
	
	// 생성에서 만들었던 클래스이기 때문에 충돌 발생 => 내부 클래스로 만들면 에러 X
	static class Node {
		int data; // 노드값 : 0 or 1 or 2
		Node left; // 왼쪽 자식 노드 참조값
		Node right; // 오른쪽 자식 노드 참조값
		
		public Node(int data) { // 노드값 초기화
			this.data = data;
		}
		
		@Override
		public String toString() {
			return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
		}
		
	}
	
	// Node 생성 메서드
	private static Node root; // 전체 트리의 루트 or 서브트리의 루트 (=부모)
	public static void createNode(int data, int leftData, int rightData) {
		
		// 초기상태 여부 확인 - 트리가 일부분이라도 만들어 졌는지(root!=null), 아예 안 만들어져 있는지(root==null)
		if(root == null) { // 0 1 2를 입력했을 때
			root = new Node(data);
			
			if(leftData != -1) { // 왼쪽 자식 유무 확인
				root.left = new Node(leftData); // 왼쪽 자식 노드 생성
			}
			if(rightData != -1) { // 오른쪽 자식 유무 확인
				root.right = new Node(rightData); // 오른쪽 자식 노드 생성
			}
		}
		else { // 1 3 4 포함 그 이후 입력들
			
			// 루트 노드 생성 이후에 만들어진 노드 중 어떤 것인지를 찾아서 자식 노드 생성
			searchNode(root, data, leftData, rightData);
		}
	}
	
	// 루트 노드 생성 이후에 만들어진 노드 중 어떤 것인지를 찾아주는 메서드 : 재귀함수
	public static void searchNode(Node node, int data, int leftData, int rightData) {
		
		if(node == null) { // 찾을 노드가 없는 경우
			return; // 메서드 종료
		}
		else if(node.data == data) { // 위치를 찾은 경우
			// 자식을 생성해주는 과정 동일하게 수행
			if(leftData != -1) { // 왼쪽 자식 유무 확인
				node.left = new Node(leftData); // 왼쪽 자식 노드 생성
			}
			if(rightData != -1) { // 오른쪽 자식 유무 확인
				node.right = new Node(rightData); // 오른쪽 자식 노드 생성
			}
		}
		else { // 찾지 못한 경우 -> 더 찾는 과정 필요
			// 왼쪽 탐색
			searchNode(node.left, data, leftData, rightData);
			
			// 오른쪽 탐색
			searchNode(node.right, data, leftData, rightData);
			
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 노드 개수 입력
		int n = sc.nextInt();
				
		// 2차원 배열 생성
		for(int i=0; i<n; i++) {
			// 노드값 입력
			int x = sc.nextInt(); // 해당 노드
			int l_child = sc.nextInt(); // 왼쪽 자식 값
			int r_child = sc.nextInt(); // 오른쪽 자식 값
			
			createNode(x, l_child, r_child);
		}
		
		// 생성된 연결리스트 출력
		System.out.println(root);
		
		// 순회
		order(root);
		
		sc.close();
		
	}
	
	// 순회
	public static void order(Node node) {
		if(node != null) {
//			System.out.print(node.data+" "); // 전위 : 0 1 3 4 2 5
			
			if(node.left != null) {
				order(node.left);
			}
			
//			System.out.print(node.data+" "); // 중위 : 3 1 4 0 2 5
			
			if(node.right != null) {
				order(node.right);
			}
			
			System.out.print(node.data+" "); // 후위 : 3 4 1 5 2 0 
		}
	}
	
}
