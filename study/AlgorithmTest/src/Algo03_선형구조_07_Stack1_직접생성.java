import java.util.Arrays;

class MyStack {
	int top;
	int size;
	int[] stack;

	public MyStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1; // 초기값
	}
	
	// 저장
	public void push(int n) {
		stack[++top] = n;
		System.out.println(stack[top]+" push");
	}
	
	// 삭제
	public int pop() {
		System.out.println(stack[top]+" pop");
		int n = stack[top];
		stack[top--] = 0;
		return n;
	}
	
	// 현재 top에 있는 값 반환
	public int peek() {
		return stack[top];
	}
	
}
public class Algo03_선형구조_07_Stack1_직접생성 {
	public static void main(String[] args) {
		
		MyStack x = new MyStack(5);
		x.push(5);
		x.push(4);
		x.push(3);
		x.push(2);
		x.push(1);
		
		System.out.println(Arrays.toString(x.stack));
		System.out.println("peek : "+x.peek());
		System.out.println(x.size);
		for(int i=0; i<x.size; i++) {
			x.pop();
		}
		
	}
}
