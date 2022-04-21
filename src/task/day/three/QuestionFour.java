package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionFour {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
		
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@id='first-name']"));
		
		txtfirstname.sendKeys("sathish");
		
		WebElement txtlastname = driver.findElement(By.xpath("//input[@id='last-name']"));
		
		txtlastname.sendKeys("babu");
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@id='email']"));
		
		txtemail.sendKeys("babu@154785");
		
		WebElement txtmobile = driver.findElement(By.xpath("//input[@id='mobile']"));
		
		txtmobile.sendKeys("7845154879");
		
		WebElement txtcountry = driver.findElement(By.xpath("//select[@name='country']"));
		
		txtcountry.sendKeys("india");
		
		WebElement txtcity = driver.findElement(By.xpath("//input[@id='city']"));
		
		txtcity.sendKeys("coimbatore");
		
		WebElement txtmsg = driver.findElement(By.xpath("//textarea[@name='message']"));
		
		txtmsg.sendKeys("learning");
		
		WebElement txtcode = driver.findElement(By.xpath("//input[@id='code']"));
		
		txtcode.sendKeys("7rb2");
		
		WebElement clickbutton = driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary']"));
		
		clickbutton.click();
		
		
		
			
		
		
		
		
		
		
		
		
		
	}

}
