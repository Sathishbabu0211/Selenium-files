package task.day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();		
		//Debit side
		WebElement source = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement Destination = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, Destination).perform();
		
		WebElement Sourcetwo = driver.findElement(By.id("fourth"));
		WebElement DestinationTwo = driver.findElement(By.id("amt7"));
		
		Actions action1 = new Actions(driver);
		action1.dragAndDrop(Sourcetwo, DestinationTwo).perform();
		
		//Credit side
		WebElement Sourcethree = driver.findElement(By.id("credit1"));
		WebElement Destinationthree = driver.findElement(By.id("loan"));
		
		Actions action2 = new Actions(driver);
		action2.dragAndDrop(Sourcethree, Destinationthree).perform();
		
		WebElement Sourcefour = driver.findElement(By.id("fourth"));
		WebElement Destinationfour = driver.findElement(By.id("amt8"));
		
		Actions action3 = new Actions(driver);
		action3.dragAndDrop(Sourcefour, Destinationfour).perform();
		
		WebElement txtperfect = driver.findElement(By.xpath("//a[contains(text(),'Perfect')]"));
		String text = txtperfect.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
	}

}
