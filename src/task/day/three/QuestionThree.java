package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionThree {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@type='text'][1]']"));
		
		txtfirstname.sendKeys("sathish");
		
		WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		txtlastname.sendKeys("babu");
		
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		
		txtaddress.sendKeys("chennai");
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
		
		txtemail.sendKeys("sathish@1542");

		WebElement txtphn = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']"));
		
		txtphn.sendKeys("7845154862");
		
		
		
		
		
		
	}

}
