package cafe;

public class Cafe {

	private Coffee[] coffeeList = new Coffee[3];
	private static int index=0;
	
	public Cafe() {}
	
	public void setCoffee(Coffee coffee) {
		if(index>=3) {
			System.out.println("더 이상 저장할 수 업습니다");
		} else {
			coffeeList[index] = coffee;
			index++;
		}
	}
	
	public int totalPrice() {
		int sum=0;
		for(int i=0; i<3; i++) {
			sum+=coffeeList[i].getPrice();
		}
		return sum;
	}

	public Coffee[] getCoffeeList() {
		return coffeeList;
	}
}
