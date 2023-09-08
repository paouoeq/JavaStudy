import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Algo03_선형구조_02_ArrayList3_iterate {
	public static void main(String[] args) {
		// ArrayList 반복출력
		List<String> x = new  ArrayList<String>();
		x.add("C");
		x.add("C++");
		x.add("Java");
		x.add("Kotlin");
		x.add("Python");
		x.add("SQL");
		
		// 1. forEach(Consumer)
		x.forEach(System.out::println);
		System.out.println();
		
		// 2. Iterator ==> 가장 첫 위치부터 다음 위치로
		Iterator<String> ite = x.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println();
		
		// 3. ListIterator ==> 시작 위치를 지정할 수 있다. 따라서 역순으로 접근 가능
		ListIterator<String> ite2 = x.listIterator(x.size()); // listIterator의 인자는 인덱스 값이 아니고 순서(위치)값
		while(ite2.hasPrevious()) {// 정방향 : hasNext, 역방향 : hasPrevious
			System.out.println(ite2.previous());
		}
		System.out.println();
		
		// 4. foreach문
		for (String s : x) {
			System.out.println(s);
		}
		System.out.println();
		
		// 5. 일반 for문
		for(int i=0; i<x.size(); i++) {
			System.out.println(x.get(i));
		}
		
	}
}
