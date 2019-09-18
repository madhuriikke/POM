
package com.edusol.Testng;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class FirstTest extends TestCore {

	@Test 
	public void startTest() { 
		PageFactory.initElements(driver,this);
		
		TestTitle tt= new TestTitle(driver);
		
		FacebookRegistration fb=tt.checkTitle("Facebook – log in or sign up");
		if(fb!=null) {
			LoginTest lt=fb.doRegistration();
			lt.doLogin("abc", "dfg");
		}
		
  
  }

}
