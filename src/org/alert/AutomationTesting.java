package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement btntextbox = driver.findElement(By.xpath("//a[contains(text(),'Textbox')]"));
		btntextbox.click();
		
		WebElement btnpromptbox = driver.findElement(By.xpath("//button[contains(text(),'demonstrate')]"));
		btnpromptbox.click();
		
		Alert txtbox = driver.switchTo().alert();
		txtbox.sendKeys("Sathish babu");
		txtbox.accept();
		
		WebElement txtsathish = driver.findElement(By.xpath("//p[contains(text(),'Sathish babu')]"));
		String text = txtsathish.getText();
		System.out.println(text);
		
		
		
		
		
	}

}
