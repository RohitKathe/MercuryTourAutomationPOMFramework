package testcases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageClasses.searchPageMercury;

public class LoginPageValidations {

	private WebDriver driver;
	private String baseUrl = "http://newtours.demoaut.com/mercurywelcome.php";
	searchPageMercury sp;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		sp = new searchPageMercury(driver);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void validateElementsArePresent() {
		java.util.List<WebElement> linksList = clickableLinks(driver);
		List<WebElement> textBoxPresent = editableTextBoxes(driver);
		for (WebElement link : linksList) {
			String href = link.getAttribute("href");
			try {
				System.out.println("URL " + href + " returned " + linkStatus(new URL(href)));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		for (WebElement tb : textBoxPresent) {
			try {
				System.out.println("TextBox present with the value: " + tb.getAttribute("name"));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static List<WebElement> editableTextBoxes(WebDriver driver) {
		List<WebElement> textBoxesToFill = new ArrayList<WebElement>();
		textBoxesToFill = driver.findElements(By.tagName("input"));
		return textBoxesToFill;
	}

	public static java.util.List<WebElement> clickableLinks(WebDriver driver) {
		java.util.List<WebElement> linksToClick = new ArrayList<WebElement>();
		java.util.List<WebElement> elements = driver.findElements(By.tagName("a"));
		elements.addAll(driver.findElements(By.tagName("img")));
		for (WebElement e : elements) {
			if (e.getAttribute("href") != null) {
				linksToClick.add(e);
			}
		}
		return linksToClick;
	}

	public static String linkStatus(URL url) {
		try {
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.connect();
			String reponseMessage = http.getResponseMessage();
			http.disconnect();
			return reponseMessage;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
