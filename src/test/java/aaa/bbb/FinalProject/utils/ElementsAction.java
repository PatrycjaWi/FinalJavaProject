package aaa.bbb.FinalProject.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementsAction{

	public static void click(WebDriver driver, By by, String name) {

		try {
			WebElement e = driver.findElement(by);
			click(e, name);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static WebElement mouseOver(WebDriver driver, By by, String name) {

		try {
			WebElement e = driver.findElement(by);
			
			Actions action = new Actions(driver);
			action.moveToElement(e).build().perform();

			return e;
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static void click(WebElement e, String name) {

		try {
			e.click();
			System.out.println("Clicked on " + name);
		}
		catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	public static String getText(WebDriver driver, By by, String name) {

		try {
			
			WebElement e = driver.findElement(by);
			return getText(e, name); 
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return "";
		}
	}
	
	public static String getText(WebElement e, String name) {

		try {
			
			System.out.println("Got text from " + name);
			return e.getText();
			
		}
		catch(Exception e1) {
			System.out.println(e1.getMessage());
			return "";
		}
	}
	
	public static void getTitle(WebDriver driver, By by, String name) {

		try {
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void getTitle1(WebDriver driver, By by, String name) {
	if(driver.getTitle().contains("some expected text"))
	    //Pass
	    System.out.println("Page title contains \"some expected text\" ");
	else
	    //Fail
	    System.out.println("Page title doesn't contains \"some expected text\" ");
	}

	public static void select(WebDriver driver, By carsList, String carName) {
		// TODO Auto-generated method stub
		
	}
	
}

