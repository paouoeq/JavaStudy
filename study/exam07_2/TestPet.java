package exam07_2;

public class TestPet {

	public static void main(String[] args) {
		
		// 1. 일반 객체 생성
		Cat c1 = new Cat("야옹이", 2);
		Dog d1 = new Dog("망치", 1, "수컷");
		Bird b1 = new Bird("까치", 1, "블랙");
		
		// 아래의 출력과 똑같이 출력하도록 만들거임
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(b1);
		
//		System.out.printf("Cat 이름: %s, Cat 나이:%d \n", c1.getName(), c1.getAge());
//		System.out.printf("Dog 이름: %s, Dog 나이:%d, Dog 성별:%s \n", d1.getName(), d1.getAge(), d1.getSex() );
//		System.out.printf("Bird 이름: %s, Bird 나이:%d, Bird 색상:%s \n", b1.getName(), b1.getAge(), b1.getColor());
		
	}

}
