import java.util.PriorityQueue;

public class Algo03_선형구조_09_PriorityQueue {
	public static void main(String[] args) {
		
		/*
		 	Queue
		 	- FIFO
		 	- enqueue
		 	- dequeue
		 	
		 	삽입(enqueue)									삭제(dequeue)
		 	----------->					----------->
		 				rear(tail)						front(head)
		 				
		 	삽입(저장) 관련 메서드
		 	- add(값) : 저장시 문제가 발생되면 예외가 발생된다.
		 	- offer(값) : 저장시 문제가 발생되면 false를 반환한다.
		 	
		 	삭제 관련 메서드
		 	- remove() : 값이 없으면 예외 발생
		 	- poll() : 값이 없으면 null 반환
		 	
		 	peek 메서드 (가장 앞(front)에 있는 값을 반환하는 메서드)
		 	- element()
		 	- peek()
		 */
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(20);
		q.add(10);
		q.add(40);
		q.add(50);
		q.add(6);
		
		System.out.println(q); // [6, 10, 40, 50, 20] 랜덤하게 저장 => 따라서 정렬된 값을 확인할 수는 없음
		
		// 삭제 시 오름차순으로 정렬되어 삭제
		for(int i=0; i<5; i++) {
			System.out.println(q.poll());
		}
		
		
	}
}
