package task.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QustionFive {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		WebElement txtlocation = driver.findElement(By.id("location"));
		
		txtlocation.sendKeys("thooraipakam");
		
		
		
		
	}

}
