package exam04_2;

// 생성자를 자동으로 생성하는 방법

public class Cat {

	String name;
	int age;
	String sex;
	
	
	public Cat() {
		
	}


	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}


	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}
