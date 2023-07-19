package exam05_2;

class Count {
	
	int n; // 인스턴스 변수 : 객체 생성할 때마다 매번 생성됨
	static int num; // static 변수 : 프로그램 실행할 때 한번 생성됨, 이탤릭체
	
	public Count() {
		n++; // 객체 생성 할 때마다 count 하고싶음! - 실패
		num++; // static 변수를 이용해서 count - 성공
	}
	
	public void n_print() { // 인스턴스 메서드
		System.out.println("n: "+n); // 인스턴스 변수 접근 가능
		System.out.println(" num: "+num); // static 변수 접근 가능
	}
	
	public static void num_print() { // static 메서드
//		System.out.println("n: "+n); // 인스턴스 변수 접근 불가능
//		System.out.println(this); // this 접근 불가능 (this:heap 메모리에 만들어진 자기 자신 -> 인스턴스화 함께 생성)		
		System.out.println(" num: "+num); // static 변수 접근 가능
	}
} // end Class

public class TestMain {
	public static void main(String[] args) {
		
		// static은 new 전에 접근 가능 : 클래스명으로 접근
		System.out.println(Count.num); // 0 -> 자동초기화
		Count.num_print(); // new 하지 않고 메서드 사용 가능
		
		// Count 객체 생성을 몇번 했는지?
		Count c = new Count();
		c.n_print(); // 1, 1
		
		Count c2 = new Count();
		c2.n_print(); // 1, 2 => 새로운 객체 생성 -> 새로운 인스턴스 변수 생성됨 -> c의 n과 c2의 n은 별개
//							  => static은 한번만 생성, 객체 생성에 영향을 받지 않음, 따라서 누적 가능
	}
}
