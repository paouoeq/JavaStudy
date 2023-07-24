package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		
		// Set 계열 : 순서가 없고 중복 불가한 자료구조
		HashSet set = new HashSet();
		
		// 데이터 저장
		// 기본형은 모두 auto boxing해서 저장
		set.add("홍길동");
		set.add(20);
		set.add(3.14);
		set.add('A');
		set.add(true);
		
		// 중복 저장 -> 에러는 안 생기지만 한번만 저장된다.
		set.add("홍길동");
		set.add(20);
		set.add(3.14);
		set.add('A');
		set.add(true);
		
		
		// 출력방법 1. toString() 이용
		System.out.println(set); // [A, 홍길동, 20, 3.14, true] : 순서가 없고, 중복이 없음

		
		// 출력방법 2. for-each문 이용
		for(Object obj : set) { // 어떤 데이터로 저장될지 모르기 때문에 Object로 받아야함 => 다형성
			System.out.println(">> "+obj);
		}
		
		// 출력방법 3.Iterator API 이용 ==> 컬렉션에 저장된 데이터를 반복적으로 가져오는 방법
		Iterator ite = set.iterator(); // StringTokenizer과 사용법이 유사함
		while(ite.hasNext()) {
			System.out.println("##"+ite.next());
		}
	}

}
