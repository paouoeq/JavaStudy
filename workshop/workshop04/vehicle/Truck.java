package vehicle;

public class Truck extends Car {

	// 생성자
	public Truck() {
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	
	// 메소드
	public double getEfficiency() {
		double newEf = super.getEfficiency() - (int)(super.getCurWeight()/5)*0.2;
		//super.setEfficiency(super.getEfficiency() - (int)(super.getCurWeight()/5)*0.2);
		return newEf;
	}
	
	public void moving(int distance) {
		super.setRestOil(super.getRestOil() - calcOil(distance));
		
	}
	
	private double calcOil(int distance) {
		double reduce = distance/getEfficiency();
		return reduce;
	}
	
	public int getCost(int distance) {
		int cost = (int)(super.getRestOil())*3000;
		return cost;
	}
	
	public String toString() {
		String str = super.toString()+String.format("%-12.1f", getEfficiency());
		return str;
	}
	

	
}
