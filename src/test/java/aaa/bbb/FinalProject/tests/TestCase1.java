package aaa.bbb.FinalProject.tests;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import aaa.bbb.FinalProject.pages.PageExample;
import aaa.bbb.FinalProject.pages.SeleniumTest;
import aaa.bbb.FinalProject.utils.ElementsAction;

public class TestCase1 extends BaseTest {

	
	SeleniumTest SeleniumTest = new SeleniumTest(super.driver);
	//XML that initializes all tests



	@Test
	public void f() {

		SeleniumTest.selectTopMenu("Selenium", "Table Demo");
	}



}

