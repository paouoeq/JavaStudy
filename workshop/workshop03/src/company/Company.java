package company;

public class Company {
	
	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {}
	public Company(double salary) {
		this.salary = salary;
	}

	
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getIncome() { // 연 기본급의 합을 계산하여 리턴
		this.income = this.salary*12;
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getAfterTaxIncome() { // 연 기본급의 합에서 세금을 공제한 금액을 리턴
		this.afterTaxIncome = this.income*0.9;
		return afterTaxIncome;
	}

	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}

	public double getBonus() { // 연 보너스의 합을 계산하여 리턴
		this.bonus = 4*this.salary*0.2;
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getAfterTaxBonus() { // 연 보너스의 합에서 세금을 공제한 금액을 리턴
		this.afterTaxBonus = this.bonus*0.945;
		return afterTaxBonus;
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	
	
	
}
