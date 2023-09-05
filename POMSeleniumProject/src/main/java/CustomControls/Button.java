package CustomControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends WebElementActions {

	public Button(WebDriver driver) {
		super(driver);

	}
	
	public void Click(By locator) {
		ClickAction(locator);
	}

}
