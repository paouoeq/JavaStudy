package exam07;

public class TestPet3 {
	
	// 다형성 적용 X
//	public static void a() {	
//	}
//	public static void a(Cat c) {	
//	}
//	public static void a(Dog d) {	
//	}
//	public static void a(Bird b) {	
//	}
	
	// 다형성 적용
	public static void a(Pet p) {	
	}

	// 확장 : Object
	public static void b(Object obj) {	
	}
	
	public static void main(String[] args) {

		// 다형성 활용
		Cat c1 = new Cat("야옹이", 2);
		Dog d1 = new Dog("망치", 1, "수컷");
		Bird b1 = new Bird("까치", 1, "블랙");
		
		a(c1);
		a(d1);
		a(b1);
		
		// 확장
		b(10);
		b(3.14);
		b(true);
		b(c1);
		b("hello");
	}

}
