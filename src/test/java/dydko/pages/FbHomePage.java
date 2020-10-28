package dydko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbHomePage {
	WebDriver driver;

	public FbHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements document.querySelector("#userNavigationLabel") document.querySelector("#pageLoginAnchor")
	//@FindBy(how = How.XPATH, using = "//*[@id=\"pageLoginAnchor\"]")
	@FindBy(how = How.CSS, using = "#pageLoginAnchor")
	WebElement profileDropdown;
	@FindBy(how = How.XPATH, using = "//*[@id=\"js_e\"]/div/div/ul/li[9]/a/span/span")
	WebElement logoutLink;

	// Defining all the user actions (Methods) that can be performed in the Facebook
	// home page
	// This method to click on Profile Dropdown
	public void clickOnProfileDropdown() {
		profileDropdown.click();
	}

	// This method to click on Logout link
	public void clickOnLogoutLink() {
		logoutLink.click();
	}
}