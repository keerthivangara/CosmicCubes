package com.CosmicCubes.utils.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class HandleAlert {
	
	//click on Ok Button on Alert
	public static void acceptAlert(WebDriver driver) {
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
	}
	
	//click on cancel button
	public static void dismissAlert(WebDriver driver) {
		
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		
	}
	
	//Get alert text
	public static String getAlertText(WebDriver driver) {
		
		Alert alt = driver.switchTo().alert();
		String alertText = alt.getText();
		return alertText;
	}
	
	//To enter text on Alert TextBox
	public static void enterTextToAlert(WebDriver driver, String text) {

		Alert alt = driver.switchTo().alert();
		alt.sendKeys(text);
	}

}
