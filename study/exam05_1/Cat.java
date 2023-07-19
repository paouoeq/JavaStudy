package exam05_1;

public class Cat {
	
	// 접근지정자 default 생략
	//String name;
	
	// private : Cat 클래스의 데이터 보호
	private String name;
	protected int age;
	private String sex;

	public Cat() {}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	// 가정 - info 메서드는 외부에서 전혀 사용하지 않음. 같은 클래스의 setName 메서드만 사용
	// 외부에는 hide -> 외부 입장에서는 복잡성이 강조된다.
	/*
	 *  은닉화(캡슐화, encapsulation)
	 *  1. 데이터 보호
	 *  2. 복잡성 감소 효과
	 */
	private void info() {
		System.out.println("info");
	
	}
}
