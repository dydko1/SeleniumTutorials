package edureka.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import edureka.pages.FbHomePage;
import edureka.pages.FbLoginPage;

public class FbLoginTest extends TestBase {
	@Test
	public void init() throws Exception {
//driver.get("<a href="https://www.facebook.com">https://www.facebook.com</a>");
		FbLoginPage loginpage = PageFactory.initElements(driver, FbLoginPage.class);
		loginpage.setEmail("your-username");
		loginpage.setPassword("your-password");
		loginpage.clickOnLoginButton();
		FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
		homepage.clickOnProfileDropdown();
		//homepage.verifyLoggedInUserNameText();
		homepage.clickOnLogoutLink();
	}
}