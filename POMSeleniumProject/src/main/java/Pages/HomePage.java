package Pages;

import org.openqa.selenium.WebDriver;

import CustomControls.Button;
import CustomControls.WebElementActions;
import Locators.ElementLocators;

public class HomePage {
	
	WebDriver driver;
	
	WebElementActions webElementActions;
	Button button;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		
		webElementActions = new WebElementActions (driver);
		button = new Button(driver);
	}
	
	public void ClickRemoveButton() {
		button.Click(ElementLocators.removeButon);
	}
	
	public void ClickAddToCartButton() {
		button.Click(ElementLocators.addToCartButton);
	}
	
	
	public boolean IsRemoveButtonDisplayed() {
		return webElementActions.IsDisplayed(ElementLocators.removeButon);
		
	}
	
	
	public String GetHomePageTitle() {
		return webElementActions.GetText(ElementLocators.homePageTitleLoc);
	}
	
}
