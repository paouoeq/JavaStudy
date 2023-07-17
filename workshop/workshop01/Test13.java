package workshop01;

import java.util.Scanner;

public class Test13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리의 정수를 입력하세요.");
		System.out.print("입력 : ");
		int a = sc.nextInt();
		while(a<=9 || a>=100) {
			System.out.print("입력 : ");
			a = sc.nextInt();
		}
		System.out.print("입력값은 "+a);
		
		sc.close();
	}
	
}