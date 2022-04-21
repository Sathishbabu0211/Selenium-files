package org.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement webtable = driver.findElement(By.id("customers"));
		Thread.sleep(3000);
		List<WebElement> allrows = driver.findElements(By.tagName("tr"));
		//List<WebElement> tdata = driver.findElements(By.tagName("td"));
		/*for (int i = 0; i < tdata.size(); i++) {
			WebElement element = tdata.get(i);
			String text = element.getText();
			System.out.println(text);
		*/	
		int l = allrows.size();
		for (int i = l-1; i < l;) {
			System.out.println(i);
			
		}
				
			}
		}
	
		
	