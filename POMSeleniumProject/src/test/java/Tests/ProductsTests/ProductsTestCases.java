package Tests.ProductsTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constants.TestConstants;
import Pages.HomePage;
import Pages.LoginPage;
import Tests.TestBase.TestCasesBase;
import Utils.ReadJasonUtility;

public class ProductsTestCases  extends TestCasesBase {
	
	@Test(groups = { "Smoke" })

	public void VerifyDecendingSortingOfProducts() {
		
		// Page Objects initialization
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		
		loginPage.LoginToApplication(ReadJasonUtility.GetValueFromTestData("UserName1"), ReadJasonUtility.GetValueFromTestData("Password"));
		Assert.assertTrue(homePage.IstHomePageTitleDisplayed(), "Home page not displayed.");
		homePage.SortProductsOrderUsingText("Name (Z to A)");
		homePage.SortProductsOrderUsingIndex(3);
		homePage.SortProductsOrderUsingValue("hilo");
			
	}

}
