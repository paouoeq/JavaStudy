package com.car;

public class L3 extends Car implements Temp {

	// 생성자
	public L3() {
		// TODO Auto-generated constructor stub
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	
	// 메서드
	@Override
	public void go(int distance) {
		setOilSize(getOilSize() - (int)(distance/10));
		setDistance(getDistance()+distance);
	}

	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize() + oilSize);
	}

	@Override
	public int getTempGage() {
		int tem = (int)(getDistance()/10);
		return tem;
	}

	@Override
	public String toString() {
		return super.toString()+"\t\t "+getTempGage();
	}
	
	
	
}
