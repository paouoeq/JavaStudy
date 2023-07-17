package workshop01;

import java.util.Scanner;

public class Test09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
		
		if(a>b && a>c) {
			max = a;
		}
		else if(b>a && b>c) {
			max = b;
		}
		else {
			max = c;
		}
		System.out.println("a 값: "+a);
		System.out.println("b 값: "+b);
		System.out.println("c 값: "+c);
		System.out.println("최대값: "+max);
		
		sc.close();
	}
	
}