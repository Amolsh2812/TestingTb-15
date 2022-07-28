package DemoSoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoft
{

	@Test
	public void soft()
	{
		SoftAssert ss=new SoftAssert();
		System.out.println("1");
		ss.assertEquals(5, 5);
		
		System.out.println("2");
		ss.assertEquals(10, 5);
		
		System.out.println("3");
		ss.assertEquals(10, 10);
		
		ss.assertAll();
	
	}
}
