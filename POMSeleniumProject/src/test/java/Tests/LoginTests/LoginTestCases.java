package Tests.LoginTests;

import Pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constants.TestConstants;
import Pages.HomePage;
import Tests.TestBase.TestCasesBase;



public class LoginTestCases extends TestCasesBase {
	
	@Test(groups = { "Smoke" })

	public void ValidLoginTest() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginPage.LoginToApplication("standard_user", "secret_sauce");
		Assert.assertEquals(homePage.GetHomePageTitle(), TestConstants.homePageSubTitle, "Home page not displayed.");
		
		
	}
	
	@Test(groups = { "Regression" })
	public void InValidLoginTestWithWrongUserName() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginPage.LoginToApplication("standard_user123", "secret_sauce");
		Assert.assertNotEquals(homePage.GetHomePageTitle(), TestConstants.homePageSubTitle, "Home page not displayed.");
		
		
	}
	
	@Test(groups = { "Regression" })
	public void InValidLoginTestWithWrongPassword() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginPage.LoginToApplication("standard_user", "secret_sauce123");
		Assert.assertNotEquals(homePage.GetHomePageTitle(), TestConstants.homePageSubTitle, "Home page not displayed.");
		
		
	}
	
	@Test(groups = { "Regression" })
	public void InValidLoginTestWithWrongUserNamePassword() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginPage.LoginToApplication("standard_user123", "secret_sauce123");
		Assert.assertNotEquals(homePage.GetHomePageTitle(), TestConstants.homePageSubTitle, "Home page not displayed.");
		
		
	}

}
