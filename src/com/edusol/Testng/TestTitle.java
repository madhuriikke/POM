package com.edusol.Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestTitle {

	WebDriver driver;

	public TestTitle(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
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