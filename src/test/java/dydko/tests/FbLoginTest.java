package dydko.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import dydko.pages.FbHomePage;
import dydko.pages.FbLoginPage;

public class FbLoginTest extends TestBase {
	@Test
	public void init() throws Exception {
//driver.get("<a href="https://www.facebook.com">https://www.facebook.com</a>");
		FbLoginPage loginpage = PageFactory.initElements(driver, FbLoginPage.class);
		loginpage.acceptButton();
		Thread.sleep(500);
		loginpage.setEmail("xxxxxxx");
		loginpage.setPassword("xxxxxx");
		loginpage.clickOnLoginButton();
		Thread.sleep(1000);
		FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
		homepage.clickOnProfileDropdown();
		Thread.sleep(2000);
		homepage.clickOnLogoutLink();
		Thread.sleep(5000);
		//homepage.verifyLoggedInUserNameText();
		//homepage.clickOnLogoutLink();
	}
};
