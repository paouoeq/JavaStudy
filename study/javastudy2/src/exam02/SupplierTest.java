package exam02;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.jar.Attributes.Name;

public class SupplierTest {

	public static void main(String[] args) {

		// 익명클래스
		Supplier<String> s = new Supplier<String>() {
			
			@Override
			public String get() {
				return "홍길동";
			}
		};
		System.out.println("Supplier : "+s.get());
		
		// 람다 표현식 : return 문장만 있으면 중괄호와 return 생략 가능
		Supplier<String> s2 = () -> "홍길동";
		System.out.println("람다 표현식 Supplier : "+s2.get());
		
		////////////////////////////////////////////////////////////
		
		// BooleanSupplier
		
		// 익명 클래스
		int num = 10;
		BooleanSupplier bs = new BooleanSupplier() {
			
			@Override
			public boolean getAsBoolean() {
				return num%2==0;
			}
		};
		System.out.println("BooleanSupplier : " + bs.getAsBoolean());
		
		// 람다 표현식
		BooleanSupplier bs2 = () -> num%2!=0;
		System.out.println("BooleanSupplier : " + bs2.getAsBoolean());
		
		////////////////////////////////////////////////////////////
				
		// IntSupplier
		
		// 익명 클래스
		String name="홍길동";
		IntSupplier is = new IntSupplier() {
			
			@Override
			public int getAsInt() {
				return name.length();
			}
		};
		System.out.println("name 문자열 길이 : " + is.getAsInt());
		
		// 람다 표현식
		IntSupplier is2 = () -> name.length();
		System.out.println("람다 표현식 name 문자열 길이 : " + is2.getAsInt());
	}
}
