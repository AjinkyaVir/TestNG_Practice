package grouping_testNg_methods;

import org.testng.annotations.Test;

public class CarLoan {

	
	@Test
	public void webCarLoanLogin() {
		System.out.println("webCarLoanLogin() executed");
	}
	
	
	@Test(groups = {"smoke"})
	public void mobileCarLoanLogin() {
		System.out.println("mobileCarLoanLogin()executed");
	}
	
	@Test
	public void apiCarLoanLogin() {
		System.out.println("mobileHomeLoanLogin()executed");
	}
	
}
