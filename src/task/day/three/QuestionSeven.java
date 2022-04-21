package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionSeven {
	
	public static void main(String[] args) {
			
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.cleartrip.com/trains");
	
	WebElement txtfrom = driver.findElement(By.xpath("//input[@id='from_station']"));
	
	txtfrom.sendKeys("chennai");
	
	WebElement txtto = driver.findElement(By.xpath("//input[@id='to_station']"));
	
	txtto.sendKeys("coimbatore");
	
	WebElement search = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
	
	search.click();
	
	
	
	
	
}
}