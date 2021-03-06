package browserStack.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import browserStack.pagefactory.BrowserStackHomePage;
import browserStack.pagefactory.BrowserStackSignUpPage;

public class BrowserStackSetupPageFactory {
	String driverPath = "drivers/chromedriver.exe";
	WebDriver driver;
	BrowserStackHomePage objBrowserStackHomePage;
	BrowserStackSignUpPage objBrowserStackSignUpPage;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/");
	}

	@Test(priority = 1)
	public void navigate_to_homepage_click_on_getstarted() {
		objBrowserStackHomePage = new BrowserStackHomePage(driver);
		objBrowserStackHomePage.veryHeader();
		objBrowserStackHomePage.clickOnGetStarted();
	}

	@Test(priority = 2)
	public void enter_userDetails() throws Exception {
		objBrowserStackSignUpPage = new BrowserStackSignUpPage(driver);
		objBrowserStackSignUpPage.veryHeader();
		objBrowserStackSignUpPage.enterFullName("Miroslaw");
		objBrowserStackSignUpPage.enterBusinessEmail("miroslaw.dyduch@gmail.com");
		objBrowserStackSignUpPage.enterPasswrod("Mirdyd12345^");
		Thread.sleep(500);
		objBrowserStackSignUpPage.loginIn();
	}

	@AfterTest
	public void close() throws InterruptedException {
		Thread.sleep(6000);
		driver.quit();
	}
}