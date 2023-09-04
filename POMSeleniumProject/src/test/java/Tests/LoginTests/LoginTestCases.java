package Tests.LoginTests;

import Pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constants.TestConstants;
import Pages.HomePage;
import Tests.TestBase.TestCasesBase;



public class LoginTestCases extends TestCasesBase {
	
	TestConstants testConstants;
	@Test
	public void ValidLoginTest() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		testConstants = new TestConstants();
		//
		
		loginPage.LoginToApplication("standard_user", "secret_sauce");
		Assert.assertEquals(homePage.GetHomePageTitle(), testConstants.homePageSubTitle, "Home page not displayed.");
		
		
	}

}
