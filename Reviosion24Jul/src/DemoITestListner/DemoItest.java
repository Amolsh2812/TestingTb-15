package DemoITestListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoItest implements ITestListener
{

	public void onStart(ITestContext i)
	{
		System.out.println("On start in ITest listner");
	}
	
	public void onFinish(ITestContext i)
	{
		System.out.println("on Finsh in Itest Listner");
	}
	
	public void onTestSuccess(ITestResult r)
	{
		System.out.println("on test start in Itest Listner");
	}
	public void onTestFailure(ITestResult r)
	{
		System.out.println("on test fail in Itest Listner");
	}
	
	public void onTestSkipped(ITestResult r)
	{
		System.out.println("on test skipped in Itest Listner");
	}
	
	public void onTestFailurebutSuccessPercentage(ITestResult r)
	{
		System.out.println("On Test Failure in success percentage in ITest Listner");
	}
	
}
