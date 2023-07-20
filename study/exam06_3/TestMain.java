package exam06_3;

class Parent {
	int age = 20;
}

class Child extends Parent {
	int age = 10;
	
	public void info() {
		System.out.println(age); // 10 -> 가까운 age 찾아감 -> this.age
		System.out.println(super.age); // 20 -> super로 부모의 age 명시해줌
	}
}

public class TestMain {

	public static void main(String[] args) {
		
		Child c = new Child(); // -> Child의 부모인 Parent 생성하려 할 때, Parent가 그의 부모인 Object를 생성
							   // -> 그 후 Parent 생성 -> 마지막으로 Child 생성
		c.info();

	}
}