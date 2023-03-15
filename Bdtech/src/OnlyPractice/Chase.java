package OnlyPractice;

import Homework.multiply;

public class Chase extends Bank implements FinancialInstitute{

	@Override
	public void onlineBanking() {
		System.out.println("We have online Banking ");
		
	}

	@Override
	public void atm() {
		System.out.println("Allover the USA ");
		
	}

	@Override
	public void craditCard() {
		System.out.println("multiply Type cradit card");
		
	}

	@Override
	public void loanForBusiness() {
		System.out.println("Yes We do ");
		
	}

	@Override
	public void mortgage() {
		System.out.println("For special customer ");
		
	}

	@Override
	public void onlineApplication() {
		System.out.println("yes");
		
	}
	

}
