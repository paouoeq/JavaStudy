package exam06_4;

// Cat is a Pet ==> 상속관계
public class Cat extends Pet{
	public void run() {
		System.out.println("Cat.run");
	}
	
	// 메서드 재정의 (overriding)
	@Override // @으로 시작하는 코드를 어노테이션(annotation)이라고 부른다.
	public void eat() {
		System.out.println("Cat.eat");
	}
	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	// 생성자
	public Cat() {
		// 첫 라인에서 super([값]); 형태의 코드 삽입 -> 명시적 부모 생성자 호출
		super(); // 자동 삽입
		System.out.println("Cat 생성자");
	}
	public Cat(String name, int age) {
//		super(); // 자동삽입
		super(name, age); // this로 초기화하는 대신 아예 부모 클래스의 변수이기 때문에 부모 쪽에서 초기화 시키도록 만듦
		System.out.println("Cat 생성자2");
		
		// 부모에서 선언된 변수를 자식이 초기화 시키는 중
//		this.name = name; 
//		this.age = age;
		
		System.out.println(this.name);
	}
	
}
