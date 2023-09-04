package Locators;

import org.openqa.selenium.By;

public class ElementLocators {
	
	// Locators for Login Page
	public By indexPageTitle = By.xpath("//div[@id='root']//div[@class='login_logo']");
	public By loginInput = By.id("user-name");
	public By passwordInput = By.id("password");
	public By loginButton = By.id("login-button");
	
	
	// Locators for Home Page
	
	public By homePageTitleLoc = By.xpath("//div[@id='header_container']//span[@class='title']");
	public By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
	public By removeButon = By.id("remove-sauce-labs-backpack");
	
	

}
