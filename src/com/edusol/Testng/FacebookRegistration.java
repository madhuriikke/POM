package com.edusol.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookRegistration {
	private WebDriver driver;

	public FacebookRegistration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = XpathObject.firstname)
	public WebElement firstName;

	@FindBy(xpath = XpathObject.lastname)
	public WebElement lastName;

	public LoginTest doRegistration() {

		firstName.sendKeys("Madhuri");
		lastName.sendKeys("Ikke");

		return new LoginTest(driver);
	}

}
