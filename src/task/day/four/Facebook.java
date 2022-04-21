package task.day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.instagram.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 
	 
	 WebElement txtUserName = driver.findElement(By.xpath("//input[@name='username']"));
	 txtUserName.sendKeys("9578154356");
	 
	 WebElement txtPass = driver.findElement(By.xpath("//input[@name='password']"));
	 txtPass.sendKeys("487514265");
	 
	 
	 
	}

}
