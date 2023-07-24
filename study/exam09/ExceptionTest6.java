package exam09;

import java.io.IOException;

class Parent {
	public void a() throws RuntimeException {}
	public void b() throws RuntimeException {}
	public void c() throws RuntimeException {}
}

class Child extends Parent {
	public void a() {} // 재정의는 같거나 축소하는 형태로 가능 (없는 것도 축소에 포함임)
	public void b() throws ArithmeticException {} // 하지만 크게는 안됨(Exception이 RuntimeException보다 상위 클래스)
//	public void c() throws IOException {} // 같은 계열만 사용 가능. Runtime과 IO는 다른 계열(확대개념) -> 오류
}

public class ExceptionTest6 {

	public static void main(String[] args) {
		
		
	}

}
