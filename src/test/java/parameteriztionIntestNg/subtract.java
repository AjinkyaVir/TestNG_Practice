package parameteriztionIntestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class subtract {

	@Test
	@Parameters({"a","b"})
	public void sum(int a,int b) {
		
		System.out.println("subtraction of two numbers=> " + (a - b));
		
	}
	
}
