import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest8Lesson170 {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Started");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.pl");
		// ------------------------
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.cssSelector("#cnsw > iframe")));
		
		driver.findElement(By.cssSelector("#introAgreeButton > span > span")).click();
		
		driver.findElement(By.name("q")).sendKeys("Mirek");
				
		Thread.sleep(1000);
		List<WebElement> all=driver.findElements(By.xpath("//*[contains(text(),'mirek')]"));
		
		
		int size=all.size();
		for(int i=0;i<size;i++)
		{
			System.out.println("Element \t" + i + "\t" + all.get(i).getText());
		}
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		Thread.sleep(2000); // Let the user actually see something!
		driver.quit();
	}
}
