package CustomControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu extends WebElementActions {

	public Menu(WebDriver driver) {
		super(driver);

	}
	
	
	public void HoverMenuAndSelectOption(By menuLocator, By subOptionLocator) {
		MouseHoverAndSelectSubOption(menuLocator, subOptionLocator);
	}
	
	public void ClickElementAndSelectSubOption(By menuLocator, By subOptionLocator) {
		MouseHoverAndSelectSubOption(menuLocator, subOptionLocator);
	}
	
	public void MoveToElementAndClick(By menuLocator) {
		MoveToSubOptionAndClick(menuLocator);
	}
}
