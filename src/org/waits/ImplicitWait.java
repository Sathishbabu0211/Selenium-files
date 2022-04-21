package org.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement btnclick = driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
		btnclick.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement txtfirstname = driver.findElement(By.name("firstname"));
		txtfirstname.sendKeys("Sathish");
		
		WebElement txtlastname = driver.findElement(By.name("lastname"));
		txtlastname.sendKeys("Babu");
		
		WebElement txtphnnum = driver.findElement(By.name("reg_email__"));
		txtphnnum.sendKeys("739793437");
		
		WebElement txtpassword = driver.findElement(By.name("reg_passwd__"));
		txtpassword.sendKeys("haofahffha");
		
		WebElement txtbirthday = driver.findElement(By.name("birthday_day"));
		txtbirthday.sendKeys("11");
		
		
		WebElement txtpass = driver.findElement(By.name("reg_passwd_"));
		txtpass.sendKeys("hfoahfiadf");
		
		
		
		
		
		
		
	}

}
