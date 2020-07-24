package TestNGListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		
	}
		
	

	@Override
	public void onStart(ITestContext result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case fails " +result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case skipped " +result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case start " +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case success " +result.getName());
		
	}

}
