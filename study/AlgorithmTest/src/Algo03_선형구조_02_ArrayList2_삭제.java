import java.util.ArrayList;
import java.util.List;

public class Algo03_선형구조_02_ArrayList2_삭제 {
	public static void main(String[] args) {
		// ArrayList 삭제
		List<String> x = new  ArrayList<String>();
		x.add("C");
		x.add("C++");
		x.add("Java");
		x.add("Kotlin");
		x.add("Python");
		x.add("SQL");
		
		// index로 삭제 -> String 리턴 : 삭제한 값 리턴
		String str = x.remove(5);
		System.out.println(str);
		
		// 값으로 삭제 -> boolean 리턴 : 삭제 성공유무 리턴
		boolean b = x.remove("Kotlin");
		System.out.println(b);
		
		// removeIf(predicate) : predicate 조건이 참인 경우에만 삭제 -> boolean 리턴 : 삭제 성공유무 리턴
		boolean b2 = x.removeIf(t->t.startsWith("C")); // C로 시작하는 값 삭제
		System.out.println(b2);
		
		System.out.println(x); // [Java, Python]
		
		// 삭제할 값을 List에 저장하고 이 List값을 이용해서 삭제
		List<String> x2 = new  ArrayList<String>();
		x2.add("Java");
		
		// removeAll(collection) : collection에 저장된 값 삭제됨
		x.removeAll(x2);
		System.out.println(x); // [Python]
	}
}
