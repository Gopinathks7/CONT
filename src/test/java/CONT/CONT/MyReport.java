package CONT.CONT;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyReport
{


	ExtentReports eRports;
	ExtentTest eTest;
@BeforeSuite
public void setExtent()
{
	eRports = new ExtentReports(".//target/ExtenetReport"+".html");
	
}

@AfterSuite
public void closingReport()
{
	eRports.flush();
}

@BeforeMethod
public void getMethodsName(Method method)
{
	eTest=eRports.startTest(method.getName());
	
	
}
@AfterMethod
public void getFailedMethod(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		eTest.log(LogStatus.FAIL,"Method is Failed");
	}
	else
	{
		eTest.log(LogStatus.PASS,"Mehod is passed");
	}
	
	eRports.endTest(eTest);
	
}
}


