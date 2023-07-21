package com.car;

public abstract class Car {

	private String name;
	private String engine;
	private int oilTank; // 자동차의 기본적인 주유 가능 사이즈
	private int oilSize; // 자동차에 현재 주유 되어진 양, 최초에는 반만 주유
	private int distance; // 자동차의 주행 거리, 초기값 0
	
	
	// 생성자
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	
	public abstract void go(int distance);
	public abstract void setOil(int oilSize);
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getOilTank() {
		return oilTank;
	}
	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}
	public int getOilSize() {
		return oilSize;
	}
	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	@Override
	public String toString() {
		return getName()+"\t\t "+getEngine()+"\t\t "+getOilTank()+"\t\t "+getOilSize()+"\t\t "+getDistance();
	}
	

	
}
