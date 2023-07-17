package exam03;

public class ArrayTest5 {

	public static void main(String[] args) {

		// 1차원 배열 - new + literal 이용
		
		// 기본형 배열
		int [] n = new int[] {10,20};
		
		// 값 변경
		n[0] = 100;
		
		System.out.println(n.length); // 2
		System.out.println(n[0]); // 100
		System.out.println(n[1]); // 20
		
		
		// 참조형 배열
		String [] n2 = new String[] {"홍길동", "이순신", "유관순"};
		
		System.out.println(n2.length); // 3
		System.out.println(n2[0]); // 홍길동
		System.out.println(n2[1]); // 이순신
		System.out.println(n2[2]); // 유관순
		
	}

}
