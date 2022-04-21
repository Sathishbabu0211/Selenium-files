package org.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	//To get all rows of the webtable
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement tabledata = driver.findElement(By.id("customers"));
		List<WebElement> allrow = tabledata.findElements(By.tagName("tr"));
		
		for (int i = 0; i < allrow.size(); i++) {
			WebElement row = allrow.get(i);
			String text = row.getText();
			System.out.println(text);
			
			
			List<WebElement> alltabledata = driver.findElements(By.tagName("td"));
			
			
			for (int j = 0; j < alltabledata.size(); j++) {
				WebElement data = alltabledata.get(j);
				String text1 = data.getText();
				System.out.println(text1);
				if (text.equals("Germanys")) {
					System.out.println(text);
				}
			}
			System.out.println(" ");
			
		}
		

			
		}
	}
			
			
			
			
			
			
		
	


