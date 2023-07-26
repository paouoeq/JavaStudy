package workshop07.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ListHashSet {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int size = Integer.parseInt(args[0]);
		
		ArrayList<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<size; i++) {
			list.add(r.nextInt(10)+1);
			System.out.print(list.get(i)+" ");
			
			set.add(list.get(i));
		}
		
		System.out.println("\n"+set);
		 
	}

}
