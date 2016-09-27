package com.v.m.sb.ntlintializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Initializer {
	
	public static FileInputStream envfis = null; 
	public static Properties envprop = null;
	public static WebDriver wd = null;
	
	public static FileInputStream locfis = null;
	public static Properties locprop = null; 
	
	
	public static void initializer() throws IOException
	{
	envfis = new FileInputStream(new File("S:"+File.separator+"Vmetry"+File.separator+"JavaWorkspace"+File.separator+"DDTtestSecond"+File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"com"+File.separator+"v"+File.separator+"m"+File.separator+"sb"+File.separator+"config"+File.separator+"env.properties"));   
	envprop = new Properties(); 
	envprop.load(envfis);
	
	locfis = new FileInputStream(new File("S:"+File.separator+"Vmetry"+File.separator+"JavaWorkspace"+File.separator+"DDTtestSecond"+File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"com"+File.separator+"v"+File.separator+"m"+File.separator+"sb"+File.separator+"config"+File.separator+"locator.properties"));   
	locprop = new Properties(); 
	locprop.load(locfis);  
	
	System.out.println(envprop.getProperty("BROWSER"));
	
	if (envprop.getProperty("BROWSER").equals("Firefox")) 
	{
		wd = new FirefoxDriver(); 
		
	} 
	else if (envprop.getProperty("BROWSER").equals("chrome"))
	{
		System.setProperty("", "");   
		wd = new ChromeDriver(); 
	}
	
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	//wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
	
	
	}
	
	//write individual methods for different locators ie., if by.id, by.name etc
	public static WebElement getWebelementByXpath(String xpath)  
	{
		return wd.findElement(By.xpath(locprop.getProperty(xpath)));
	}
	
	
}
