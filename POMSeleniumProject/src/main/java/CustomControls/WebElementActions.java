package CustomControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class WebElementActions {

	protected WebDriver driver;

	public WebElementActions(WebDriver driver) {

		this.driver = driver;

	}

	/**
	 * <h1>Wait for Element</h1>
	 * <p>
	 * <b>Description: </b> This function is used to dynamically wait for element
	 * visibility in DOM
	 * </p>
	 * 
	 * @param element This is the parameter to pass locator of target element
	 * @return WebElement This returns webelement, if visible
	 */

	private WebElement WaitForWebElement(By locator) {
		WebElement elementVisible = driver.findElement(locator);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(5000, TimeUnit.MILLISECONDS)
				.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(ElementNotInteractableException.class);

		return wait.until(ExpectedConditions.visibilityOf(elementVisible));
	}

	protected void ClickAction(By locator) {

		WaitForWebElement(locator).click();
	}

	protected void SendKeysAction(By locator, String text) {

		WaitForWebElement(locator).sendKeys(text);
	}

	public String GetText(By locator) {

		return WaitForWebElement(locator).getText();
	}

	protected void ClearTextAction(By locator) {

		WaitForWebElement(locator).clear();
	}

	protected void SelectFromDropDownByText(By locator, String text) {
		Select option = new Select(WaitForWebElement(locator));
		option.selectByVisibleText(text);

	}

	protected void SelectFromDropDownByValue(By locator, String value) {
		Select option = new Select(WaitForWebElement(locator));
		option.selectByValue(value);
	}

	protected void SelectFromDropDownByIndex(By locator, int index) {
		Select option = new Select(WaitForWebElement(locator));
		option.selectByIndex(index);
	}

	protected void MouseHoverAndSelectSubOption(By menuLocator, By subOptionLocator) {

		Actions actions = new Actions(driver);
		actions.moveToElement(WaitForWebElement(menuLocator)).moveToElement(WaitForWebElement(subOptionLocator)).click()
				.build().perform();

	}

	protected void ClickElementAndSelectSubOption(By menuLocator, By subOptionLocator) {

		Actions actions = new Actions(driver);
		actions.moveToElement(WaitForWebElement(menuLocator)).click().moveToElement(WaitForWebElement(subOptionLocator))
				.click().build().perform();

	}

	protected void MoveToSubOptionAndClick(By menuLocator) {
		Actions actions = new Actions(driver);
		actions.moveToElement(WaitForWebElement(menuLocator))
		.click()
		.build()
		.perform();
	}
	
	public boolean IsDisplayed(By locator) {

		return WaitForWebElement(locator).isDisplayed();
	}

	public boolean IsEnabled(By locator) {

		return WaitForWebElement(locator).isEnabled();
	}

	public boolean IsSelectedn(By locator) {

		return WaitForWebElement(locator).isSelected();
	}

}
