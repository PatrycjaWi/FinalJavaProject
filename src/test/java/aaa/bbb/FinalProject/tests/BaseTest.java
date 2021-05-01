package aaa.bbb.FinalProject.tests;

import org.testng.annotations.Test;

import aaa.bbb.FinalProject.utils.ElementsAction;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\P0028864\\Desktop\\consula\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("http://demo.guru99.com/");
		
		
	}
	
	protected void GetBasePage() {

		driver.get("http://demo.guru99.com/");

	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		
		//driver.quit();
		
		
	}

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {

		System.out.println("Thread ID is:" + Thread.currentThread().getId());

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {

			
		
	}
	
	}
