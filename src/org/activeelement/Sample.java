package org.activeelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	// Active Element
		WebElement txtusername = driver.switchTo().activeElement();
		txtusername.sendKeys("sathish@154215");
		
	//find Elements
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println(list.size());
		
		//getAttribute of links
		
		for(WebElement x:list) {
			String attribute = x.getAttribute("href");
			System.out.println(attribute);
		}	
			
			
		}
		
		
	}


