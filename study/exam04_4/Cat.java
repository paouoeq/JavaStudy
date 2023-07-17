package exam04_4;

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
	
	
	// 메서드 오버로딩
	// 이름과 나이 한번에 수정하는 메서드
	public void setCat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 나이와 성별을 한꺼번에 수정하는 메서드
	public void setCat(int age,String sex) {
		this.age = age;
		this.sex = sex;
	}
	
	// 이름, 나이, 성별 한꺼번에 수정하는 메서드
	public void setCat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	// getter+setter
	public String getCat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		return name+" "+age+" "+sex;
	}
	
	// 리터타입은 void 인데  return 키워드 사용하는 경우
	public void xxx() {
		System.out.println("xxx1");
		if(true) return;
		System.out.println("xxx2");
		System.out.println("xxx3");
	}
	
	
	// 자동형변환: byte>short>int>long>float>double
	public void yyy(double n) {
		this.xxx(); // 메서드 안에서 다른 메서드 호출, this 생략 가능
	}
	
	
}
