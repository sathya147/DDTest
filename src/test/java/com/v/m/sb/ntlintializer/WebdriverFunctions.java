package com.v.m.sb.ntlintializer;

import org.openqa.selenium.support.ui.Select;

import com.v.m.sb.ntlpages.HomePage;

public class WebdriverFunctions extends Initializer {

	public static void selectDropDownByVisibleText(String option)
	{
		Select S = new Select(HomePage.selectBasic());
		S.selectByVisibleText(option);
	}
	
}
