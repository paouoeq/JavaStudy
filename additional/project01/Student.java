package project01;

public class Student {
	private String name;
	private int money;
	
	
	public Student() {}

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void takeBus(Bus b) {
		if(money < money-1000) {
			System.out.println("잔액이 부족합니다.");
		} else {
			money -= 1000; 
			b.take();
		}
	}
	
	public void takeSubway(Subway s) {
		if(money < money-1500) {
			System.out.println("잔액이 부족합니다.");
		} else {
			money -= 1500;
			s.take();
		}
	}
	
	public void info() {
		System.out.println(name+"님의 남은 잔액은 "+money+"원 입니다.");
	}
}
