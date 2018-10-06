package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPageMercury {

	WebDriver driver;

	// Locate user name
	@FindBy(xpath = "//input[@name='userName']")
	WebElement userName;

	public void fillUserName(String username) {
		userName.sendKeys(username);
	}

	// locate password field textbox
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	public void fillPassword(String passwordText) {
		password.sendKeys(passwordText);
	}

	// locate sign-in button
	@FindBy(xpath = "//input[@name='login']")
	WebElement signInButton;

	public void clickSignInButton() {
		signInButton.click();
	}

	// locate register link
	@FindBy(xpath = "//a[starts-with(text(), 'Register')]")
	WebElement registerLink;

	public void clickOnRegisterHereLink() {
		registerLink.click();
	}

	public searchPageMercury(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
