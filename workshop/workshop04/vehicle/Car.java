package vehicle;

public class Car extends Vehicle{
	private double restOil;
	private int curWeight;
	
	
	
	
	// 생성자
	public Car() {
		restOil = 0.0;
		curWeight = 0;
		// TODO Auto-generated constructor stub
	}
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		restOil = 0.0;
		curWeight = 0;
	}
	
	
	
	
	// 메소드
	public void addOil(int oil) {
		if(restOil+oil > super.getOilTankSize()) {
			System.out.println("잔여 공간이 없습니다.");
		}
		else {
			restOil += oil;
		}
	}
	
	public void moving(int distance) {
		restOil -= distance/super.getEfficiency();
	}
	
	public void addWeight(int weight) {
		if(curWeight+weight > super.getMaxWeight()) {
			System.out.println("너무 무겁습니다.");
		}
		else {
			curWeight += weight;
		}
	}
	
	public String toString() {
		String str = super.toSting()+String.format(" %-11.1f %-12d", restOil, curWeight);
		return str;
	}
	
	

	// getter/setter
	public double getRestOil() {
		return restOil;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public int getCurWeight() {
		return curWeight;
	}
	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	
	
	
	
	
	
	
}
