package workshop07.list3;

import java.util.ArrayList;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			list.add(r.nextInt(10));
			list2.add(r.nextInt(10));
			
			try {
				int div = list.get(i)/list2.get(i);
				System.out.println(list.get(i)+"/"+list2.get(i)+" "+div);
				
			}catch(ArithmeticException e) {
				System.out.println(list.get(i)+"/"+list2.get(i)+" 분모가 0입니다.");
			}
		}
	}
 
}
