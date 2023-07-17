package workshop02;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0; i<height.length; i++) {
			height[i] = random.nextInt(100)+100;
			System.out.printf("사람 %d: %d",i+1, height[i]);
			System.out.println();
		}
		
		int max = 0;
		
		for(int i:height) {
			if(i>max) {
				max = i;
			}
		}
		
		System.out.printf("최댓값은 %d입니다.", max);
		
		sc.close();

	}

}
