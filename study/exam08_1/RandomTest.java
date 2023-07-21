package exam08_1;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {

		// 랜덤값 얻기
		Random r = new Random();
		
		// 랜덤값 고정 ==> seed 고정 => seed가 동일하면 같은 랜덤 값 추출
		r.setSeed(1234);
		
		System.out.println("1. 임의의 정수값 : "+r.nextInt());

		System.out.println("2. 지정된 범위 내의 랜덤 정수값 : "+r.nextInt(3)); // 0,1,2 중 랜덤으로 반환  / 범위 : 0 ~ n-1
		System.out.println("2. 지정된 범위 내의 랜덤 정수값 : "+(r.nextInt(10)+1)); // 1 ~ 10
		
		System.out.println("3. 임의의 논리값 : "+r.nextBoolean());
		
		System.out.println("3. 임의의 실수값 : "+r.nextDouble());
		System.out.println("3. 임의의 실수값 : "+r.nextFloat());
		StringBuilder a = new StringBuilder("hi");
	}

}
