package com.CosmicCubes.utils.ProjectSpec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CosmicCubes.utils.generic.GetData;

public class CreateDriver {
	
	public static WebDriver getDriver() {
		
		WebDriver driver = null;
		String browserName = GetData.fromExcel("tdata", "Configurations", 1, 0);
		String url = GetData.fromExcel("tdata", "Configurations", 1, 1);
		if (browserName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "./Browser_servers/geckodriver.exe");
			driver= new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("gc")){
			System.setProperty("WebDriver.firefox.marionette", "./Browser_servers/chromedriver.exe");
			driver= new ChromeDriver();
		}else{
			System.out.println("invalid browser name");
		}
		
		driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

}
