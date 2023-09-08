import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Algo03_선형구조_06_TreeMap {
	public static void main(String[] args) {
		
		// TreeMap 생성(기본적으로 key기준 오름차순 정렬)
//		TreeMap<String, String> m = new TreeMap<>(); // 대소문자 구별된 오름차순 정렬 : {A=AAA, B=BBB, E=EEE, ab=ab, c++=c++c++, d=ddd}
//		SortedMap<String, String> m = new TreeMap<>(Comparator.reverseOrder()); // 대소문자 구별된 내림차순 정렬 : {d=ddd, c++=c++c++, ab=ab, E=EEE, B=BBB, A=AAA}
		SortedMap<String, String> m = new TreeMap<>(String.CASE_INSENSITIVE_ORDER); // 대소문자 구별하지 않은 오름차순 정렬 : {A=AAA, ab=ab, B=BBB, c++=c++c++, d=ddd, E=EEE}
		m.put("A", "AAA");
		m.put("ab", "ab");
		m.put("B", "BBB");
		m.put("c++", "c++c++");
		m.put("d", "ddd");
		m.put("E", "EEE");
		
		// A:65, a:97 -> 소문자가 값이 더 큼(아스키코드)
		System.out.println(m);
	}
}
