package workshop07.ship;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		
		ArrayList<Ship> list = new ArrayList<>();
		list.add(new Boat("Boat01",500));
		list.add(new Cruise("Cruise01",1000));
		
		System.out.println("shipName\tfuelTank\n-------------------------------");
		for(Ship s : list) {
			System.out.println(s.getShipName()+"\t"+s.getFuelTank());
		}
		
		list.get(0).sail(10);
		list.get(1).sail(15);
		System.out.println("\n운항");
		System.out.println("shipName\tfuelTank\n-------------------------------");
		for(Ship s : list) {
			System.out.println(s.getShipName()+"\t"+s.getFuelTank());
		}		
		
		list.get(0).refuel(20);
		list.get(1).refuel(30);
		System.out.println("\n주유");
		System.out.println("shipName\tfuelTank\n-------------------------------");
		for(Ship s : list) {
			System.out.println(s.getShipName()+"\t"+s.getFuelTank());
		}
		
	}

}