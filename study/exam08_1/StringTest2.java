package exam08_1;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		
		// String 클래스의 인스턴스 메서드
		String s = "HeLLo";
		
		// 1. 문자열 길이 : length
		System.out.println("1. 문자열 길이 : "+s.length()); // 5
		
		// 2. 특정 문자 얻기 : charAt
		System.out.println("2. 특정 문자 얻기 : "+s.charAt(0)); // H
		char c = s.charAt(1);
		System.out.println("2. 특정 문자 얻기 : "+c); // e
		
		// 3. 특정 문자 위치 얻기 : indexOf
		System.out.println("3. 특정 문자 위치 얻기 : "+s.indexOf('L')); // 2
		System.out.println("3. 특정 문자 위치 얻기 : "+s.indexOf('x')); // 없는 문자 => -1
		
		// 4. 대문자 : toUpperCase
		System.out.println("4. 대문자 : "+s.toUpperCase()); // HELLO
		
		// 5. 소문자 : toLowerCase
		System.out.println("5. 소문자 : "+s.toLowerCase()); // hello
		
		// 6. 문자열 연결 : concat
		System.out.println("6. 문자열 연결 : "+s.concat(" ~~~")); // HeLLo ~~~
		
		// 7. 부분열 : substring
		System.out.println("7. 부분열 : "+s.substring(1)); // 인덱스 1부터 끝까지 : eLLo
		System.out.println("7. 부분열 : "+s.substring(1,4)); // 인덱스 1부터 3까지 : eLL
				
		// 8. 문자열 포함 여부 : contains
		System.out.println("8. 문자열 포함 여부 : "+s.contains("e")); // true
		System.out.println("8. 문자열 포함 여부 : "+s.contains("E")); // false
		
		// 9. 치환 : replace
		System.out.println("9. 치환 : "+s.replace("e", "X")); // HXLLo
		
		// 10. 문자열 비교 : replace
		System.out.println("10. 문자열 비교 : "+ s.equals("HeLLo")); // true
		System.out.println("10. 문자열 비교 : "+ s.equals("Hello")); // false
		System.out.println("10. 문자열 비교(대소문자 무시) : "+ s.equalsIgnoreCase("hello")); // ture
		
		// 11. 공백제거 : trim
		String s2 = "     world     "; // 앞 뒤 공백 5개씩 총 15글자
		System.out.println("11. 공백제거 : "+s.trim()); // HeLLo
		System.out.println("11. 공백제거 : "+s.trim().length()); // 5
		
		// 12. 구분자 분리 : split
		String s3 = "AAA/BBB/CCC";
		String[] arr = s3.split("/");
		System.out.println("12. 구분자 분리 : "+Arrays.toString(arr)); // [AAA, BBB, CCC]
		
		
		/////////////////////////////////////////////////////////////////////////////////
		
		// String의 static 메서드
		
		// 13. 포맷 지정 : String.format
		System.out.println("13. 포맷지정 : "+String.format("이름:%s, 나이:%d", "홍길동", 20));
		
		// 14. 문자열로 변경
		System.out.println("14. 문자열로 변경 : "+String.valueOf(10)); // 정수 -> 문자열  // 10
		System.out.println("14. 문자열로 변경 : "+String.valueOf(3.14)); // 실수 -> 문자열  // 3.14
		System.out.println("14. 문자열로 변경 : "+String.valueOf(new char[] {'a','B','c'})); // 배열 -> 문자열 // aBc

		/////////////////////////////////////////////////////////////////////////////////
		
		System.out.println(s); // 원본 그대로 남아있음
	
	
	}

}
