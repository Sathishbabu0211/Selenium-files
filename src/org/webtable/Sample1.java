package org.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	//To get last row from the webtable
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement tabledata = driver.findElement(By.id("customers"));
		List<WebElement> allrows = tabledata.findElements(By.tagName("tr"));
		
		int row = allrows.size();
		
		for (int i = row-1;i < row; i++) {
			
			WebElement lastrow = allrows.get(i);
			String text = lastrow.getText();
			System.out.println(text);
			
			
		}
		}
		


}
