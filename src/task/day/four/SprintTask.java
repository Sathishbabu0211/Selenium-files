package task.day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SprintTask {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.t-mobile.com/?src=spr&rdpage=/");
		driver.manage().window().maximize();
		
		WebElement clkPopup1 = driver.findElement(By.xpath("//button[@class='phx-modal__close']"));
		clkPopup1.click();
		Thread.sleep(3000);
		
		WebElement clkPopup = driver.findElement(By.className("tntOverlayCloseBtn"));
		clkPopup.click();
		Thread.sleep(3000);
		
		WebElement movetoPD = driver.findElement(By.xpath("//a[contains(text(),'Phones & devices')]"));
		Actions action = new Actions(driver);
		action.moveToElement(movetoPD).perform();
		
		
		WebElement clkbtn = driver.findElement(By.xpath("//a[@href='/devices/5g-phones?INTNAV=tNav%3ADevices%3A5GPhones']"));
		clkbtn.click();
		
		WebElement txtprint = driver.findElement(By.xpath("//a[@id='digital-footer-bottom-link-bottom-9']"));
		String text = txtprint.getText();
		System.out.println(text);
		
		
		
		
		
		

}
}