package exam10_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		// List계열 : 순서가 있고 중복이 가능
		ArrayList<String> list2 = new ArrayList<>();
		List<String> list = new ArrayList<>(); // 다형성(매우중요)
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
	
		System.out.println(list); // 원본
	
		// 메서드 정리
		System.out.println("크기:"+list.size());
		
		// 수정
		list.set(1, "원균");
		System.out.println(list);
		
		// 삽입
		list.add(0, "감강찬");
		System.out.println(list);
		
		// 삭제
		list.remove(1); // 위치로 삭제
		list.remove("원균"); // 값으로 삭제
		System.out.println(list);
		
		// 부분 리스트
		List<String> list3 = list.subList(0, 2); // 0부터 1까지 저장(마지막 숫자는 포함 X)
		System.out.println(list3);
	}

}
