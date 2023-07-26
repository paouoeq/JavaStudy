package workshop07.list;

import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); // argument로 정수를 받는다.
		
		MakeList m = new MakeList(); // MakeLsit 객체 생성
		m.makeArrayList(num); // 무작위의 번호 발생 후 저장
		
		ArrayList<Integer> list = m.getList(); // ArrayList 생성
		for(int n : list) { // for-each 이용하여 ArrayList의 정보 출력
			System.out.print(n+" ");
		}
		System.out.println("\n평균 : "+m.getAverage()); // 평균 출력
	}

}
