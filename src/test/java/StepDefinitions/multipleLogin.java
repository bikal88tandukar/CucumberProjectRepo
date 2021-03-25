package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleLogin {
	WebDriver driver;

	@Given("^demo site login \"([^\"]*)\"$")
	public void demo_site_login(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(arg1);
	}

	@Then("^I enter userName = \"([^\"]*)\" and password = \"([^\"]*)\"$")
	public void i_enter_userName_and_password(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='txtUsername']")).clear();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).clear();
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(arg2);
	}

	@Then("^I click submit$")
	public void i_click_submit() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^I match text \"([^\"]*)\"$")
	public void i_match_text(String expectedString) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		String actualString = driver.findElement(By.xpath("//li[contains(text(),'Dashboard')]")).getText();
		assertEquals(actualString, expectedString);
	}

}
