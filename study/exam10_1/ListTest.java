package exam10_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		// List계열 : 순서가 있고 중복이 가능
		ArrayList<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");

		// 출력방법 1 -  toString() 이용
		System.out.println(list);
		
		// 출력방법 2 - foreach문 이용
		for (String str : list) {
			System.out.println("##"+str);
		}
		
		// 출력방법 3 - Iterator
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println("!!"+ite.next());
		}
		
		// 출력방법4 - index 이용, list.get(idx)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		
		
	}
}
