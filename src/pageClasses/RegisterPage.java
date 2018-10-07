package pageClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstNameTxt;

	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastNameTxt;

	@FindBy(xpath = "//input[@name='phone']")
	public WebElement phoneTxt;

	@FindBy(xpath = "//input[@name='userName']")
	public WebElement emailTxt;

	@FindBy(xpath = "//input[@name='address1']")
	public WebElement addressLine1Txt;

	@FindBy(xpath = "//input[@name='address2']")
	public WebElement addressLine2Txt;

	@FindBy(xpath = "//input[@name='city']")
	public WebElement cityNameTxt;

	@FindBy(xpath = "//input[@name='state']")
	public WebElement stateNameTxt;

	@FindBy(xpath = "//input[@name='postalCode']")
	public WebElement postalCodeTxt;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement userNameTxt;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement userPasswordTxt;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement confirmPasswordTxt;

	@FindBy(xpath = "//input[@name='register']")
	public WebElement submitBtn;

	@FindBy(xpath = "//select[@name='country']")
	public WebElement countryNameSelect;

	public void selectCountry() {
		Select select = new Select(countryNameSelect);
		select.selectByValue("148");
	}

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void sendTxtAction(WebElement element, String textToSend) {
		element.sendKeys(textToSend);
	}

	public List<WebElement> txtFields(WebDriver driver) {
		List<WebElement> txtFieldsToFill = new ArrayList<WebElement>();
		txtFieldsToFill = driver.findElements(By.tagName("input"));

		return txtFieldsToFill;
	}

	/**
	 * @return the firstNameTxt
	 */
	public WebElement getFirstNameTxt(WebElement ele) {
		if (ele.equals(firstNameTxt)) {
			return firstNameTxt;
		} else if (ele.equals(lastNameTxt)) {
			return lastNameTxt;
		} else if (ele.equals(phoneTxt)) {
			return phoneTxt;
		} else if (ele.equals(emailTxt)) {
			return emailTxt;
		} else if (ele.equals(addressLine1Txt)) {
			return addressLine1Txt;
		} else if (ele.equals(addressLine2Txt)) {
			return addressLine2Txt;
		} else if (ele.equals(cityNameTxt)) {
			return cityNameTxt;
		} else if (ele.equals(stateNameTxt)) {
			return stateNameTxt;
		} else if (ele.equals(postalCodeTxt)) {
			return postalCodeTxt;
		} else if (ele.equals(userNameTxt)) {
			return userNameTxt;
		} else if (ele.equals(userPasswordTxt)) {
			return userPasswordTxt;
		} else if (ele.equals(confirmPasswordTxt)) {
			return confirmPasswordTxt;
		}
		return null;
	}

	public  void dateCorrecttextFilled(WebDriver driver) {
		List<WebElement> txtFieldsToFill = new ArrayList<WebElement>();
		txtFieldsToFill = driver.findElements(By.tagName("input"));
		for (WebElement webElement : txtFieldsToFill) {
			System.out.println("The value filled in: " + webElement.getCssValue(webElement.getTagName()));
		}
	}
}
