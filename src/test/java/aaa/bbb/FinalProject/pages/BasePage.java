package aaa.bbb.FinalProject.pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mongodb.MapReduceCommand.OutputType;

import aaa.bbb.FinalProject.utils.ElementsAction;

public class BasePage {

	public WebDriver driver;

	public BasePage(WebDriver driver) {

		this.driver = driver;

	}

	public void GetBasePage() {

		driver.get("http://demo.guru99.com/");

	}


	/*public void selectTopMenu(String menuText) throws InterruptedException {

		WebElement menuItem = driver.findElement(By.linkText(menuText));
		ElementsAction.click(driver, menuItem, menuText);
		Thread.sleep(2000);
		
		 menuItem.click();


	}*/
	

}


