package aaa.bbb.FinalProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import aaa.bbb.FinalProject.utils.Reporter;

public class GuruDemoPage extends BasePage {
	CommonGuruPage commonGuruPage = new CommonGuruPage(driver);


	public GuruDemoPage(WebDriver driver) {
		super(driver);

	}

	//By txtGuru99DemoPage = By.xpath("//a[contains(., 'Guru99 Demo Page')]");
	By txtEmail = By.id("philadelphia-field-email");
	By txtButton = By.id("philadelphia-field-submit");

	public void setEmail(String mail) {
		try {
			driver.findElement(txtEmail).sendKeys(mail);
			driver.findElement(txtButton).click();
			Reporter.reportStep(ReporterStatus.INFO, mail);

		} catch (Exception e) {
			Reporter.reportFailStep("The step Fail", null, null);	
		}

	}
}
