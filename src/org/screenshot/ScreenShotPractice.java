package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotPractice {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ss = (TakesScreenshot)driver; 
		File fb = ss.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(fb, new File("D:\\Screenshot\\fb.png"));
		
		
	}
	

}
