package aaa.bbb.FinalProject.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import aaa.bbb.FinalProject.pages.CommonGuruPage;
import aaa.bbb.FinalProject.pages.GuruDemoPage;
import aaa.bbb.FinalProject.utils.ElementsAction;
import aaa.bbb.FinalProject.utils.Reporter;




//XML that initializes all tests

public class TestDemoPage extends BaseTest{
	

	@Test(groups = { "groupNr1" })
	@Parameters({"menu","subMenu","mail","imagePath"})
	public void f(String menu, String subMenu,String mail, String imagePath) throws InterruptedException {
		
		CommonGuruPage commonGuruPage = new CommonGuruPage(driver);
		commonGuruPage.selectTopMenu( menu, subMenu);
		GuruDemoPage guruDemoPage = new GuruDemoPage(driver);
		guruDemoPage.setEmail(mail);
		Reporter.imagePath = imagePath;
		

	}

}