package task.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionEight {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement txtfirstname = driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		
		txtfirstname.sendKeys("sathish");
		
        WebElement txtlastname = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
		
		txtlastname.sendKeys("kumar");
		
        WebElement txtaddress = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-valid"));
		
		txtaddress.sendKeys("chennai");
		
        WebElement txtemail = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required"));
		
		txtemail.sendKeys("sathish@457");
		
		WebElement txtphnnumber = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern"));
		
		txtphnnumber.sendKeys("7845154575");
		
		WebElement txtlang = driver.findElement(By.id("msdd"));
		
		txtlang.sendKeys("Tamil");
		
		WebElement txtpass = driver.findElement(By.id("firstpassword"));
		
		txtpass.sendKeys("15464");
		
		WebElement txtconfirmpass = driver.findElement(By.id("secondpassword"));
		
		txtconfirmpass.sendKeys("15464");
		
		
		
		
}		


}
