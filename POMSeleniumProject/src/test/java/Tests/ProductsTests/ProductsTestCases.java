package Tests.ProductsTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constants.TestConstants;
import Pages.HomePage;
import Pages.LoginPage;
import Tests.TestBase.TestCasesBase;

public class ProductsTestCases  extends TestCasesBase {
	
	@Test(groups = { "Smoke" })

	public void VerifyDecendingSortingOfProducts() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginPage.LoginToApplication("standard_user", "secret_sauce");
		Assert.assertEquals(homePage.GetHomePageTitle(), TestConstants.homePageSubTitle, "Home page not displayed.");
		homePage.SortProductsOrderUsingText("Name (Z to A)");
		homePage.SortProductsOrderUsingIndex(3);
		homePage.SortProductsOrderUsingValue("hilo");
			
	}

}
