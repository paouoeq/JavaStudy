package workshop07.list2;

import java.util.ArrayList;

public class ConvertList {

	ArrayList<Integer> list = new ArrayList<>();
	
	public ArrayList<Integer> convertList(int[] array) {
		for(int i=(array.length-1); i>=0; i--) {
			list.add(array[i]);
		}
		return list;
	}

}
