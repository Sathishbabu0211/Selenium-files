package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionTwo {
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement txtemail = driver.findElement(By.xpath("//input[@id='email']"));
			
			txtemail.sendKeys("sathish@123");
			
			WebElement txtpass = driver.findElement(By.xpath("//input[@id='pass']"));
			
			txtpass.sendKeys("babu12456");
			
			WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
			
			btnlogin.click();
			
			
			
		}

}
