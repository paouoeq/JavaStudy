package exam08_1;

import java.util.Arrays;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// StringBuilder 클래스의 인스턴스 메서드 => 버퍼로 동작되기 때문에 자신의 문자열이 변경된다.
		StringBuilder sb = new StringBuilder("HeLLo"); // StringBuilder와 StringBuffer은 동일함, Builder 권장
		StringBuffer sb2 = new StringBuffer("HeLLo");
		
		// 메서드
		
		// 1. 문자열 추가
		System.out.println("1. 추가 : "+sb.append("hello")); // HeLLohello
		System.out.println("1. 추가 : "+sb.append(10)); // HeLLohello10
		System.out.println("1. 추가 : "+sb.append(3.14)); // HeLLohello103.14
		
		System.out.println(sb); // HeLLohello103.14 => 원본 자체가 변경됨
		
		// 2. 삽입
		System.out.println("2. 삽입 : "+sb.insert(0, "홍길동")); // 홍길동HeLLohello103.14
		System.out.println("2. 삽입 : "+sb.insert(0, 100)); // 100홍길동HeLLohello103.14
		
		// 3. 삭제
		System.out.println("3. 삭제 : "+sb.delete(0, 6)); // 0부터 5까지 삭제 : HeLLohello103.14
		
		// charAt, substring, indexof 지원 O
		 
		// 4. 거꾸로
		System.out.println("4. 거꾸로 : "+sb.reverse()); // 41.301ollehoLLeH
		
		// 5. 가장 마지막 작업은 String으로 저장해서 사용한다.
		//		-> 서로 타입이 달라 저장이 안됨 -> toString 사용하여 변경
		String s = sb.toString();
		System.out.println("5. 최종결과 : " + s);
	}

}
