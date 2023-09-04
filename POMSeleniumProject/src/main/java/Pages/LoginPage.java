package Pages;

import org.openqa.selenium.WebDriver;

import CustomControls.WebElementActions;
import Locators.ElementLocators;

public class LoginPage {
	WebDriver driver;
	ElementLocators elementLocators;
	WebElementActions Action;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		elementLocators = new ElementLocators();
	}

	private void EneterUserName(String userName) {
		Action.SendKeys(elementLocators.loginInput, userName);

	}

	private void EneterPassword(String password) {
		Action.SendKeys(elementLocators.passwordInput, password);
		//driver.findElement(elementLocators.passwordInput).sendKeys(password);

	}

	private void ClickLoginButton() {
		Action.Click(elementLocators.loginButton);
	//	driver.findElement(elementLocators.loginButton).click();

	}
	
	public String GetIndexPageTitle() {
		return Action.GetText(elementLocators.indexPageTitle);
	}
	
	public void LoginToApplication(String userName, String password) {
		EneterUserName(userName);
		EneterPassword(password);
		ClickLoginButton();
	}

}
