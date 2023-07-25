package exam10_2;

import java.util.Date;

// 제네릭스 등장배경 -> Object 타입을 사용했을 때 이슈 발생

class Box2<T> { // 클래스에 제네릭스 적용
	T obj;
	
	public void setValue(T obj) {
		this.obj = obj;
	}
	
	public T getValue() {
		return obj;
	}
}

public class GenericsTest2 {

	public static void main(String[] args) {
		
		// 문자열만 저장
		Box2<String> x = new Box2<>();
		Box2<String> b1 = new Box2<String>();
		b1.setValue("홍길동");
//		b1.setValue(13); 					// 장점1: 컴파일시에 잘못된 데이터를 저장했음을 안다.
		String str = b1.getValue();			// 장점2: 형변환 불필요
		System.out.println("문자열 길이: "+str.length());
		
		
		// 날짜만 저장
		Box2<Date> b2 = new Box2<Date>();
		b2.setValue(new Date());
//		b2.setValue(3); 					// 장점1: 컴파일시에 잘못된 데이터를 저장했음을 안다.
		Date d = b2.getValue(); 			// 장점2: 형변환 불필요
		System.out.println("날짜: "+d.getYear()); 
	}

}
