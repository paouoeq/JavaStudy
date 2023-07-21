package exam08_1;

public class StringTest {

	public static void main(String[] args) {

		// 1. String 클래스 이용한 문자열 새성
		
		// 가. 리터럴 이용(일반적으로 사용하는 방법) ==> 동일한 문자열이면 재사용(String Pool에 올라감)
		String s = "hello";
		String s2 = "hello";
		
		// 나. new 이용 ==> 동일한 문자열인 경우에도 매번 생성
		String x = new String("hello");
		String x2 = new String("hello");
		
		System.out.println(s+" "+x);

		System.out.println(s==s2); // 주소값이 같아 true
		System.out.println(x==x2); // 주소값이 달라 false
		
		// 기억할것 ==> 문자열 비교는 절대로 ==으로 하면 안된다. 반드시 equals 메서드 사용
		System.out.println(s.equals(s2)); // true
		System.out.println(x.equals(x2)); // true
		
	}

}
