package Locators;

import org.openqa.selenium.By;

public class ElementLocators {

	public static class LoginPage {

		// Locators for Login Page
		public static By indexPageTitle = By.xpath("//div[@id='root']//div[@class='login_logo']");
		public static By loginInput = By.id("user-name");
		public static By passwordInput = By.id("password");
		public static By loginButton = By.id("login-button");

	}

	public static class HomePage {
		// Locators for Home Page
		public static By homePageTitleLoc = By.xpath("//div[@id='header_container']//span[@class='title']");
		public static By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
		public static By removeButon = By.id("remove-sauce-labs-backpack");
		public static By productSortDropDown = By.xpath("//select[@data-test='product_sort_container']");
		public static By menuButton = By.id("react-burger-menu-btn");

		public static class LeftPanel {
			
			public static By menuButton = By.xpath("//a[text()='Logout']");
		}
	}

}
