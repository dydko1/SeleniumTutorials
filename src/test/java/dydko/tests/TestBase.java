package dydko.tests;

import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	public void initialize() throws IOException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		// To maximize browser
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// To open facebook
		driver.get("https://www.facebook.com");
	}

	@AfterSuite
	// Test cleanup
	public void TeardownTest() {
		TestBase.driver.quit();
	}

}
