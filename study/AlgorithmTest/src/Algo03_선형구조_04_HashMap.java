import java.util.HashMap;
import java.util.Map;

public class Algo03_선형구조_04_HashMap {
	public static void main(String[] args) {
		
		// HashMap 생성(기본적으로 저장순서 유지 안함)
		Map<String, String> m = new HashMap<String, String>();
		m.put("A", "AAA");
		m.put("B", "BBB");
		m.put("C", "CCC");
		
		// iterate
		// 1. m.forEach(BiConsumer) -> (key, value)
		m.forEach((key,value)->System.out.println(key+"="+value));
		System.out.println();
		
		// 2. key값.forEach(Consumer) -> key
		m.keySet().forEach(key->System.out.println(key+"="+m.get(key)));
		System.out.println();
		
	}
}
