package listenersInTestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Invoked when test start : " + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Invoked when test success : " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Invoked when test failure : " + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Invoked when test skipped : " + result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Invoked when test onTestFailedButWithinSuccessPercentage : " + result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Invoked when test start : " + context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Invoked when test finish : " + context.getName());
		
	}

}
