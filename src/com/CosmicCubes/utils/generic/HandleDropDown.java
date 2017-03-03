package com.CosmicCubes.utils.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	
	public static void selectDDLByIndex(WebElement ddl, int index) {
		
		Select sct = new Select(ddl);
		sct.selectByIndex(index);
	}
	
	public static void selectDDLByValue(WebElement ddl, String value) {
		
		Select sct = new Select(ddl);
		sct.selectByValue(value);
	}
	
	public static void selectDDLByVisibletext(WebElement ddl, String text) {
		
		Select sct = new Select(ddl);
		sct.selectByVisibleText(text);
		
	}
	
	public static boolean VerifyDropDown(WebElement ddl) {
		
		Select sct = new Select(ddl);
		boolean status = sct.isMultiple();
		return status;
				
	}

	public static void deselectAll(WebElement ddl) {
		Select sct = new Select(ddl);
		try {
			
			sct.deselectAll();
			
		}
		catch (Exception e) {
			System.out.println("Invalid operation");
		}
		
	}
	
public static void deselectDDLByIndex(WebElement ddl, int index) {
		
		Select sct = new Select(ddl);
try {
			
	sct.deselectByIndex(index);
			
		} 
catch (Exception e) {
			System.out.println("Invalid operation");
		}
		
	}
	
	public static void deselectDDLByValue(WebElement ddl, String value) {
		
		Select sct = new Select(ddl);
		try {
			
			sct.deselectByValue(value);
					
				}
		catch (Exception e) {
					System.out.println("Invalid operation");
				}
		
	}
	
	public static void deselectDDLByVisibletext(WebElement ddl, String text) {
		
		Select sct = new Select(ddl);
		try {
			
			sct.deselectByVisibleText(text);
					
				}
		catch (Exception e) {
					System.out.println("Invalid operation");
				}
		
		
	}
}
