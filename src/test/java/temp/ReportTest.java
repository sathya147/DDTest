package temp;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ReportTest {

	WebDriver wd = null; 
	ExtentReports report; 
	ExtentTest log; 
	
	@Test(priority=1)
	public void yahoo()
	{
		report = new ExtentReports("S:\\Vmetry\\JavaWorkspace\\DDTtestSecond\\Report\\report.html");   
		report.startTest("validatingyahooTest"); 		 
		wd = new FirefoxDriver(); 
		wd.get("http://www.google.com/");
	}
	
	@Test(priority=2)
	public void google()
	{
		report.startTest("teesting google"); 
		wd = new FirefoxDriver(); 
		wd.get("http://www.yahoo.com/"); 
	}
	
	@Test(priority=3)
	public void bing()
	{
		report.startTest("testingBing");
		wd = new FirefoxDriver(); 
		wd.get("http://www.bing.com/");
	}
	
	@AfterMethod
	public void tearDown(ITestResult it)
	{
		
		if(it.isSuccess())
		{
			
		}
		
		
	}
	
//	public static String takescreenShot(String name) throws IOException 
//	{
//	File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE); 
//	
//	
//			
//	}
	
	
}
