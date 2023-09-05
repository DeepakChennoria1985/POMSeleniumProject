package CustomControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextField extends WebElementActions {

	public TextField(WebDriver driver) {
		super(driver);

	}
	
	public void SendKeys(By element, String text) {
		SendKeysAction(element, text);
	}
	
	public void ClearAndSendKeys(By element, String text) {
		ClearTextAction(element);
		SendKeysAction(element, text);
	}
	
	public void ClearKeys(By element) {
		ClearTextAction(element);
	}
}
