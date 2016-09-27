package com.v.m.sb.ntltestcases;

import inputreader.Inputreader;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.v.m.sb.ntlintializer.Initializer;
import com.v.m.sb.ntlintializer.WebdriverFunctions;
import com.v.m.sb.ntlpages.HomePage;

public class HomePageTest extends Initializer{
	
	@BeforeTest
	public void setup() throws IOException 
	{
		initializer();
	}
	
	
	@Test(dataProvider="HomePageTest")
	public void validateHomepage(String testda,String uname, String mob, String picka, String dropa, String basic) throws IOException, InterruptedException
	{
		//initializer();  //moved to beforetest to avoid multiple time opening of browsers
		wd.get(envprop.getProperty("URL"));
		
		HomePage.enterusername(uname); 
		HomePage.entermonile(mob);
		HomePage.enterPickadd(picka);
		HomePage.enterDropadd(dropa);
		
		WebdriverFunctions.selectDropDownByVisibleText(basic);
		HomePage.bookLater();
		Thread.sleep(5000);
				
	}
	
	@DataProvider(name="HomePageTest")
	public static Object[][] getHomePageData() throws Exception
	{
		if (Inputreader.RunModeVerification("HomePageTest"))
		{	
		Object[][] data = Inputreader.selectSingleDataOrMulitiData("HomePageTest");  
		
	return data; 	
		
	}

//the below return is for the method return only.  this code will not be reached since 
//the return in if condition will return data and stop working beyond it.  
return null; 
	
}
	
}
//		// 4  denoted how many fields we need to fill
//		// 
//		
//		data[0][0] = "test1";
//		data[0][1] = "8888";
//		data[0][2] = "ADYAR";
//		data[0][3] = "ADYAR";
//		data[0][4] = "Sedan";
//		
//		data[1][0] = "test2";
//		data[1][1] = "8888";
//		data[1][2] = "GUINDY";
//		data[1][3] = "GUINDY";
//		data[1][4] = "Premium"; 
//		return data; 
//		
//	}
//	
//	@AfterMethod
//	public void tearDown()
//	{
//		
//	}


