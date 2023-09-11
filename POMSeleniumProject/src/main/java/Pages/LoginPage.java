package Pages;

import org.openqa.selenium.WebDriver;

import CustomControls.Button;
import CustomControls.TextField;
import CustomControls.WebElementActions;
import Locators.ElementLocators;

public class LoginPage {
	
	WebDriver driver;
	
	WebElementActions webElementActions;
	Button button;
	TextField textField;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		
		webElementActions = new WebElementActions(driver);
		button = new Button(driver);
		textField = new TextField(driver);
	}

	private void EneterUserName(String userName) {
		textField.SendKeys(ElementLocators.LoginPage.loginInput, userName);

	}

	private void EneterPassword(String password) {
		textField.SendKeys(ElementLocators.LoginPage.passwordInput, password);
		//driver.findElement(ElementLocators.LoginPage.passwordInput).sendKeys(password);

	}

	private void ClickLoginButton() {
		button.Click(ElementLocators.LoginPage.loginButton);
	//	driver.findElement(ElementLocators.LoginPage.loginButton).click();

	}
	
	public String GetIndexPageTitle() {
		return webElementActions.GetText(ElementLocators.LoginPage.indexPageTitle);
	}
	
	public void LoginToApplication(String userName, String password) {
		EneterUserName(userName);
		EneterPassword(password);
		ClickLoginButton();
	}

}
