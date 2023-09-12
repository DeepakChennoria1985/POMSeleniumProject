package Tests.LogoutTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constants.TestConstants;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Module.LeftPanel;
import Tests.TestBase.TestCasesBase;

public class LogoutTestCases  extends TestCasesBase {
	
	@Test(groups = { "Smoke" })

	public void ValidLogoutTest() {
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		LeftPanel leftPanel = new LeftPanel(driver);
		
		loginPage.LoginToApplication("standard_user", "secret_sauce");
		Assert.assertEquals(homePage.GetHomePageTitle(), TestConstants.homePageSubTitle, "Home page not displayed.");
		homePage.ClickMenuButton();
		leftPanel.SelectLogoutFromMenu();
		
		
	}

}
