package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<String, String> map = new HashMap<>();
		
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "강감찬"); // 키 중복 => 에러X 덮어쓰기O
		
		// 메서드 정리 - 기본적 CRUD 작업(create, replace, update, delete)
		
		// 크기
		System.out.println(map.size());
		
		// 치환
		map.replace("p3", "세종");
		
		// 삭제
		map.remove("p3"); // key 지정해서 삭제
		// 전체 삭제
		map.clear();
		
		
		// 출력방법1 - toString
		System.out.println(map);
	}
	

}
