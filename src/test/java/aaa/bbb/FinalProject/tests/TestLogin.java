package aaa.bbb.FinalProject.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import aaa.bbb.FinalProject.pages.CommonGuruPage;
import aaa.bbb.FinalProject.pages.GuruLogin;
import aaa.bbb.FinalProject.utils.ElementsAction;
import aaa.bbb.FinalProject.utils.Reporter;

public class TestLogin extends BaseTest {

	//XML that initializes all tests

	//(dataProvider = "dp") 
	@Test(groups = {"groupNr1" ,"groupNr2" })
	@Parameters({"menu","subMenu","imagePath"})
	public void f(String menu, String subMenu, String imagePath) throws InterruptedException {

		CommonGuruPage commonGuruPage = new CommonGuruPage(driver);
		commonGuruPage.selectTopMenu( menu, subMenu);
		GuruLogin guruLogin = new GuruLogin(driver);
		guruLogin.LoginEmail();
		guruLogin.verifyLoginToTheSite();
		Reporter.imagePath = imagePath;
	}


	/*@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] {"Selenium", "Login","C:\\Users"},

		};
	}*/

}




