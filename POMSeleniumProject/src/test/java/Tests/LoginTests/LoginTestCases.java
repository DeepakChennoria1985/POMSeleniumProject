package Tests.LoginTests;

import Pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constants.TestConstants;
import Pages.HomePage;
import Tests.TestBase.TestCasesBase;
import Utils.ReadJasonUtility;



public class LoginTestCases extends TestCasesBase {
	
	@Test(groups = { "Smoke" })

	public void ValidLoginTest() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginPage.LoginToApplication(ReadJasonUtility.GetValueFromTestData("UserName1"), ReadJasonUtility.GetValueFromTestData("Password"));
		Assert.assertTrue(homePage.IstHomePageTitleDisplayed(), "Home page not displayed.");
		
		
	}
	
	@Test(groups = { "Regression" })
	public void InValidLoginTestWithWrongUserName() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginPage.LoginToApplication(ReadJasonUtility.GetValueFromTestData("WrongUserName"), ReadJasonUtility.GetValueFromTestData("Password"));
		Assert.assertFalse(homePage.IstHomePageTitleDisplayed(), "Home page is displayed.");
		
		
	}
	
	@Test(groups = { "Regression" })
	public void InValidLoginTestWithWrongPassword() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginPage.LoginToApplication(ReadJasonUtility.GetValueFromTestData("UserName1"), ReadJasonUtility.GetValueFromTestData("WrongPassword"));
		Assert.assertFalse(homePage.IstHomePageTitleDisplayed(), "Home page is displayed.");
		
		
	}
	
	@Test(groups = { "Regression" })
	public void InValidLoginTestWithWrongUserNamePassword() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginPage.LoginToApplication(ReadJasonUtility.GetValueFromTestData("WrongUserName"), ReadJasonUtility.GetValueFromTestData("WrongPassword"));
		Assert.assertFalse(homePage.IstHomePageTitleDisplayed(), "Home page is displayed.");
		
		
	}
	
	
	@Test(groups = { "Regression" })
	public void LoginTestWithLockedUser() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.LoginToApplication(ReadJasonUtility.GetValueFromTestData("UserName2"), ReadJasonUtility.GetValueFromTestData("WrongPassword"));
		Assert.assertEquals(loginPage.GetLockedUserErrorMessage(), ReadJasonUtility.GetValueFromTestData("LockedMessage"), "Locked user error not displayed.");
		
		
	}

}
