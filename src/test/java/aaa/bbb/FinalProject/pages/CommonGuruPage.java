package aaa.bbb.FinalProject.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import aaa.bbb.FinalProject.utils.Reporter;

public class CommonGuruPage extends BasePage {


	public CommonGuruPage(WebDriver driver) {
		super(driver);
	}
	String imagePath =("//c");
	public void selectTopMenu(String menu, String subMenu) {

		try {
			WebElement topItem = driver.findElement(By.xpath("//a[contains(text(),'" + menu + "') and @class='dropdown-toggle']"));
			topItem.click();

			if(subMenu.equals("") == false) {
				WebElement subItem = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'" + subMenu + "')]"));
				subItem.click();
			}
			Reporter.reportStep(ReporterStatus.INFO,"Clicked"+ menu + "and"   + subMenu);
		} catch (Exception e) {
			Reporter.reportFailStep("The exception for selectTopMenu function. " + e.getMessage(), null, driver);	
		}
	}
	
	
	public static boolean verifyElementText(WebDriver driver, By by, String expectedText, String name) {

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
