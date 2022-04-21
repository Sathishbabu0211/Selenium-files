package org.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//frame[@src='RSNBLogin.html?v=4']"));
		WebDriver frame2 = driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("sathish@123");
		WebDriver defaultContent = driver.switchTo().defaultContent();
		
		
	}
	
	

}
