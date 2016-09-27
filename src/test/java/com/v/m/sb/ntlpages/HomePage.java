package com.v.m.sb.ntlpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.v.m.sb.ntlintializer.Initializer;

public class HomePage extends Initializer {
	
	public static void enterusername(String usern)
	{
		getWebelementByXpath("HOMEPAGE_USERNAME_TYPE_XPATH").sendKeys(usern);
	}

	public static void entermonile(String mob)
	{
		getWebelementByXpath("HOMEPAGE_MOBILE_TYPE_XPATH").sendKeys(mob);
	}
	
	public static void enterPickadd(String pick)
	{
		getWebelementByXpath("HOMEPAGE_PICKADD_TYPE_XPATH").sendKeys(pick);
	}
	
	public static void enterDropadd(String drop)
	{
		getWebelementByXpath("HOMEPAGE_DROPADD_TYPE_XPATH").sendKeys(drop);
	}
	
	public static WebElement selectBasic()
	{
		return getWebelementByXpath("HOMEPAGE_BASIC_SELECT_XPATH");
	}
	
	public static void bookLater()
	{
		getWebelementByXpath("HOMEPAGE_BOOKLATER_CLICK_XPATH").click();
	}
	
}
