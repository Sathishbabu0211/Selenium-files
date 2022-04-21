package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionFourteen {
	
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		WebElement signup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		
		signup.click();
		
		WebElement txtphnnum = driver.findElement(By.xpath("//input[@class='_381fS']"));
		
		txtphnnum.sendKeys("784515485");
		
		WebElement txtname = driver.findElement(By.xpath("//input[@id='name']"));
		
		txtname.sendKeys("Sathish");
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@id='email']"));
		
		txtemail.sendKeys("Sathish@125487");
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@id='password']"));
		
		txtpass.sendKeys("487885");
		
		WebElement clkcontinue = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		
		clkcontinue.click();
		
		
		
		
		

}
}