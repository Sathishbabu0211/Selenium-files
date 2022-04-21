package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionThirteen {
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement txtmbnum = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		
		txtmbnum.sendKeys("784515485");
		
		WebElement continuebtn = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		
		continuebtn.click();


}
}
