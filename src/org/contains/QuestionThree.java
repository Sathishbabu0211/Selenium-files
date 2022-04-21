package org.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionThree {
	
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement clkoverview = driver.findElement(By.xpath("//span[@title='Overview']"));
		
		clkoverview.click();
		
		WebElement txtpara = driver.findElement(By.xpath("//p[contains(text(),'training class')]"));
		
		String para = txtpara.getText();
		
		System.out.println(para);
		
		
		

}
}