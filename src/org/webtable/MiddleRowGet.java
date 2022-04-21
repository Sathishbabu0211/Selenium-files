package org.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiddleRowGet {
	//This is to get alternate row value in webtable
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\vigensh\\\\\\\\eclipse-workspace\\\\\\\\SeleniumInstallation\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement tagname = driver.findElement(By.id("customers"));
		List<WebElement> allrows = tagname.findElements(By.tagName("tr"));
		
		for (int i = 0; i < allrows.size(); i++) {
			if(i%2==1) {
			WebElement alternaterow = allrows.get(i);
			String text = alternaterow.getText();
			System.out.println(text);
			
			
			}
			
		}
		
		
		
		
	}

}
