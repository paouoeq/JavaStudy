package exam04_1;

public class Cat {

	String name;
	int age;
	String sex;
	
	// 생성자 - 오버로딩
	public Cat() { } // 기본생성자(default constructor)
	public Cat(String n) { }
	public Cat(int a) { }
	public Cat(String n, int a) { }
	public Cat(int a, String n) { }
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	
}
