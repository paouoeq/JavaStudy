package vehicle;

public class Vehicle {
	
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;


	// 생성자
	public Vehicle() {
		maxWeight = 1000;
		oilTankSize = 100.0;
		efficiency = 5.0;
	}


	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}


	
	
	// 메서드
	public String toSting() {
		String str = String.format("%-11s %-12.1f", maxWeight, oilTankSize);
		return str;
	}
	
	
	
	
	// Getter/Setter
	public int getMaxWeight() {
		return maxWeight;
	}
	
	
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	
	public double getOilTankSize() {
		return oilTankSize;
	}
	
	
	public void setOilTankSize(double oilTankSize) {
		this.oilTankSize = oilTankSize;
	}
	
	
	public double getEfficiency() {
		return efficiency;
	}
	
	
	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
}
