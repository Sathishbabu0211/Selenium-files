package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionTen {
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement clkproduct = driver.findElement(By.xpath("//span[@class='a-size-small a-color-base truncate-2line'][1]"));
		
		clkproduct.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		search.sendKeys("laptop");
		
		
		

}
}