package exam02;

public class PDT_DataType {

	public static void main(String[] args) {

		// 1) 문자 리터럴 - char(PDT)
		System.out.println('A');
		System.out.println('홍');
		
		// 여러 문자열 - String(RDT, 클래스)
		System.out.println("홍길동");
		
		
		// 2) escape 문자
		System.out.println("홍길\n동");
		System.out.println("홍길\t동");
		System.out.println("홍길\'동");
		System.out.println("홍길\"동");
		System.out.println("홍길\\동");
		
		
		// 3) 정수 리터럴
		System.out.println(10); // 10진수
		System.out.println(0b01); // 2진수
		
		System.out.println(01); // 8진수
		System.out.println(07); // 8진수
		
		System.out.println(0x0); // 16진수
		System.out.println(0xA); // 16진수
		System.out.println(0xF); // 16진수
		
		// 4byte인 int 저장범위 : -2147483648 ~ +2147483647
		System.out.println(2147483647);
		// System.out.println(2147483648); // 기본형인 int의 범위를 벗어나 오류 발생
		System.out.println(2147483648L); // 4byte 범위보다 큰 정수는 long으로 처리
		
		
		
		// 4) 실수 리터럴
		System.out.println(3.14); // double 처리
		System.out.println(3.14D); // double 처리
		System.out.println(3.14d); // double 처리
		
		System.out.println(3.14F); // float 처리
		System.out.println(3.14f); // float 처리
		
		System.out.println(3.14e3); // 지수표현 처리
		
		
		// 5) 논리 리터럴
		System.out.println(true);
		System.out.println(false);
	}

}
