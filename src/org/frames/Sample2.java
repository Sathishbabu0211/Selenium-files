package org.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement btnlogin = driver.findElement(By.className("login_button"));
	btnlogin.click();
	
	driver.findElement(By.name("userName")).sendKeys("sathish@123");
	driver.findElement(By.name("password")).sendKeys("afhoafha");
	driver.findElement(By.name("loginCaptchaValue")).sendKeys("oabfahfa");
	

	
	
	
	
}
}