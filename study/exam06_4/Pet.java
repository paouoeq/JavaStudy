package exam06_4;

// Cat, Dog, Bird의 부모 클래스
public class Pet {
	
	String name;
	int age;
	
	// 생성자
	public Pet() {
		System.out.println("Pet 생성자");
	}
	public Pet(String name, int age) {
		System.out.println("Pet 생성자2");
		this.name = name;
		this.age = age;
	}
		
	
	// 메서드	
	public void eat() {
		System.out.println("Pet.eat");
	}
	public void sleep() {
		System.out.println("Pet.sleep");
	}
	
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
