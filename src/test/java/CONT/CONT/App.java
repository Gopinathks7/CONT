package CONT.CONT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
   @Test
   public void getBrowser()
    {
	   try
	   {
        String key="webdriver.chrome.driver";
        String value="E:\\BrowserDrivers\\chromeDriver.exe";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
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
