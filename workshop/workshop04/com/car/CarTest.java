package com.car;

public class CarTest {

	public static void main(String[] args) {

		Car[] c = new Car[2];
		c[0] = new L3("L3", "1500", 50, 25, 0);
		c[1] = new L5("L5", "2000", 70, 35, 0);

		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println(c[0]);
		System.out.println(c[1]);
		
		
		// 25 주유
		c[0].setOil(25);
		c[1].setOil(25);
		System.out.println("\n25 주유");
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println(c[0]);
		System.out.println(c[1]);
		
		
		
		// 80 주행
		c[0].go(80);
		c[1].go(80);
		System.out.println("\n80 주행");
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println(c[0]);
		System.out.println(c[1]);
	}

}
