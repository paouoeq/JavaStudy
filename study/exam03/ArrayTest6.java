package exam03;

public class ArrayTest6 {

	public static void main(String[] args) {

		// 1. 2차원 배열 출력
		
		// 가. 배열선언
		int[][] n;
		
		// 나. 배열 생성
		n = new int[3][2];
		
		System.out.println("행의 길이:"+n.length); // 행의 길이:3
		System.out.println("1행의 열의 길이:"+n[0].length); // 1행의 열의 길이:2
		
		// 0으로 자동 초기화 확인
		System.out.println(n[0][0]); // 0
		System.out.println(n[0][1]); // 0
		
		// 배열의 모든 값 출력하기
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.println(">> "+n[i][j]);
			}
		}
		
		// 명시적 초기화
		n[0][0] = 1;
		n[0][1] = 2;
		n[1][0] = 3;
		n[1][1] = 4;
		n[2][0] = 5;
		n[2][1] = 6;
		
		// for-each 사용해서 값 출력하기
		for(int[] k:n) {
			for(int l:k) {
				System.out.println("^^ "+l);
			}
		}
	}

}
