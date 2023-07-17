package workshop01;

import java.util.Scanner;

public class Test12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 : ");
		int a = sc.nextInt();
		while(a<0) {
			System.out.print("정수값 : ");
			a = sc.nextInt();
		}
		String num = String.valueOf(a);
		System.out.println("그 수는 "+num.length()+"자리입니다.");
		sc.close();
	}
	
}