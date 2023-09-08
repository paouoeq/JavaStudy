import java.util.Stack;

public class Algo03_선형구조_07_Stack2_API이용 {
	public static void main(String[] args) {
		
		Stack<Integer> x = new Stack<Integer>();
		x.push(5);
		x.push(4);
		x.push(3);
		x.push(2);
		x.push(1);
		
		System.out.println(x); // [5, 4, 3, 2, 1]
		
		int n = x.pop();
		System.out.println(n+" "+x); // 1 [5, 4, 3, 2]
		
		System.out.println("top값 : "+x.peek()); // top값 : 2
	}
}
