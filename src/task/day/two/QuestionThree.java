package task.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionThree {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologies.in/");
		
		WebElement txtName = driver.findElement(By.name("name"));
		
		txtName.sendKeys("Sathish");
		
		WebElement txtemail = driver.findElement(By.name("email"));
		
		txtemail.sendKeys("sathish@123");
		
		WebElement txtcontantnum = driver.findElement(By.name("phone"));
		
		txtcontantnum.sendKeys("7845154655");
		
		
		
		
	}

}
