package grouping_testNg_methods;

import org.testng.annotations.Test;

public class MobileLoan {

	
	@Test(groups = {"smoke"})
	public void webMobileLoanLogin() {
		System.out.println("webMobileLoanLogin() executed");
	}
	
	
	
	public void mobileMobileLoanLogin() {
		System.out.println("mobileMobileLoanLogin()executed");
	}
	
	@Test
	public void apiMobileLoanLogin() {
		System.out.println("apiMobileLoanLogin()executed");
	}
	
}
