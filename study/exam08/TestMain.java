package exam08;

interface Flyer {
	public abstract void fly();
}

// 이름있는 클래스
class Bird implements Flyer {
	@Override
	public void fly() {
		System.out.println("Bird.fly");
		
	}
}
public class TestMain {
	
	public static void main(String[] args) {
		
		// 1. 이름 있는 클래스 사용한 경우
		Flyer f = new Bird();
		f.fly();
		
		// 2. 이름 없는 클래스(익명클래스) 사용한 경우
		/*
		 * 		인터페이스명 변수명 = new 인터페이스명() {
		 * 			// 추상매서드 재정의
		 * 		}
		 */
		
		Flyer f2 = new Flyer() {
			public void fly() {
				System.out.println("익명클래스.fly");
			}
		};
		f2.fly();
		
	}

}

