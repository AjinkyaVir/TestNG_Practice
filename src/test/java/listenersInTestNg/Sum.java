package listenersInTestNg;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(listenersInTestNg.ListenersTest.class)
public class Sum {

	@Test
	@Parameters({"a","b"})
	public void sum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of two numbers : " + sum);
		
	}
	
	@Test
	public void testFailed() {
		
		System.out.println("Test method failed");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void testSkipped() {
		
		throw new SkipException("Skip test methods");
		
	}
	
}
