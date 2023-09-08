import java.util.LinkedList;

public class Algo03_선형구조_03_LinkedList {
	public static void main(String[] args) {
		
		// LinkedList 생성 (ArrayList보다 삽입/삭제 효율적)
		LinkedList<String> list = new LinkedList<String>();
		list.add("A1");
		list.add("A2");
		list.add("A3");
		
		list.add(0,"B");
		System.out.println(list); // [B, A1, A2, A3]
		
		list.addFirst("C"); // 처음에 삽입
		list.addLast("D"); // 마지막에 삽입
		System.out.println(list); // [C, B, A1, A2, A3, D]
		
		// 삭제
		//remove() : 맨 처음 값 삭제, 인자값(값|인덱스)을 넣어주면 해당하는 값 삭제
		String str = list.removeFirst(); // 첫번째값 삭제, [B, A1, A2, A3, D]
		str = list.removeLast(); // 마지막값 삭제, [B, A1, A2, A3]
		boolean b = list.remove("A1"); // [B, A2, A3]
		list.removeIf(x->x.startsWith("A")); // removeIf(Predicate) // [B]
		System.out.println(list);
		
		// iterate는 ArrayList와 동일
		
	}
}
