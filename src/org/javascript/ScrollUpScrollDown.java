package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpScrollDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement txtamazon = driver.findElement(By.xpath("//a[contains(text(),'Amazon Business')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", txtamazon);
		Thread.sleep(3000);
		
		WebElement txttop = driver.findElement(By.xpath("//h2[contains(text(),'Top picks')]"));
		executor.executeScript("arguments[0].scrollIntoView(false)", txttop);
		
		
		
		
		
	}

}
