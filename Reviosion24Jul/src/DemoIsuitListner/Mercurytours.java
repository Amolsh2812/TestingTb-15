package DemoIsuitListner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mercurytours 
{
	 WebDriver driver;	
	 @BeforeSuite
	  public void beforeSuite() 
	 {
		 System.out.println("open browser");
		 System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 103\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	 @BeforeTest
	  public void beforeTest()
	 {
		 System.out.println("open url");
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
	  }
	 @BeforeClass
	  public void beforeClass() 
	 {
		 driver.manage().window().maximize();
	  }
	 @BeforeMethod
	  public void beforeMethod() 
	 {
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }


    @Test(priority = 1)
    public void f() 
    {
    	driver.findElement(By.name("firstName")).sendKeys("Amol");
		driver.findElement(By.name("lastName")).sendKeys("avhad");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9865275223");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Amolavhad");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("At-Kasarwadi po-chas tal-sinnar");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Nashik");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Maharastra");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("422606");
		WebElement cntry=driver.findElement(By.cssSelector("select[name='country']"));
		Select select=new Select(cntry);
		select.selectByValue("INDIA");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Amolavhad131@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("amolsh1233");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("amolsh1233");
		driver.findElement(By.cssSelector("input[name='submit']")).submit();
		
		driver.findElement(By.cssSelector("td[class=\"mouseOut\"] :nth-child(1)")).click();
    }
   
	
	  @Test(enabled=false)
	  public void f1()
	  {
	  
	  driver.findElement(By.cssSelector("input[name=\"userName\"]")).sendKeys("Amolavhad131@gmail.com");
	  driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("amolsh1233");
	  driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
	  
	  }
	
    @AfterMethod
    public void afterMethod() throws IOException
    {
    	File src=((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));
    	FileUtils.copyFileToDirectory(src, new File("G:\\NP DATA BACKUP"));
    }
   @AfterClass
   public void afterClass()
   {
	   System.out.println("delete cookies");
   }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("data base");
  }

 
  @AfterSuite
  public void afterSuite() 
  {
	  driver.close();
  }
  

}
