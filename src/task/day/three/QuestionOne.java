package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionOne {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement txtsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		txtsearch.sendKeys("iphone");
		
		WebElement btnclick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		btnclick.click();
		
		
		
		
		
		
	}

}
