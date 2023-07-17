package exam04;

// Cat과 같은 main 없는 재사용 클래스 관리 목적
public class TestPaet {

	public static void main(String[] args) {
		
		// 고양이: 야옹이, 2살, 암컷
		
		// 객체생성
		// 클래스명 변수명 = new 클래스명();
		Cat c = new Cat(); // 변수/참조변수(Cat(Class) 타입의 참조 변수)/로컬변수(Stack에 생성)/
		
		// 멤버접근
		c.name = "야옹이";
		c.age = 2;
		c.sex = "암컷";
		
		System.out.println(c.name); // 양옹이
		System.out.println(c.age); // 2 
		System.out.println(c.sex); // 암컷
		

		// 고양이: 망치, 1살, 수컷
		
		// 객체생성
		Cat c2 = new Cat();
		
		// 멤버접근
		c2.name = "망치";
		c2.age = 1;
		c2.sex = "수컷";
		
		System.out.println(c2.name); // 망치
		System.out.println(c2.age); // 1 
		System.out.println(c2.sex); // 수컷
	}

}
