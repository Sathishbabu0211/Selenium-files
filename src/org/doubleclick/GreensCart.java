package org.doubleclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensCart {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://greenscart.in/#/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement txtemail = driver.findElement(By.id("loginEmailId"));
		txtemail.sendKeys("Sathishchitra004@gmail.com");
		
		WebElement txtpass = driver.findElement(By.id("loginPassword"));
		txtpass.sendKeys("Sathish@0211");
		
		
		WebElement btnlogin = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
		btnlogin.click();
		Thread.sleep(3000);
		
		WebElement txtsearch = driver.findElement(By.id("typeahead-basic"));
		txtsearch.sendKeys("iphone");
		Thread.sleep(3000);
		
		WebElement btnsearch = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']"));
		btnsearch.click();
		
		WebElement btnadd = driver.findElement(By.xpath("//button[@class='btn rounded my-2']"));
		btnadd.click();
		Thread.sleep(5000);
		
		WebElement btncart = driver.findElement(By.xpath("//a[@href='#/products/cart-items']"));
		btncart.click();
		
		WebElement btngift = driver.findElement(By.xpath("//button[@class='btn btn-block btn-outline-primary btn-lg']"));
		btngift.click();
		Thread.sleep(5000);	
		WebElement promocode = driver.findElement(By.xpath("//span[text()='GRN10']"));
		Actions action = new Actions(driver);
		action.moveToElement(promocode).doubleClick(promocode).build().perform();
		
		WebElement btnrightclick = driver.findElement(By.xpath("//span[@class='px-1 close']"));
		Thread.sleep(3000);
		Actions rightclick = new Actions(driver);
		rightclick.contextClick(btnrightclick).perform();
		
		WebElement btnremove = driver.findElement(By.xpath("//div[contains(text(),'Remove')]"));
		btnremove.click();
		
		
		
	}

}
