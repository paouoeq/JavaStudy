package exam10_2;

import java.util.ArrayList;
import java.util.List;

// <?> : collection 타입의 제네릭이면 다 받아줄 수 있음
public class GenericsTest3 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		
		printData(list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		
		printData(list2);
		
	}
	
	public static void printData(List<?> xxx) { // <String>으로 받으면 list만 적용, <Integer>로 받으면 list2만 적용
		System.out.println(xxx);
	}
}
