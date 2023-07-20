package calc;

public class TestCalc {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		if (n<5 || n>10) {
			System.out.println("다시 입력하세요");
			System.exit(0);
		}
		
		Calc c = new Calc();
		
		System.out.println("결과: "+c.calculate(n));
		
	}
}
