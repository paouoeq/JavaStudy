package company;

import java.util.Arrays;

public class TestCompany {
	public static void main(String[] args) {
		int s = Integer.parseInt(args[0]);
		
		Company c = new Company(s);
		
		System.out.println("연 기본급 합: "+c.getIncome()+" 세후: "+c.getAfterTaxIncome());
		System.out.println("연 기본급 합: "+c.getBonus()+" 세후: "+c.getAfterTaxBonus());
		System.out.println("연 지급액 합: "+(c.getAfterTaxIncome()+c.getAfterTaxBonus()));
	}
}
