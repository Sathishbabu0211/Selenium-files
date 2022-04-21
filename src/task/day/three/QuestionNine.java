package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionNine {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		login.click();
		
		WebElement mblnum = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		
		mblnum.sendKeys("1234567890");
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		
		txtpass.sendKeys("1547842");
		
		WebElement clklogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		
		clklogin.click();
		
		
		
}
}