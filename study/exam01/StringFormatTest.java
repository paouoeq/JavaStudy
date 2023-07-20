package exam01;

public class StringFormatTest {

	public static void main(String[] args) {
		
		// 포맷 출력
		// 1. String.format(String 형식문자, Object ... 값들)
		String result = String.format("이름:%s, 나이:%d, 신장:%.2f, 성별:%c, 결혼:%b", "홍길동", 20, 167.2389652, '남', true);
		System.out.println(result);
		
		// 2. printf
		System.out.printf("이름:%s, 나이:%d, 신장:%.3f, 성별:%c, 결혼:%b", "홍길동",20, 167.2389652, '남', true);
		
	}

}
