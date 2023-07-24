package exam09;

import java.util.Random;

class MyRandom {
	public void rand() throws RuntimeException {
		Random r = new Random();
		int n = r.nextInt(3); // 0~2 랜덤 정수 반환
		
		// 상황 가정 : 0이 나오면 시스템에 불량이 생겨 예외처리를 해줘야 하는 상황
		if(n==0) throw new RuntimeException("랜덤값에 0 출력. 예외발생"); // "" 안의 메세지는 e.getMaessage로 얻어올 수 있음
		System.out.println(n);
	}
}

public class ExceptionTest7 {

	public static void main(String[] args) {
		
		MyRandom x = new MyRandom();
		try {
			x.rand();
		} catch(RuntimeException e) {
			System.out.println("error 발생 "+e.getMessage()); // error 발생 랜덤값에 0 출력. 예외발생
		} catch(Exception e) {
			System.out.println("error 발생");
		}
		System.out.println("END");
		
	}

}
