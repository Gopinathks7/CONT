package CONT.CONT;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App extends MyReport
{
   @Test
   public void getBrowser()
    {
	   try
	   {
        String key="webdriver.chrome.driver";
        String value="E:\\BrowserDrivers\\common\\chromeDriver.exe";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("E:\\Demohtml\\Tables.html");
        String xpath1=".//tr[2]/td[2]";
        List<WebElement> one = driver.findElements(By.xpath(xpath1));
        int count=one.size();
        for(int i=0;i<count;i++)
        {
        	WebElement el= one.get(i);
        	String name=el.getText();
        	System.out.println(name);
        }
    }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   finally 
	   {
		System.out.println("Completed");
	}
}
}
