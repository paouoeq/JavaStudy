package workshop07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SetTest {

	public static void main(String[] args) {
		
		String[] str = args[0].split(""); // argument로 문자열 입력받아 String배열에 저장
		
		HashSet<String> hs = new HashSet<>(); // HashSet 생성
		
		for(String s : str) { // for-each문 이용하여 배열 원소들 HashSet으로 복사
			hs.add(s);
		}
		
		System.out.println(hs);
	}

}
