package new3;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test6 {
	// @Test
	void verifyTitle() throws Exception {
		Reporter.log("Test Started");
		// System.setProperty("webdriver.chrome.driver", "/Users/pg/Downloads/All
		// Download/Driver/chromedriver");
		// System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Reporter.log("Browser launched success");
		driver.get("https://www.facebook.com/");
		Reporter.log("Enter the URL");
		String title = driver.getTitle();
		Reporter.log("Got The title from web");
		String expResult = "Facebook - Log In or Sign Up";
		Reporter.log("Verification is started");
		Assert.assertEquals(title, expResult);
		Reporter.log("Verification Success");
		Reporter.log("Test cases is Pass");
		driver.close();
		Reporter.log("Close the browser");
	}

	@Test
	void verifyButton() throws Exception {
		Reporter.log("Test Started");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// ChromeDriver driver=new ChromeDriver();
		Reporter.log("Browser launched success");
		driver.get("https://www.facebook.com/");
		Reporter.log("Enter the URL");
		Reporter.log("Verification is started");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();
		Thread.sleep(500);
		try {
			// WebElement btn = driver.findElement(By.name("login"));
			WebElement btn = driver.findElement(By.id("u_0_b"));
			// btn.isDisplayed();
			btn.click();
		} catch (Exception e) {
			Reporter.log("Verification is Failed");
			throw new Exception();
		}
		Reporter.log("Verification Success");
		Reporter.log("Test cases is Pass");
		driver.close();
		Reporter.log("Close the browser");
	}
}
