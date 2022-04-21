package org.windowshandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingId {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vigensh\\\\eclipse-workspace\\\\SeleniumInstallation\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone+11&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_5_5_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_5_5_na_na_na&as-pos=5&as-type=RECENT&suggestionId=iphone+11&requestId=1c3302f4-fcf9-4d81-b12a-c6711c42949c&as-backfill=on");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		WebElement txtlogin = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//		txtlogin.sendKeys("7397031113");
//		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
//		txtpass.sendKeys("Sathish0211");
//		WebElement btnclick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//		btnclick.click();
		
		WebElement btniphone = driver.findElement(By.xpath("//div[contains(text(),'White, 64 GB')][1]"));
		btniphone.click();
		WebElement btniphoneblack = driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 11 (Black, 128 GB)')]"));
		btniphoneblack.click();
		
		String winId = driver.getWindowHandle();
		System.out.println(winId);
		Set<String> allwinid = driver.getWindowHandles();
		System.out.println(allwinid);
		
		List<String> l = new ArrayList<String>();
		l.addAll(allwinid);
		
		int count = 0;
		
		for (String win : allwinid) {
			if (count == 0) {
				driver.switchTo().window(win);
				
			}
			count ++;
		}
		
		
		
	}

}
