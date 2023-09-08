import java.util.LinkedList;
import java.util.Queue;

public class Algo03_선형구조_08_Queue {
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
		
		Queue<String> q = new LinkedList<>();
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("D");
		q.offer("E");
		
		System.out.println(q); // [A, B, C, D, E]
		System.out.println("peek : "+q.peek()); // 가장 처음에 있는 값(front 값) // peek : A
		
		String str = q.remove();
		System.out.println("삭제된 데이터 : "+str+", 남아있는 데이터 : "+q); // 삭제된 데이터 : A, 남아있는 데이터 : [B, C, D, E]
		
		str = q.poll();
		System.out.println("삭제된 데이터 : "+str+", 남아있는 데이터 : "+q); // 삭제된 데이터 : B, 남아있는 데이터 : [C, D, E]
	}
}
