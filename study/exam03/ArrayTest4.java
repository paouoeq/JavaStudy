package exam03;

import java.util.Arrays;

public class ArrayTest4 {

	public static void main(String[] args) {

		// 1차원 배열 출력
		
		int[] n = new int[] {10,20,30,40};
		
		// 1) 개별적으로 idx 이용
		System.out.print(n[0]+" ");
		System.out.print(n[1]+" ");
		System.out.print(n[2]+" ");
		System.out.print(n[3]+" ");
		System.out.println();
		
		// 2) 일반 for문
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
		
		// 3) for-each문 - JS의 for-of, python의 for 변수 in 배열과 동일
		/*
		 * 		for(변수:배열명) {
		 * 			
		 * 		}
		 */
		for(int k:n) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		// 4) 배열을 한번에 문자열로 출력 => java.util.Arrays 클래스 이용
		System.out.println(Arrays.toString(n));
	}

}
