package workshop07.mobile;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Mobile> map = new HashMap<String,Mobile>();
		double sum = 0.0;
		
		map.put("LU6800", new Mobile("LU6800","Optimus 2X",800000));
		map.put("SU6600", new Mobile("SU6600","Optimus Black",900000));
		map.put("KU5700", new Mobile("KU5700","Optimus Big",700000));
		map.put("SU7600", new Mobile("SU7600","Optimus Mach",950000));
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(map.get(key).printInfo());
			sum += map.get(key).getPrice();
		}
		System.out.println("합계 : "+sum);
		
		for(String key : keys) {
			double prc = map.get(key).getPrice();
			map.get(key).setPrice(prc+prc*0.1);
		}
		
		
		
		sum = 0.0;
		System.out.println("\n가격 변경 후");
		for(String key : keys) {
			System.out.println(map.get(key).printInfo());
			sum += map.get(key).getPrice();
		}
		System.out.println("합계 : "+sum);
		
	}

}
