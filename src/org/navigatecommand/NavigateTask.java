package org.navigatecommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("sathish@12451");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("154751548");
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		
		
		
		
	}

}
