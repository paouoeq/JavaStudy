package workshop01;

public class Test08 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			String str = ""+i;
			if(i%3==0) {
				str+=" foo";
			}
			if(i%5==0) {
				str+=" bar";
			}
			if(i%7==0) {
				str+=" baz";
			}
			System.out.println(str);
		}
		
	}
	
}