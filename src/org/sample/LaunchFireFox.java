package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchFireFox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\vigensh\\eclipse-workspace\\SeleniumInstallation\\Driver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://m.facebook.com/?_rdr");
	}

}
