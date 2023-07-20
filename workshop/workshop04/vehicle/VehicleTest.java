package vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		
		Truck car = new Truck();
		System.out.printf("%-15s %-15s %-15s %-15s %-15s\n","최대적재충장","오일탱크크기","장여오일량","현재적재중량","연비");
		System.out.println("==============================================================");

		System.out.println(car.toString());
		car.addOil(50);
		System.out.println("\n50L 주유 후");
		System.out.println(car.toString());
		car.moving(50);
		System.out.println("\n50Km 주행 후");
		System.out.println(car.toString());
		car.addWeight(100);
		System.out.println("\n100Kg 적재 후");
		System.out.println(car.toString());
		car.moving(30);
		System.out.println("\n30Km 주행 후");
		System.out.println(car.toString());
		
		
	}

}
