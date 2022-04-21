package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionFive {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement clkinterview = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		
		clkinterview.click();
		
		WebElement clickcts = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0']"));
		
		clickcts.click();
		
		
	}

}
