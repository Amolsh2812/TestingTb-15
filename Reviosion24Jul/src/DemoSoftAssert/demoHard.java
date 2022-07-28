package DemoSoftAssert;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class demoHard 
{

	@Test
	public void hard()
	{
	
		System.out.println("1");
		assertEquals(10, 10);
		
		System.out.println("2");
		assertEquals(20, 10);
		
		System.out.println("3");
		assertEquals(10, 10);
		
	}
}
