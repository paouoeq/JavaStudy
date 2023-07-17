package workshop01;

import java.util.Scanner;

public class Test10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 총합 구하기");
		System.out.print("n의 값: ");
		int n = sc.nextInt();
		int sum = 0;

		while(n<=0) {
			System.out.print("n의 값: ");
			n = sc.nextInt();
		}
		
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.print("1부터 "+n+" 까지의 총합: "+sum);
		sc.close();
	}
	
}