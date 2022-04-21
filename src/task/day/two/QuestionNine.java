package task.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionNine {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement txtusername = driver.findElement(By.id("username"));
		
		txtusername.sendKeys("sathishchitra004");
		
		WebElement txtpass = driver.findElement(By.id("password"));
		
		txtpass.sendKeys("1547852");
		
		

		
	}

}
