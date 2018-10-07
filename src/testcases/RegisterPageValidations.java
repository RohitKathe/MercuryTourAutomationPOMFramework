package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageClasses.LandingPage;
import pageClasses.RegisterPage;
import pageClasses.searchPageMercury;

public class RegisterPageValidations {

	private WebDriver driver;
	private String baseUrl = "http://newtours.demoaut.com/mercurywelcome.php";
	LandingPage lp;
	searchPageMercury sp;
	RegisterPage rp;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		sp = new searchPageMercury(driver);
		lp = new LandingPage(driver);
		rp = new RegisterPage(driver);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sp.clickOnRegisterHereLink();
	}

	// @Test
	// public void elementsPresentValidation() {
	// List<WebElement> txtFieldsPresent = rp.txtFields(driver);
	// for (WebElement ele : txtFieldsPresent) {
	// try {
	// System.out.println("Textbox has the value: " + ele.getAttribute("name"));
	// } catch (Exception e) {
	// // TODO: handle exception
	// }
	// }
	// }

	@Test
	public void fillData() {
		rp.sendTxtAction(rp.firstNameTxt, "Rohit");
		rp.sendTxtAction(rp.lastNameTxt, "Kathe");
		rp.sendTxtAction(rp.phoneTxt, "0223988978");
		rp.sendTxtAction(rp.emailTxt, "abc@def.com");
		rp.sendTxtAction(rp.addressLine1Txt, "15 NewnHam Terrace");
		rp.sendTxtAction(rp.addressLine2Txt, "Upper Riccarton, ChristChurch");
		rp.sendTxtAction(rp.cityNameTxt, "Christchurch");
		rp.sendTxtAction(rp.stateNameTxt, "Canterbury");
		rp.sendTxtAction(rp.postalCodeTxt, "8061");
		rp.sendTxtAction(rp.userNameTxt, "mercury");
		rp.sendTxtAction(rp.userPasswordTxt, "mercury");
		rp.sendTxtAction(rp.confirmPasswordTxt, "mercury");
		rp.selectCountry();
	}

	@After
	public void tearDown() throws Exception {
	}
}
