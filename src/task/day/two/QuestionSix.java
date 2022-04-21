package task.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionSix {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		WebElement txtphnnumber = driver.findElement(By.id("userName"));
		
		txtphnnumber.sendKeys("7815469235");
		
		
		
	}

}
