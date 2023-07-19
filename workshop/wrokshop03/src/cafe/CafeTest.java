package cafe;

public class CafeTest {

	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		cafe.setCoffee(new Coffee("Americano",4000));
		cafe.setCoffee(new Coffee("Caffelatte",5000));
		cafe.setCoffee(new Coffee("Macchiato",6000));
		
		for(int i=0; i<cafe.getCoffeeList().length; i++) {
			System.out.printf("%-15s%s\n",cafe.getCoffeeList()[i].getName(),cafe.getCoffeeList()[i].getPrice());
			
		}
		System.out.println("\nCoffee 가격의 합 : "+cafe.totalPrice());
	}

}
