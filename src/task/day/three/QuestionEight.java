package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionEight {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement modres = driver.findElement(By.xpath("//div[@id='heading201']"));
		
		modres.click();
		
		WebElement res1 = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Fresher_Selenium_Resume.pdf']"));
		
		res1.click();
		
		

}
}