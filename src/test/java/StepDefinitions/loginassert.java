package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginassert {
	WebDriver driver;

	@Given("^I open website \"([^\"]*)\"$")
	public void i_open_website(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(arg1);

	}

	@When("^I type login = \"([^\"]*)\" and password = \"([^\"]*)\"$")
	public void i_type_login_and_password(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='txtUsername']")).clear();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).clear();
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(arg2);
	}

	@When("^I click sign-in button$")
	public void i_click_sign_in_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^I should get \"([^\"]*)\" text$")
	public void i_should_get_text(String expectedString) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		String actualString = driver.findElement(By.xpath("//li[contains(text(),'Dashboard')]")).getText();
		assertEquals(actualString, expectedString);
	}

	@Then("^I close the site$")
	public void i_close_the_site() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.close();
	}

}
