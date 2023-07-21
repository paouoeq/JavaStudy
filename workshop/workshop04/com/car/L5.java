package com.car;

public class L5 extends Car implements Temp {

	// 생성자
	public L5() {
		// TODO Auto-generated constructor stub
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}
	
	
	// 메서드
	@Override
	public void go(int distance) {
		setOilSize(getOilSize() - (int)(distance/8));
		setDistance(getDistance()+distance);

	}
	
	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize() + oilSize);

	}
	
	@Override
	public int getTempGage() {
		int tem = (int)(getDistance()/5);
		return tem;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t\t "+getTempGage();
	}

}
