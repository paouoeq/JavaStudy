package exam02;

public class OperatorTest6 {
	
	public static void main(String[] args) {
		
		// 6. 3항 연산자
		
		int num = (3>2)? 100:200;
		System.out.println(num); // 100
		
		String s = (3>2)? "A":"B";
		System.out.println(s); // A
	}
}
