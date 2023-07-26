package workshop07.list;

import java.util.ArrayList;
import java.util.Random;

public class MakeList {

	ArrayList<Integer> list;
	
	public MakeList() { // 기본생성자 - ArrayList 생성
		list = new ArrayList<>();
	}
	
	public void makeArrayList(int size) { // Size만큼의 정수형 데이터를 랜덤하게 만들어 ArrayList에 넣는다.
		Random r = new Random();
		for(int i=0; i<size; i++) {
			list.add(r.nextInt(10)+10);
		}
	}
	
	public double getAverage() { // ArrayList에 셋팅 된 정수들의 평균을 리턴한다.
		int sum = 0;
		for(int n : list) {
			sum+=n;
		}
		return (double)sum/list.size();
	}
	
	public ArrayList<Integer> getList() { // ArrayList 정보를 리턴한다.
		return list;
	}
	

	
}
