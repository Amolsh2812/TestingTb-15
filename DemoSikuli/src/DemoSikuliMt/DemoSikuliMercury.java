package DemoSikuliMt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DemoSikuliMercury 
{
    public static WebDriver driver;
	public static void main(String[] args) throws FindFailed 
	{
	

		 System.out.println("this is chrome browser Before Suit"); 
		 System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 102\\chromeDriver.exe");
		 driver=new ChromeDriver();
		
		 driver.get("https://demo.guru99.com/test/newtours/login.php");
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		
		Screen sc=new Screen();
		
		Pattern usr=new Pattern("G:\\SnippingToolSikuli\\mercuryuser.PNG");
		sc.type(usr,"QQQQ");
		
		Pattern ps=new Pattern("G:\\SnippingToolSikuli\\mercuryps.PNG");
		sc.type(ps,"qqqq");
		
		Pattern sb=new Pattern("G:\\SnippingToolSikuli\\mersub.PNG");
		sc.click(sb);
		
		
		
		
	}
}
