package Pages;

import org.openqa.selenium.WebDriver;

import CustomControls.Button;
import CustomControls.DropDown;
import CustomControls.WebElementActions;
import Locators.ElementLocators;

public class HomePage {
	
	WebDriver driver;
	
	WebElementActions webElementActions;
	Button button;
	DropDown dropdown;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		
		webElementActions = new WebElementActions (driver);
		button = new Button(driver);
		dropdown = new DropDown(driver);
	}
	
	public void ClickRemoveButton() {
		button.Click(ElementLocators.HomePage.removeButon);
	}
	
	public void ClickAddToCartButton() {
		button.Click(ElementLocators.HomePage.addToCartButton);
	}
	
	public void ClickMenuButton() {
		button.Click(ElementLocators.HomePage.menuButton);
	}
	
	public boolean IsRemoveButtonDisplayed() {
		return webElementActions.IsDisplayed(ElementLocators.HomePage.removeButon);
		
	}
	
	
	public boolean IstHomePageTitleDisplayed() {
		return webElementActions.IsDisplayed(ElementLocators.HomePage.homePageTitleLoc);
	}
	
	public void SortProductsOrderUsingText(String sortOrder) {
		dropdown.SelectByVisibleText(ElementLocators.HomePage.productSortDropDown, sortOrder);
	}
	
	public void SortProductsOrderUsingValue(String sortOrder) {
		dropdown.SelectByValue(ElementLocators.HomePage.productSortDropDown, sortOrder);
	}
	
	public void SortProductsOrderUsingIndex(int sortOrder) {
		dropdown.SelectByIndex(ElementLocators.HomePage.productSortDropDown, sortOrder);
	}
}
