package task.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionOne {
		
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//Facebook id = Email - Find and verify the locator of username field
		
		WebElement txtusername = driver.findElement(By.id("email"));
		
		txtusername.sendKeys("sathish@123");
		
		//Facebook id = password - Find and verify the locator of password field
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		
		txtpassword.sendKeys("54664464");
		
		
		
		
		
	
		
	}

}
