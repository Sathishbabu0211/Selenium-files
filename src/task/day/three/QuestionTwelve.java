package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionTwelve {
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement clksignup = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		
		clksignup.click();
		
		WebElement clkregister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		
		clkregister.click();
		
		WebElement txtmbnum = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		
		txtmbnum.sendKeys("784515485");
		

		WebElement clkcontinue = driver.findElement(By.xpath("//button[@id='checkUser']"));
		
		clkcontinue.click();
		
		
		
		
		
		

}
}