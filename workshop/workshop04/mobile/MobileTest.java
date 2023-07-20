package mobile;

public class MobileTest {
	public static void main(String[] args) {
		
		// 각각의 Mobile 객체를 생성한다
		Mobile l = new Ltab("Ltab", 500, "AP-01");
		Mobile o = new Otab("Otab", 1000, "AND-20");
		
		// 생성된 객체의 정보를 출력한다.
		System.out.printf("Mobile\t Battery  OS\t\n");
		System.out.println("-----------------------------");
		System.out.println(l);
		System.out.println(o);
		
		// 각각의 Mobile 객체에 10분씩 충전을 한다. 
		l.charge(10);
		o.charge(10);
		// 10분 충전 후 객체 정보를 출력한다.
		System.out.println("\n10분 충전");
		System.out.printf("Mobile\t Battery  OS\t\n");
		System.out.println("-----------------------------");
		System.out.println(l);
		System.out.println(o);
		
		
		// 각각의 Mobile 객체에 5분씩 통화를 한다.
		l.operate(5);
		o.operate(5);
		// 5분 통화 후 객체 정보를 
		System.out.println("\n5분 통화");
		System.out.printf("Mobile\t Battery  OS\t\n");
		System.out.println("-----------------------------");
		System.out.println(l);
		System.out.println(o);
		
	}
}
