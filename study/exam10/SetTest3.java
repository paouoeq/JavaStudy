package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {

	public static void main(String[] args) {
		
		// Set 계열 : 순서가 없고 중복 불가한 자료구조
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set = new HashSet(); // 제네릭스 사용을 위해 앞에는 타입을 명시해야 하지만 뒤에는 안줘도 됨.
		
		// 가정: 이름만 저장할 것이다.
		set.add("홍길동1");
		set.add("홍길동2");
		set.add("홍길동3");
		
//				set.add(10); // 잘못된 데이터를 저장한 것을 컴파일 할 때 알 수 있다.
		
		// 출력방법1 - toString()
		System.out.println(set);
		
		// 출력방법2 - foreach문 이용
		for (String obj : set) { 
//					String str = (String)obj; // 형변환 불필요
			System.out.println(">>" + obj.concat(" 님"));
		}
		
		// 출력방법3 - Iterator 이용
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println("%%"+str);
		}
		
		/*
		 * 		제네릭스를 안쓰면
		 * 		1) 잘못된 데이터를 저장한 것을 실행시점에 알 수 있다.
		 * 		2) 무조건 형변환이 필요하다.(데이터형이 obejct이기 때문)
		 */
		
	}
}
