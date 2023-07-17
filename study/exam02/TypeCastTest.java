package exam02;

public class TypeCastTest {
	public static void main(String[] args) {
		
		// 1. 묵시적 형변환
		
		// 가. byte → short → int → long → float → double
		byte b = 10;
		short b2 = b; // 1byte -> 2byte 변경
		int b3 = b2; // 2byte -> 4byte 변경
		long b4 = b3; // 4byte -> 8byte 변경
		float f = b4;
		double f2 = f;
		double f3 = b; // 작은 타입의 값을 큰 타입에 바로 저장할 수 있음. 반대는 안됨
		
		// 반대의 경우 (큰 -> 작은) : error
		// 해결법 : 강제형변환 (int)x
		float x = 3.14f;
//		int x2 = x; // `float > int` 이기 때문에 error 발생
		
		
		// 나. char --> int
		char c = 'A'; // 65
		char c2 = 'a'; // 97
		
		int n = c;
		int n2 = c2;
		
		System.out.println(n+" "+n2);
		System.out.println('A'+1); // 문자로 연산 가능
		
		
		// 다. int보다 작은 데이터형의 연산은 int로 반환
		short s = 10;
		short s2 = 10;
//		short s3 = s+s2; // error -> s+s2가 int형이기 때문에 short보다 커서 error 발생
		
		// 라. 큰타입과 작은타입의 연산은 큰타입으로 반환
		float ff = 3.14f;
		int mm = 10;
//		int ff2 = ff + mm; // ff+mm = float기 때문에 error
		float ff2 = ff + mm;
	}
}
