package workshop01;

import java.util.Scanner;

public class Test20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("보너스 및 월급 구하기");
		System.out.print("근무시간입력 : ");
		int time = sc.nextInt();
		System.out.print("월급입력 : ");
		int money = sc.nextInt();
		System.out.println("==============");
		
		int bns;
		if(time >= 25) {
			bns = (int)(money*1.0);
		}
		else if(time >= 20) {
			bns = (int)(money*0.8);
		}
		else if(time >= 18) {
			bns = (int)(money*0.5);
		}
		else {
			bns = 0;
		}
		
		System.out.println("보너스 : "+bns);
		System.out.println("지금될 급여 : "+(money+bns));
		
		sc.close();
	}
	
}