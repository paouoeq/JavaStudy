package exam03;

public class ArrayTest7 {

	public static void main(String[] args) {

		// 1. 2차원 배열 - 비정방형
		
		int[][] n = new int[2][];
		n[0] = new int[1];
		n[1] = new int[2];
		
		System.out.println(n[0][0]);
		System.out.println(n[1][0]);
		System.out.println(n[1][1]);
		
		System.out.println("행길이:"+n.length); // 행길이:2
		System.out.println("2행 열길이:"+n[1].length); // 2행 열길이:2
		
		//초기화
		n[0][0]=1;
		n[1][0]=2;
		n[1][1]=3;
		
		for (int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
		
	} 
	
}
