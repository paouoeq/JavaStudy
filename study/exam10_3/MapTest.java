package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<String, String> map = new HashMap<>();
		
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "강감찬"); // 키 중복 => 에러X 덮어쓰기O
		
		
		// 출력방법1 - toString
		System.out.println(map);

		// 출력방법2 - get(key) ==> value값을 반환(key값을 알아야 함)
		System.out.print(map.get("p1")+", ");
		System.out.print(map.get("p2")+", ");
		System.out.println(map.get("p3"));
		System.out.println(map.get("x")); // 존재하지 않는 키값 입력 => 에러X null반환
		
		// 출력방법3 - keySet() ==> key값을 반환(주로 key가 많을 때 사용) -> 반환받은 key값을 이용해 get(key)
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for (String key : keys) {
			System.out.println(key+"\t"+map.get(key));
		}
	}
	

}
