package workshop01;

import java.util.Scanner;

public class Test19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("피라미드 모양 삼각형");
		System.out.print("몇 단 삼각형입니까?");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			String str = "";
			for(int j=num-i; j>=1 ; j--) {
				str+=" ";
			}
			for(int j=1; j<=(i-1)*2+1 ; j++) {
				str+="*";
			}
			System.out.println(str);
		}
		sc.close();
		
	}
	
}