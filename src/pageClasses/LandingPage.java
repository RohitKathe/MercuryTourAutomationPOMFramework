package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;

	@FindBy(xpath = "//a[text()='SIGN-OFF']")
	WebElement signOff;

	public boolean SignOffLinkPresent(WebDriver driver) {
		if (signOff.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
