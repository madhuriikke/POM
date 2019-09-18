package com.edusol.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {

	WebDriver driver;
	@FindBy(xpath = XpathObject.username)
	public WebElement username;

	@FindBy(xpath = XpathObject.password)
	public WebElement password;

	@FindBy(xpath = XpathObject.signin)
	public WebElement Signin;

	public LoginTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		Signin.click();
	}

}
