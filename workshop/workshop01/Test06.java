package workshop01;

public class Test06 {
	
	public static void main(String[] args) {
		for (int d1=1; d1<=6; d1++) {
			for (int d2=1; d2<=6; d2++) {
				for (int d3=1; d3<=6; d3++) {
					if ((d1*d2*d3)%3==0) {
						System.out.println(d1+"*"+d2+"*"+d3+" = "+d1*d2*d3);
					}
				}
			}
		}
		
		
	}
	
}