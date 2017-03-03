package com.CosmicCubes.test.regression;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CosmicCubes.ui.LoginPage;
import com.CosmicCubes.utils.ProjectSpec.CreateDriver;

public class TestLoginSC_01 {
	
	WebDriver driver;
	LoginPage login;
	@BeforeMethod
	
		public void setup()
		{
			driver = CreateDriver.getDriver();
			login = new LoginPage(driver);
		}

  @Test
  public void testInvalidLogin() {
	  
	  login.waitForLoginPage();
	  login.getUsernameTextbox().sendKeys("admin");
	  login.getPasswordTextbox().sendKeys("abcd");
	  login.getLoginButton().click();
	  
	  String actualErrorMsg = login.getErrorMessageText().getText();
	  String ExpectedErrorMsg = "Username or Password is invalid. Please try again.";
	  Assert.assertEquals(actualErrorMsg, ExpectedErrorMsg);
  }
  @AfterMethod
  public void tearDown()
  {
	  driver.close();
  }
}
