package aaa.bbb.FinalProject.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class NewTest {
  //@Test
  /*public void f() {
		@Test
		public void testTable() throws InterruptedException, IOException  {
			//Read File
			Properties envProps = new Properties();
			InputStream inputStream = null;
			inputStream = new FileInputStream("env.propeties");
			envProps.load(inputStream);
			//Get and use value
			String url = envProps.getProperty("url");
			driver.get(url);
			
		W3cTable w3cTable = new W3cTable(driver);
		String value = w3cTable.getCustomerData(3, "UK", 1);
		System.out.println(value);
		
		
		
	}

		@Test
		public void saar() throws InterruptedException {
		driver.get("http://10.64.17.81:9080/saar/component/main");
		
		}
	
 @Test
public void f() {
	  
	  // Main page
	  GuruMain guruMain = new GuruMain(driver);
	  // Challenge: pass as one parameter: "Selenium;Table Demo"
	  guruMain.selectTopMenu("Selenium", "Table Demo");
	  
	  // Table page
	  GuruTable guruTable = new GuruTable(driver);
	  int numOfCells = guruTable.getTableCellsCount();
	  System.out.println("Number of Cells is: " + numOfCells);
	  int numOfCellsWithValue = guruTable.getTableCellsCountByValue("7");
	  System.out.println("Number of Cells with 6 is: " + numOfCellsWithValue);
	  
	  //Ajax page
	  //GuruAjax guruAjax = new GuruAjax(driver);
	  //guruAjax.selectTopMenu("Selenium", "Ajax Demo");
  }
 public class GuruTable extends GuruCommon {
		
		// Elements
		By table = By.xpath("//table");
		
		public GuruTable(WebDriver driver) {
			
			super(driver);
			
		}
		
		public int getTableCellsCount() {
			
			WebElement tableElement = driver.findElement(table);
			List<WebElement> cells = tableElement.findElements(By.tagName("td"));
			return cells.size();
			
		}
		
		public int getTableCellsCountByValue(String value) {
			
			int counter = 0;
			WebElement tableElement = driver.findElement(table);
			List<WebElement> cells = tableElement.findElements(By.xpath(".//td[.='" + value + "']"));
			counter = cells.size();
			
			//List<WebElement> cells = tableElement.findElements(By.tagName("td"));
			//for(WebElement e : cells) {
			//	if(e.getText().trim().equals(value)) {
			//		counter++;
			//	}
			//	
			//}
			return counter;
			
		}*/

}
