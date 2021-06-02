package aaa.bbb.FinalProject.utils;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import aaa.bbb.FinalProject.pages.FileUtils;
import aaa.bbb.FinalProject.pages.ReporterStatus;


public class Reporter {
	
	public static String imagePath = "C://Temp";
	
	public enum ReporterStatus1 {

	    FAIL,
	    PASS,
	    WARNING,
	    INFO
	}
	
	public static void startReport() {
		
		
	}
	
	public static void endReport() {
		
		
	}
	
/*public static void reportFailStep(String stepDescription) {
		
		
		reportStep(ReporterStatus.FAIL, stepDescription);
	}*/
	
	public static void reportFailStep(String stepDescription ,By by , WebDriver driver) {
		String filePath = "";
		
		if (by != null && driver != null)
		{
			filePath = takeItemScreenshot(by, driver);
			
			if (filePath != null)
			{
				filePath = "\r\nerror screenshot path :" + filePath;
			}
		}
		
		reportStep(ReporterStatus.FAIL, stepDescription + filePath);
		
		
	}
	public static String takeItemScreenshot(By by , WebDriver driver)  {
		String filePath =null;
		try {
			WebElement element = driver.findElement(by);
			File src = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
			filePath = imagePath + Math.abs(Math.random()) + System.currentTimeMillis();
			FileUtils.copyFile(src, new File(filePath));
			
			//System.currentTimeMillis(); Math.random();
		} catch (Exception e) {
			//Reporter.reportFailStep("The exception for takeItemScreenshot function. " + e.getMessage());
		}
		return filePath;
	}

//	public  void takeScreenshot(String imagePath)  {
//		try {
//
//			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(src, new File(imagePath));
//		} catch (Exception e) {
//			Reporter.reportFailStep("The exception for takeItemScreenshot function. " + e.getMessage());
//		}
//	}
	
	
	public  static void reportStep(ReporterStatus stepStatus, int stepDescription) {
		
		reportStep(stepStatus, String.valueOf(stepDescription));
		
	}

	public static void reportStep(ReporterStatus stepStatus, String stepDescription) {
		
		System.out.println(stepStatus + ": " + stepDescription);
		
	}

}