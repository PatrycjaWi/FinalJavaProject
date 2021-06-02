package aaa.bbb.FinalProject.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import aaa.bbb.FinalProject.pages.CommonGuruPage;
import aaa.bbb.FinalProject.pages.GuruTable;
import aaa.bbb.FinalProject.utils.Reporter;

public class TestTable extends BaseTest {
	@Test
	(groups = { "groupNr1" })	
	@Parameters({"menu","subMenu","value","imagePath","expectedNumber" ,"counter" })
	public void f(String menu, String subMenu,String value,String imagePath,int expectedNumber,int counter) throws InterruptedException {

		
		CommonGuruPage commonGuruPage = new CommonGuruPage(driver);
		commonGuruPage.selectTopMenu( menu, subMenu);
		GuruTable guruTable = new GuruTable(driver);
		guruTable.getTableCellsCount();
		guruTable.getTableCellsCountByValue(value);
		guruTable.verifyNrOfCells(counter, expectedNumber);
		Reporter.imagePath = imagePath;
	}


}

