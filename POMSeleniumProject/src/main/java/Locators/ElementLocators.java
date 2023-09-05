package Locators;

import org.openqa.selenium.By;

public class ElementLocators {
	
	// Locators for Login Page
	public static By indexPageTitle = By.xpath("//div[@id='root']//div[@class='login_logo']");
	public static By loginInput = By.id("user-name");
	public static By passwordInput = By.id("password");
	public static By loginButton = By.id("login-button");
	
	
	// Locators for Home Page
	
	public static By homePageTitleLoc = By.xpath("//div[@id='header_container']//span[@class='title']");
	public static By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
	public static By removeButon = By.id("remove-sauce-labs-backpack");
	
	

}
