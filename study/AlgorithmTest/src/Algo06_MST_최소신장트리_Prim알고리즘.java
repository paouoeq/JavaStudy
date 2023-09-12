import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Algo06_MST_최소신장트리_Prim알고리즘 {
	
	static class Node {
		int to; // 이웃
		int weight; // 가중치
		
		public Node(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}

		// 정렬 목적
		public int getWeight() {
			return weight;
		}

		@Override
		public String toString() {
			return "Node [to=" + to + ", weight=" + weight + "]";
		}
		
	}
	
	static int cnt = 7; // 정점의 개수
	static int total; // MST의 가중치 합
	static ArrayList<ArrayList<Node>> nodeList = new ArrayList<ArrayList<Node>>(); // 중첩 리스트에 graph 값 지정
	static boolean[] visited = new boolean[cnt+1]; // 방문 여부
	static StringBuilder sb = new StringBuilder(); // 정점 순서 저장용
	
	public static void main(String[] args) {
		
		// 가중치 그래프 
		int [][] graph = {
				 {1,2,29},
				 {1,5,75},
				 {2,3,35},
				 {2,6,34},
				 {3,4,7},
				 {4,6,23},
				 {4,7,13},
				 {5,6,53},
				 {6,7,25}
				 };
		
		// 중첩 ArrayList 생성
		for(int i=0; i<=cnt; i++) {
			nodeList.add(new ArrayList<Node>());
		}
		
		// nodeList에 graph 값 저장
		for(int i=0; i<graph.length; i++) {
			// {1,2,29}
			int v1 = graph[i][0]; //1
			int v2 = graph[i][1]; //2
			int weight = graph[i][2]; // 29
			
			// 무방향
			nodeList.get(v1).add(new Node(v2, weight));
			nodeList.get(v2).add(new Node(v1, weight));
			
		}
		
		// nodeList값 출력
		for(int i=0; i<nodeList.size(); i++) {
			System.out.println(i+" -> "+nodeList.get(i));
		}
		
		/*
		 	출력 결과
		 	0 -> []
			1 -> [Node [to=2, weight=29], Node [to=5, weight=75]]
			2 -> [Node [to=1, weight=29], Node [to=3, weight=35], Node [to=6, weight=34]]
			3 -> [Node [to=2, weight=35], Node [to=4, weight=7]]
			4 -> [Node [to=3, weight=7], Node [to=6, weight=23], Node [to=7, weight=13]]
			5 -> [Node [to=1, weight=75], Node [to=6, weight=53]]
			6 -> [Node [to=2, weight=34], Node [to=4, weight=23], Node [to=5, weight=53], Node [to=7, weight=25]]
			7 -> [Node [to=4, weight=13], Node [to=6, weight=25]]
		 */
		
		// 1부터 시작
		prim(1);
		System.out.println("탐색순서 : "+sb.toString());
		System.out.println("MST의 총 weight : "+total); // weight = 가중치
	}
	
	// prim 알고리즘 구현한 메서드
	private static void prim(int start) {
		// 가장 작은 weight 값을 가진 Node 얻기 위해
		Queue<Node> q = new PriorityQueue<>(Comparator.comparing(Node::getWeight)); // weight 기준으로 오름차순 정렬
		
		// 시작값 저장
		q.add(new Node(start, 0)); // Node(to, weight)
		
		while(!q.isEmpty()) { // 큐가 비워지면 반복문 종료
			Node p = q.poll();
			int to = p.to;
			int weight = p.weight;
			
			if(visited[to]) continue; // 현재 정점에 방문한 적이 있으면 무시
			
			visited[to] = true; // 방문한 적이 없으면 true로 변경
			sb.append(to+" -> "); // 방문 순서 저장
			total += weight; // 가중치값 누적
			
			// 현재 노드와 이웃하면서 방문한 적이 없는 노드를 Queue에 추가 => 자동으로 weight값으로 정렬됨
			for(Node next : nodeList.get(to)) {
				if(!visited[next.to]) { // 방문한 적이 없으면
					q.add(next); // 노드 추가
				}
			}
		}
		
	}
	
}
