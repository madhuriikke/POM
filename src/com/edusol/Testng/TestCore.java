package com.edusol.Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.edusol.Test.XpathObject;

public class TestCore {
	WebDriver driver;

	@BeforeSuite
	public void init() {

		System.setProperty("webdriver.gecko.driver", "F:\\jar\\selenium jar\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(XpathObject.testsite);
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	@AfterSuite
	public void quit() {
		driver.quit();
	}
}
