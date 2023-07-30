package project01;

public class Bus {
	private int bNum;
	private int pCount;
	private int money;
	
	
	public Bus() {}
	

	public Bus(int bNum) {
		this.bNum = bNum;
		this.pCount=0;
		this.money=0;
	}

	public void take() {
		pCount++;
		money += 1000;
	}
	
	public void info() {
		System.out.println("버스 "+bNum+"번의 승객은 "+pCount+"명이고, 버스 수입은 "+money+"원 입니다.");
	}
	
}
