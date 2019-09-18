package com.edusol.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.edusol.Testng.XpathObject;

public class TestTitle {

	WebDriver driver;

	public TestTitle() {
		System.setProperty("webdriver.gecko.driver", "F:\\jar\\selenium jar\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(XpathObject.testsite);
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
	}
		
	

	public FacebookRegistration checkTitle(String expectedtitile) {
		
		String actualTitle = driver.getTitle();
		System.out.println("Actual Titile" + actualTitle);
		if (expectedtitile.equalsIgnoreCase(actualTitle)) {

			return new FacebookRegistration(driver);

		} else

		{
			return null;
		}

	}
}