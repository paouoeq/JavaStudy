package exam02;

public class OperatorTest4 {
	
	public static void main(String[] args) {
		
		// 4. 논리연산자 - 실행 결과는 논리값
		// JS처럼 임의의 값을 논리값으로 사용할 수 없음 ( true/false만 사용 가능 )
		
		// 가. &&
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		System.out.println();
		
		// 가. ||
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		System.out.println();
		
		// 가. ! ( 부정 )
		System.out.println(!true); // false
		System.out.println(!false); // true
	}
}
