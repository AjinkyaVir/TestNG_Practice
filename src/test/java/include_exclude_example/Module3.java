package include_exclude_example;

import org.testng.annotations.Test;

public class Module3 {

	/*
	 * Include and Exclude test Ng methods
	 * 
	 * We can disable test method by using @Test annotation 
	 * @Test(@enabled = false)
	 * 
	 * also, we can add exclude tag in testNg.xml file
	 * 
	 * to include and exclude tag under the class tag
	 * 
	 * but if we want to exclude multiple test method from the test class then its most tedious task 
	 * to overcome this we can use include tag under class tag only those test methods can run and gives o/p in console
	 * 
	 */
	
	@Test
	public void m1() {
		
		System.out.println("Module 3 - M1() method executed");
		
	}
	
	@Test
	public void m2() {
		
		System.out.println("Module 3 - M2() method executed");
		
	}
	
	@Test
	public void m3() {
		
		System.out.println("Module 3 - M3() method executed");
		
	}
	
	@Test
	public void m4() {
		
		System.out.println("Module 3 - M4() method executed");
		
	}
	
	@Test
	public void m5() {
		
		System.out.println("Module 3 - M5() method executed");
		
	}
	
}
