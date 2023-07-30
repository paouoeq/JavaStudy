package project01;

public class TransTest {

	public static void main(String[] args) {
		
		Student james = new Student("James", 5000);
		Student bit = new Student("Bit",10000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.info();
		bus100.info();
		
		Subway subgreen = new Subway(2);
		bit.takeSubway(subgreen);
		bit.info();
		subgreen.info();
		
		james.takeSubway(subgreen);
		james.info();
		subgreen.info();
		
	}

}
