package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//To take Screenshot
				TakesScreenshot fb = (TakesScreenshot)driver;
				File screenshotAs = fb.getScreenshotAs(OutputType.FILE);
				System.out.println(screenshotAs);
				driver.quit();
				
				FileHandler.copy(screenshotAs, new File ("D:\\Screenshot\\fb1.png"));
				
	}

}
