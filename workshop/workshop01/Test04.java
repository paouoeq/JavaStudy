package workshop01;

public class Test04 {
	
	public static void main(String[] args) {
		
//		for (int i=1,j=5; i<6; i++,j--) {
//			System.out.println(i+"+"+j+"="+(i+j));
//		}
		
		for (int d1=1; d1<=6; d1++) {
			for (int d2=1; d2<=6; d2++) {
				if (d1+d2==6) {
					System.out.println(d1+"+"+d2+"="+(d1+d2));
				}
			}
		}
		
	}
	
}