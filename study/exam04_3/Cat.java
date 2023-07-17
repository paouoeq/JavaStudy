package exam04_3;

public class Cat {
	
	// 인스턴스 변수
	String name;
	int age;
	String sex;
	
	// 생성자
	public Cat() {
		
	}
	
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	// 메서드
	
	// getter 메서드
	// 이름얻기
	public String getName() {
		return name;
	}
	// 나이얻기
	public int getAge() {
		return age;
	}
	// 성별얻기
	public String getSex() {
		return sex;
	}
	
	
	// setter 메서드
	// 이름수정
	public void setName(String name) {
		this.name = name;
	}
	// 나이수정
	public void setAge(int age) {
		this.age = age;
	}
	// 성별수정
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}