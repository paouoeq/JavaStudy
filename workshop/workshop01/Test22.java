package workshop01;

public class Test22 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<6; i++) {
			for (int j=0; j<i; j++) {
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}
		
	}
	
}