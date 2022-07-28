package DemoIsuitListner;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class DemoISuit implements ISuiteListener
{

	public void onStart(ISuite i)
	{
		System.out.println("on start in isuit level");
	}
	
	public void onFinish(ISuite i)
	{
		System.out.println("on finish in isuit ");
	}
	
}
