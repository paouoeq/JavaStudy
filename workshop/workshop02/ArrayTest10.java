package workshop02;

import java.util.Random;

public class ArrayTest10 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		if(args.length != 2) {
			System.out.println("다시 입력 하세요");
			System.exit(0);
		}
		
		for(int i=0; i<args.length; i++) {
			if(Integer.parseInt(args[i]) > 5 || Integer.parseInt(args[i]) < 1) {
				System.out.println("숫자를 확인하세요");
				System.exit(0);		
			}
		}
		
		int[][] num = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
		float sum = 0.0f;
		int cnt = 0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = rd.nextInt(4)+1;
				System.out.print(num[i][j]+" ");
				sum+=num[i][j];
				cnt++;
			}
			System.out.println();
		}
		
		System.out.println("sum="+sum);
		System.out.println("avg="+(sum/cnt));
		
	}

}
