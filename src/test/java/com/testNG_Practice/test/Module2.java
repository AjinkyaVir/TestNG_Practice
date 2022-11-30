package com.testNG_Practice.test;

import org.testng.annotations.Test;

public class Module2 {

	@Test(enabled = false)
	public void WebCarLoan() {
		System.out.println("Module 2 - WebCarLoan method executed");
	}
	
	@Test
	public void MobileCarLoan() {
		System.out.println("Module 2 - MobileCarLoan method executed");
	}
	
	@Test
	public void APICarLoan() {
		System.out.println("Module 2 - APICarLoan method executed");
	}
	
}
