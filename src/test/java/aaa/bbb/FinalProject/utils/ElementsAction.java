package aaa.bbb.FinalProject.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import aaa.bbb.FinalProject.pages.ReporterStatus;
public class ElementsAction{

	public static void click(WebDriver driver, WebElement e, String name) {

		WebDriverWait wait15 = new WebDriverWait(driver, 15);
		wait15.until(ExpectedConditions.visibilityOf(e));

		Reporter.reportStep(ReporterStatus.INFO, "Clicked " + e.getTagName() + " " + name);
		e.click();

	}

	public static void click(WebDriver driver, By by, String name) {

		WebElement e = driver.findElement(by);
		click(driver, e, name);

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
	public static void sendKeys(WebDriver driver, WebElement e, String text, String name) {

		WebDriverWait wait15 = new WebDriverWait(driver, 15);
		wait15.until(ExpectedConditions.visibilityOf(e));

		Reporter.reportStep(ReporterStatus.INFO, "Entered " + text + " into " + e.getTagName() + " " + name);
		e.sendKeys(text);

	}

	public static void sendKeys(WebDriver driver, By by, String text, String name) {

		WebElement e = driver.findElement(by);
		sendKeys(driver, e, text, name);

	}

	public static boolean verifyElementText(WebDriver driver, By by, String expectedText, String name) {

		{
			WebElement e = driver.findElement(by);

			WebDriverWait wait15 = new WebDriverWait(driver, 15);
			wait15.until(ExpectedConditions.visibilityOf(e));

			Reporter.reportStep(ReporterStatus.INFO, "Got text from " + e.getTagName() + " " + name);
			String actualText = e.getText();
			if(actualText.equals(expectedText)) {
				Reporter.reportStep(ReporterStatus.PASS, "Expected: " + expectedText + "\r\nActual: " + actualText);
				return true;
			}
			else {
				Reporter.reportStep(ReporterStatus.FAIL, "Expected: " + expectedText + "\r\nActual: " + actualText);
				return false;
			}

		} 

	}




	public static boolean verifyElementIsClickable(WebDriver driver, By by, String name) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(by));
			System.out.println("Element: " + name + " is clickable");
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public static boolean verifyElementByAssert(WebDriver driver,String origValue, String valToVerify) {
		try {
			Assert.assertEquals(origValue, valToVerify);
			System.out.println("Verification: Expected: " + origValue + " Actual: " + valToVerify);
			return true;
		}
		catch (Exception e) {
			Reporter.reportFailStep(e.getMessage(), null, driver);
			return false;
		}
		catch (AssertionError e) {
			Reporter.reportFailStep(e.getMessage(), null, driver);
			return false;
		}
	}


}

