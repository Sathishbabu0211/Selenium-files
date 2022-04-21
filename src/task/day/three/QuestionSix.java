package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionSix {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement clickdownarrow = driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
		
		clickdownarrow.click();
		
		WebElement signup = driver.findElement(By.xpath("//li[@id='signInLink']"));
		
		signup.click();
		
		WebElement phnnum = driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number'][1]"));
		
		phnnum.sendKeys("7841545784");
		
		WebElement robotbox = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
		
		robotbox.click();
		
		WebElement otbbox = driver.findElement(By.xpath("//span[@class='f-w-b']"));
		
		otbbox.click();
		
		
		
		
		
		
		
		
		
		

}
}