package exam10_2;

import java.util.ArrayList;
import java.util.List;

// <? extends E> : E 및 E를 물려받은 자식에 한정한 <?>
//<? super E> : E 및 E의 부모로 한정한 <?>
class Person {}
class Man extends Person{}
class Woman extends Person{}

public class GenericsTest4 {

	public static void main(String[] args) {

		// Man만 저장
		List<Man> list = new ArrayList<Man>();
		list.add(new Man());
		list.add(new Man());
		printData(list);
		printData2(list);
		
		// Woman만 저장
		List<Woman> list2 = new ArrayList<Woman>();
		list2.add(new Woman());
		list2.add(new Woman());
		printData(list2);
//		printData2(list2); // error(man이나 man의 부모가 아님)
		
		// String만 저장
		List<String> list3 = new ArrayList<String>();
		list3.add("홍길동1");
		list3.add("홍길동2");
//		printData(list3); // Person의 자식이 아니기 때문에 에러 발생
//		printData2(list3); // error(man이나 man의 부모가 아님)
	
		// Person만 저장
		List<Person> list4 = new ArrayList<Person>();
		list4.add(new Person());
		list4.add(new Person());
		printData(list4);
		printData2(list4);
		
	}
	// Person 및 자식만 저장하도록 강제
	public static void printData(List<? extends Person> xxx) {
		System.out.println(xxx);
	}
	
	// Man 및 부모만 저장하도록 강제
	public static void printData2(List<? super Man> xxx) {
		System.out.println(xxx);
	}

}
