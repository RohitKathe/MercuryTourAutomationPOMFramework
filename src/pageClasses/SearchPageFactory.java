package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {

	WebDriver driver;

	@FindBy(id = "tab-flight-tab-hp")
	WebElement flightsTab;

	@FindBy(id = "flight-type-roundtrip-label-hp-flight")
	WebElement roudTripButton;

	@FindBy(id = "flight-type-multi-dest-label-hp-flight")
	WebElement multiCity;

	public void ClickFlightsTab() {
		flightsTab.click();
	}

	public void clickRoundTripButton() {
		roudTripButton.click();
	}

	public void clickMultiCityButton() {
		multiCity.click();
	}

	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
