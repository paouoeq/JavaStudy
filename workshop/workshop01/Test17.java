package workshop01;

import java.util.Scanner;

public class Test17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형입니까?");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			String str = "";
			for(int j=1; j<=i ; j++) {
				str+=" ";
			}
			for(int j=num-i; j>=1 ; j--) {
				str+="*";
			}
			System.out.println(str);
		}
		sc.close();
	}
	
}