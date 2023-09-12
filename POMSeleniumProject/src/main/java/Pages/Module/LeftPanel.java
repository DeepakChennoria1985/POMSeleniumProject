package Pages.Module;

import org.openqa.selenium.WebDriver;

import CustomControls.Menu;
import Locators.ElementLocators;

public class LeftPanel  {
	
	WebDriver driver;
	Menu menu;

	public LeftPanel(WebDriver driver) {

		this.driver = driver;
		menu = new Menu(driver);
	}
	
	public void SelectLogoutFromMenu() {
		menu.MoveToElementAndClick(ElementLocators.HomePage.LeftPanel.menuButton);
	}
}
