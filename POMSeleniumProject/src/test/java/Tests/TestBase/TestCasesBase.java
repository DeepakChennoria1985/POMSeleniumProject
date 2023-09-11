package Tests.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasesBase {
	
	public WebDriver driver;

	@BeforeTest
	public void SetUp() {
		String URL = "https://www.saucedemo.com/";
		WebDriverManager.chromedriver().setup();
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");*/
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@AfterTest
	public void TearDown() {
		driver.quit();
	}

}
