package Pages;

import org.openqa.selenium.WebDriver;

import Locators.ElementLocators;

public class HomePage {
	WebDriver driver;
	ElementLocators elementLocators;

	public HomePage(WebDriver driver1) {

		driver = driver1;
		elementLocators = new ElementLocators();
	}
	
	public void ClickRemoveButton() {
		driver.findElement(elementLocators.removeButon).click();
	}
	
	public void ClickAddToCartButton() {
		driver.findElement(elementLocators.addToCartButton).click();
	}
	
	
	public boolean IsRemoveButtonDisplayed() {
		return driver.findElement(elementLocators.removeButon).isDisplayed();
		
	}
	
	
	public String GetHomePageTitle() {
		return driver.findElement(elementLocators.homePageTitleLoc).getText();
	}
	
}
