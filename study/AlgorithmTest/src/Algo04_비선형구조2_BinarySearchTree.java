import java.util.Scanner;

/*
 			    35
 			   /  \
 			 18    68
 		    /  \     \
 		   7    26   99
 		  /\    /\
 		 3 12  22 30
 			
 		입력:
 			10
 			35 18  68
 			18  7  26
 			68 -1  99
 			 7  3  12
 			26 22  30
 			99 -1  -1
 			 3 -1  -1
 			12 -1  -1
 			22 -1  -1
 			30 -1  -1
 			
 */


public class Algo04_비선형구조2_BinarySearchTree {
	
	// Node 클래스를 순회에서 사용하기 때문에 외부 클래스로 만들면 오류 발생 -> 내부 클래스로 변경
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
		
		// BST 검색 : 30
		Node searchNode = bstSearch(root, 99); // 루트노드와 찾을 값 넘겨줌
		if(searchNode != null) { // 찾음
			System.out.println(cnt+"번만에 탐색 성공!");
		}
		else {
			System.out.println("탐색 실패");
		}
	
		sc.close();
		
	}
	
	// BST 트리용 검색 메서드
	static int cnt = 0; // 검색 횟수
	private static Node bstSearch(Node node, int key) {
		cnt++; // 메서드 호출될 때마다 +1
		if(node == null) { // 트리가 없는 경우
			return null;
		}
		if(node.data == key) { // 찾음
			return node;
		}
		else if(node.data < key) { // 현재 노드보다 찾을 값이 더 크면 오른쪽 탐색
			return bstSearch(node.right, key);
		}
		else if(node.data > key) { // 현재 노드보다 찾을 값이 더 작으면 왼쪽 탐색
			return bstSearch(node.left, key);
		}
		
		return null;
	}
	
}
