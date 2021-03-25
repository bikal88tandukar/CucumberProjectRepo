package sampleCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openingWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\google.com");
		
		WebElement googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		System.out.println(googleLogo.isDisplayed());

	}

}
