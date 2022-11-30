package grouping_testNg_methods;

import org.testng.annotations.Test;

public class HomeLoan {


	@Test
	public void webHomeLoanLogin() {
		System.out.println("webHomeLoanLogin() executed");
	}
	
	
	
	public void mobileHomeLoanLogin() {
		System.out.println("mobileHomeLoanLogin()executed");
	}
	
	@Test(groups = {"smoke"})
	public void apiHomeLoanLogin() {
		System.out.println("apiHomeLoanLogin()executed");
	}
	
	
}
