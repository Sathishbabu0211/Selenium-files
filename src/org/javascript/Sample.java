package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement txtusername = driver.findElement(By.id("email"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].setAttribute('value','Sathish@123')", txtusername);
	Object name = executor.executeScript("return arguments[0].getAttribute('value')", txtusername);
	System.out.println(name);
	
	
	WebElement txtpassword = driver.findElement(By.id("pass"));
	executor.executeScript("arguments[0].setAttribute('value','nakhfhkahf')", txtpassword);
	Object pass = executor.executeScript("return arguments[0].getAttribute('value')", txtpassword);
	System.out.println(pass);
	
	
	
	}

}