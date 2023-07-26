package workshop07.list2;

public class ListTest02 {

	public static void main(String[] args) {

		int[] array = {3,4,2,5,2,3,6,7,5,7,9};
		
		ConvertList cl = new ConvertList();
		cl.convertList(array);
		
		for(int n:cl.list) {
			System.out.println(n);
		}
	}

}
