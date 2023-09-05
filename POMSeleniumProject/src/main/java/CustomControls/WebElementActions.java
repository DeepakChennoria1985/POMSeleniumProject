package CustomControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.ElementNotInteractableException;

public class WebElementActions {

	protected WebDriver driver;

	public WebElementActions(WebDriver driver) {

		this.driver = driver;

	}


	  /**
	   * <h1>Wait for Element</h1>
	   * <p>
	   * <b>Description: </b>
	   * This function is used to dynamically wait for element visibility in DOM </p>
	   * 
	   * @param element This is the parameter to pass locator of target element
	   * @return WebElement This returns webelement, if visible
	   */
	
	private WebElement WaitForWebElement(By element) {
		WebElement elementVisible = driver.findElement(element);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(5000, TimeUnit.MILLISECONDS)
				.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(ElementNotInteractableException.class);

		return wait.until(ExpectedConditions.visibilityOf(elementVisible));
	}

	protected void ClickAction(By element) {

		WaitForWebElement(element).click();
	}

	protected void SendKeysAction(By element, String text) {

		WaitForWebElement(element).sendKeys(text);
	}

	public String GetText(By element) {

		return WaitForWebElement(element).getText();
	}
	
	protected void ClearTextAction(By element) {

	    WaitForWebElement(element).clear();
	}
	
	public boolean IsDisplayed(By element) {

		return WaitForWebElement(element).isDisplayed();
	}

	public boolean IsEnabled(By element) {

		return WaitForWebElement(element).isEnabled();
	}
	
	public boolean IsSelectedn(By element) {

		return WaitForWebElement(element).isSelected();
	}
	
}
