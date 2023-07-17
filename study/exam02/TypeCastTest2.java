package exam02;

public class TypeCastTest2 {
	public static void main(String[] args) {
		
		// 1. 묵시적 형변환
		
		// 가. byte → short → int → long → float → double
		// 나. char --> int
		// 다. int보다 작은 데이터형의 연산은 int로 반환
		// 라. 큰타입과 작은타입의 연산은 큰타입으로 반환
		
		
		// 2. 명시적 형변환(강제 형변환) : (데이터 타입) <= 형변환 연산자
		int n =10;
		short n2 = (short)n; // 4byte -> 2byte 강제 변환
		
	}
}
