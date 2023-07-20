package exam07_3;

public class Cat extends Pet {

	public void run() {
		System.out.println("Cat.run");
	}
	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}
	
	// 생성자
	public Cat() {}
	
	public Cat(String name, int age) { // 인자 받아서 부모에게 넘겨줌
		super(name, age);
	}
	
	@Override
	public String toString() {
		return String.format("Cat 이름: %s, Cat 나이:%d \n", name, age);
	}
	
}
