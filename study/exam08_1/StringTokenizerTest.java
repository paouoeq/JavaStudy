package exam08_1;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) throws Exception{

		// 1. 기본 형태
		String s = "aaa/bbb/ccc";
		StringTokenizer st = new StringTokenizer(s, "/");
		
		// 토큰 갯수 : countTokens
		System.out.println("token 갯수 : "+st.countTokens()); // 3
		
		
		// 토큰 출력 : nextToken
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); // aaa \n bbb \n ccc
		}
		
		// 2. mix 형태
		String s2 = "A,av,xx;E|XX/yy";
		StringTokenizer st2 = new StringTokenizer(s2, "/,;|");
		
		// 토큰 갯수 : countTokens
		System.out.println("token 갯수 : "+st2.countTokens()); // 2
		
		// 토큰 출력 : nextToken
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken()); // A \n av \n xx \n E \n XX \n yy
		}
		
	}

}
