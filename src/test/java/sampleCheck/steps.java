package sampleCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class steps {

	@Given("^I open google page \"([^\"]*)\"$")
	public void i_open_google_page(String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "/Users/bikaltandukar/Downloads/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		// object name is -> driver
		driver.get(url);

	}

}
