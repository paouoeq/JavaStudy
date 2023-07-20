package exam07_5;

// 인터페이스
interface Y1 {
	
	// 상수
	final int NUM = 10; // 상수, 자동으로 public static final 지정됨.
	int SIZE = 20; // 인터페이스 안에서 변수처럼 선언 -> 변수처럼 보이는데 상수 => 자동으로 public static final 지정
	public static final int COUNT = 30;
	
	// 추상메서드 (인터페이스를 사용하는 가장 큰 목적)
	public abstract void a(); // 권장
	public void a2(); // public abstract 자동으로 지정
	void a3(); // default 가 아닌 public, 일반메서드가 아닌 abstract
	
	// default 메서드
	public default void b() {
		System.out.println("default 메서드");
	}
	
	// static 메서드
	public static void c() {
		System.out.println("static 메서드");
	}
}


interface Y2 {
	public abstract void x();
}

interface Y3 {
	public abstract void x2();
}

class K implements Y2 {
	
	public void x() {} // 추상메서드는 재정의 필수
}
class K2 implements Y2, Y3 {
	
	@Override
	public void x() {} // 추상메서드는 재정의 필수

	@Override
	public void x2() {}
}

// 인터페이스 간 상속 (다중상속)
interface Y4 extends Y2,Y3 {
	
}

// 상속 및 구현
class K3 extends Object implements Y2,Y3 {

	@Override
	public void x() {}

	@Override
	public void x2() {}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
//		Y2 y = new Y2(); // error -> interface는 객체 생성(new) 불가
		K k = new K();
		k.x();
		
		// 다형성(매우중요)
		Y2 k2 = new K();
		k2.x();
		
	}

}
