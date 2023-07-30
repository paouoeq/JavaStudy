package project01;

public class Subway {
	private int sNum;
	private int pCount = 0;
	private int money;
	
	
	public Subway() {}
	
	public Subway(int sNum) {
		this.sNum = sNum;
		this.pCount=0;
		this.money=0;
	}


	public void take() {
		pCount++;
		money += 1500;
		
	}
	
	public void info() {
		System.out.println("지하철 "+sNum+"호선의 승객은 "+pCount+"명이고, 지하철 수입은 "+money+"원 입니다.");
	}
	
}
