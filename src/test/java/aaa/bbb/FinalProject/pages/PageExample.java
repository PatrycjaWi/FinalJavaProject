package aaa.bbb.FinalProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageExample extends BasePage{
	
	By searchFieldLocator = By.name("q");
	
	public PageExample(WebDriver driver) {
		super(driver);
	}

	public void search(String value) {
		
		WebElement searchField = driver.findElement(searchFieldLocator);
		searchField.sendKeys(value);
		
	}
	
}
