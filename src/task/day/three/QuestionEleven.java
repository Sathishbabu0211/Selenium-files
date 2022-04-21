package task.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionEleven {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		
		txtfirstname.sendKeys("Ravi");
		
		WebElement txtlastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		
		txtlastname.sendKeys("Kumar");
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@name='Username']"));
		
		txtusername.sendKeys("sathishbabu1234");
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@name='Passwd']"));
		
		txtpass.sendKeys("kadhfkaf5142");
		
		WebElement txtcnpass = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		
		txtcnpass.sendKeys("kadhfkaf5142");
		
		WebElement clknext = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d'][1]"));
		
		clknext.click();
		
		
		
		
}

}
