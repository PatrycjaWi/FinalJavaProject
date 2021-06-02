package aaa.bbb.FinalProject.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import aaa.bbb.FinalProject.pages.*;
import aaa.bbb.FinalProject.utils.ElementsAction;
import aaa.bbb.FinalProject.utils.Reporter;

public class GuruTable extends BasePage{

	// Elements
	By table = By.xpath("//table");
	static By cellsTd = By.tagName("td");
     int expectedNumber = 12;
	public GuruTable(WebDriver driver) {

		super(driver);

	}

	public int getTableCellsCount() {
		
			WebElement tableElement = driver.findElement(table);
			List<WebElement> cells = tableElement.findElements(cellsTd);
			Reporter.reportStep(ReporterStatus.INFO, "num Of cells: "+ cells.size());
			return cells.size();
	}

	public int getTableCellsCountByValue(String value) {

		try {
			int counter = 0;
			WebElement tableElement = driver.findElement(table);
			List<WebElement> cells = tableElement.findElements(By.xpath(".//td[.='" + value + "']"));
			counter = cells.size();
			List<WebElement> cells1 = tableElement.findElements(cellsTd);
			for(WebElement e : cells1) {
				if(e.getText().trim().equals(value)) {
					counter++;
				}
				
			}
			return counter;
			
		} catch (Exception e) {
			Reporter.reportFailStep("The table count is Fail", null, driver);
	
		}
		return 0;

	}

	public void verifyNrOfCells (int counter, int expectedNumber){
		try {
			
				Assert.assertEquals(counter, expectedNumber);
				Reporter.reportStep(ReporterStatus.INFO, getTableCellsCount());
			}
		
		 catch (Exception e) {
			
		}
	
		
	}

}