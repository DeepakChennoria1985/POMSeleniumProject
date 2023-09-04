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

	private WebElement WaitForWebElement(By element) {
		WebElement elementVisible = driver.findElement(element);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(5000, TimeUnit.MILLISECONDS)
				.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(ElementNotInteractableException.class);

		return wait.until(ExpectedConditions.visibilityOf(elementVisible));
	}

	public void Click(By element) {

		WaitForWebElement(element).click();
	}

	public void SendKeys(By element, String text) {

		WaitForWebElement(element).sendKeys(text);
	}

	public String GetText(By element) {

		return WaitForWebElement(element).getText();
	}

}
