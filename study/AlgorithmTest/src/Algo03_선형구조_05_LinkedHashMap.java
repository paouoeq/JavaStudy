import java.util.LinkedHashMap;

public class Algo03_선형구조_05_LinkedHashMap {
	public static void main(String[] args) {
		
		// LinkedHashMap 생성(기본적으로 저장순서 유지)
		// with predictable iteration order : 예측 가능한 반복 순서
		LinkedHashMap<String, String> m = new LinkedHashMap<String, String>();
		m.put("A", "AAA");
		m.put("B", "BBB");
		m.put("C", "CCC");
		
		// HashMap과 동일
		// iterate
		// 1. m.forEach(BiConsumer) -> (key, value)
		m.forEach((key,value)->System.out.println(key+"="+value));
		System.out.println();
		
		// 2. key값.forEach(Consumer) -> key
		m.keySet().forEach(key->System.out.println(key+"="+m.get(key)));
		System.out.println();
		
	}
}
