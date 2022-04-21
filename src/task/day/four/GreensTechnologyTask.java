package task.day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologyTask {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://netbanking.hdfcbank.com/netbanking/");
		 driver.manage().window().maximize();
		 
		 WebElement txtCustomerId = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		 txtCustomerId.sendKeys("Sathish1245");
		 Thread.sleep(3000);

}
}