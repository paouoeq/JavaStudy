package workshop01;

import java.util.Scanner;

public class Test07 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		System.out.println("한 자리 정수값을 입력하시오");
		int mul = sc.nextInt();
		
		for(int i=1; i<=100; i++) {
			if(i%mul == 0) {
				sum+=i;;
				System.out.print(i+"+");
				
			}
		}
		System.out.print("="+sum);
		
		sc.close();
		
	}
	
}