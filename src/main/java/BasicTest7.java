import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest7 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Path sampleFile = Paths.get("testData/Page1.html");
		driver.get(sampleFile.toAbsolutePath().toString());
		// ------------------------
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		Thread.sleep(2000); // Let the user actually see something!
		driver.quit();
	}
}
