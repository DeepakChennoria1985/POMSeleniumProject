package Tests.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.ReadJasonUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasesBase {
	
	public WebDriver driver;

	@BeforeTest
	public void SetUp() {
		String URL = ReadJasonUtility.GetValueForKey("AppURL");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@AfterTest
	public void TearDown() {
		driver.quit();
	}

}
