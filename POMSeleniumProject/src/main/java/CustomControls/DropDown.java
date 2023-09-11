package CustomControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown extends WebElementActions {

	public DropDown(WebDriver driver) {
		super(driver);

	}
	
	public void SelectByVisibleText(By locator, String text) {
		SelectFromDropDownByText(locator, text);
		
	}
	
	public void SelectByValue(By locator, String value) {
		
		SelectFromDropDownByValue(locator, value);
		
	}
	
	public void SelectByIndex(By locator, int index) {
		SelectFromDropDownByIndex(locator, index);
	}
}
