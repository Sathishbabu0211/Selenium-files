package task.day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook1 {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 
		 WebElement btnCreateNew = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		 btnCreateNew.click();
		 Thread.sleep(3000);
		 
		 WebElement txtFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		 txtFirstName.sendKeys("Sathish");
		 
		 WebElement txtLastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		 txtLastName.sendKeys("Babu");
		 
		 WebElement txtphnNum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		 txtphnNum.sendKeys("5487514236");
		 
		 WebElement txtNewPass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		 txtNewPass.sendKeys("sahoara");

		 

}
}