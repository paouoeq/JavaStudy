package exam02;

public class OperatorTest5 {
	
	public static void main(String[] args) {
		
		// 5. 증감연산자 ( 증가연산자 : ++ ,  감소연산자 : -- )
		
		// 전치 연산자
		int n = 10;
		++n;
		System.out.println(n);
		
		// 후치 연산자
		int n2 = 10;
		n2--;
		System.out.println(n2);
		
		// 주의할 점: 다른 연산자와 같이 사용할 때
		int m = 10;
		int result = ++m; //전치
		System.out.println(m +"\t" + result); // 11	11
		
		int m2 = 10;
		int result2 = m2++; //후치
		System.out.println(m2 +"\t" + result2); // 11 10
		
		
		// 메서드 호출
		System.out.println(a()); // 1
		System.out.println(a2()); // 10
	}
	 
	public static int a() {
		int x= 10;
		return ++x; // 전치 리턴
	}
	
	public static int a2() {
		int x= 10;
		return x++; // 후치 리턴 : 리턴이 먼저, 증가가 이후 -> 따라서 10 반환
	}
}
