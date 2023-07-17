package exam04_3;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("야옹이", 2, "암컷");
		
		// 출력1 - 인스턴스 변수 직접 접근(권장안함)
		System.out.println(c.name+" / "+c.age+" / "+c.sex);
		
		// 출력2 - getter 메서드 이용 접근
		String name = c.getName();
		int age = c.getAge();
		System.out.println(name+" / "+age+" / "+c.getSex());
		
		// 수정1 - 인스턴스 변수 직접 수정(권장안함)
		c.name = "망치";
		c.age = 1;
		c.sex = "수컷";
		System.out.println(c.getName()+" / "+c.getAge()+" / "+c.getSex());
		
		// 수정2 - setter 메서드 이용 수정
		c.setName("나비");
		c.setAge(3);
		c.setSex("암컷");
		System.out.println(c.getName()+" / "+c.getAge()+" / "+c.getSex());
	}

}
