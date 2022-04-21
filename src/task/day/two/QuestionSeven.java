package task.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionSeven {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		
		txtUserName.sendKeys("sathishbabu");
		
		WebElement txtpassword = driver.findElement(By.name("password"));
		
		txtpassword.sendKeys("1547895");
}
}
