package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class assertLogo {
	WebDriver driver;//declare class variable
	WebElement googleLogo;
	

	@Given("^I am on the google page \"([^\"]*)\"$")
	public void i_am_on_the_google_page(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https:\\google.com");
	}

	@When("^I search for Google Logo webelement$")
	public void i_search_for_Google_Logo_webelement() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	}

	@Then("^I should get the logo displayed$")
	public void i_should_get_the_logo_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(googleLogo.isDisplayed(), true);
	}
	@Then("^I will close the web browser$")
	public void i_will_close_the_web_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.close();
	    
	}

}
