package aaa.bbb.FinalProject.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import aaa.bbb.FinalProject.utils.ElementsAction;

public class SeleniumTest extends BasePage {


	public SeleniumTest(WebDriver driver) {
		super(driver);
	}

	//By Selenium = By.xpath("a[@title='Selenium']");
	//By SeleniumBy = By.xpath("//a[contains(., 'Selenium')]");

	//a[ @class='dropdown-toggle'] 


	public void selectTopMenu(String menu, String subMenu) {

		WebElement topItem = driver.findElement(By.xpath("//a[contains(text(),'" + menu + "') and @class='dropdown-toggle']"));
		topItem.click();

		if(subMenu.equals("") == false) {
			WebElement subItem = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'" + subMenu + "')]"));
			subItem.click();

		}
	}
}

