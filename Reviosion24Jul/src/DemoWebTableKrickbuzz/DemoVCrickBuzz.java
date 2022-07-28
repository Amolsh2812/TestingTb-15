package DemoWebTableKrickbuzz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoVCrickBuzz
{

	WebDriver driver;
	
	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 103\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
	
	
	WebElement table=driver.findElement(By.xpath("//div[@id=\"innings_1\"]/div[1]"));
	List<WebElement> tbl=table.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"]"));
	int count=tbl.size();
	System.out.println(count);
	
	for(int i=0 ; i<count-2 ; i++)
	{
		String s=table.findElements(By.cssSelector("div[class=\"cb-col cb-col-27 \"]")).get(i).getText();
		System.out.println(s);
	}
	
	int sum=0;
	List<WebElement> rn=table.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"]"));
	int count1=rn.size();
	System.out.println(count1);
	for(int i=0 ; i<count1-2 ; i++)
	{
		String ss=table.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"] :nth-child(3)")).get(i).getText();
		int run=Integer.parseInt(ss);
		//System.out.println(run);
		sum=sum+run;
	}
	System.out.println(sum);
	
	WebElement table2=driver.findElement(By.xpath("//div[@id=\"innings_1\"]/div[4]"));
	List<WebElement> tb2=table2.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms \"]"));
	int count2=tb2.size();
	System.out.println(count2);
	
	for(int i=0 ;i<count2 ;i++)
	{
		String a=table2.findElements(By.cssSelector("div[class=\"cb-col cb-col-40\"]")).get(i).getText();
		System.out.println(a);
	}
	
	List<WebElement> tt=table2.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms \"]"));
	int cont=tt.size();
	System.out.println(cont);
	int sub=0;
	for(int i=0 ; i<cont ;i++)
	{
		String aa=table2.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms \"] :nth-child(2)")).get(i).getText();
		int rnn=Integer.parseInt(aa);
		
		sub=sub+rnn;
	}
	System.out.println(sub);
}
}