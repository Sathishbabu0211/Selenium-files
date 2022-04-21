package org.frames;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Sample3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/*WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframetop']"));
		driver.switchTo().frame(frame);*/
		WebElement txtlogin = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		txtlogin.sendKeys("Sathish@123");
		
		driver.findElement(By.xpath("//img[@id='user-id-goahead'][1]")).click();
		driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL")).sendKeys("sathish");
		driver.findElement(By.name("AuthenticationFG.ACCESS_CODE")).sendKeys("ndhdimd");
		
		WebElement dropmain = driver.findElement(By.className("selectedTxt"));
		dropmain.click();
		
		WebElement dropdowns = driver.findElement(By.xpath("//a[text()='Bank Account']"));
		/*Select dropdown = new Select(dropdowns);
		dropdown.selectByVisibleText("Bank Account");
		*/
		dropdowns.click();
		driver.findElement(By.name("AuthenticationFG.REMEMBER_USERID_CHECKBOX")).click();
		driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
		
		
	}

}
