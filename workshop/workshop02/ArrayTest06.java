package workshop02;

import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 :");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		int max = 0;
		
		for (int i=0; i<num; i++) {
			System.out.printf("사람 %d:",(i+1));
			height[i] = sc.nextInt();
		}
		
		for(int h:height) {
			if(h>max) {
				max=h;
			}
		}
		
		System.out.printf("최댓값은 %d입니다.",max);
		
		sc.close();
	}

}
