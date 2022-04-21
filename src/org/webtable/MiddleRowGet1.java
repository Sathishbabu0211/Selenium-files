package org.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiddleRowGet1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tablerows = table.findElements(By.tagName("tr")); 
		
		int len = 0;
		for (int i = 0; i < tablerows.size(); i++) {
			if (i==len/2) {
				
				System.out.println(i);
				
			}
				
			}
			
	}}