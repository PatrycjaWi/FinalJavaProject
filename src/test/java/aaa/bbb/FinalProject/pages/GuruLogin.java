package aaa.bbb.FinalProject.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import aaa.bbb.FinalProject.utils.ElementsAction;

public class GuruLogin extends BasePage {

	By txtEmail = By.id("email");
	By loginB = By.id("SubmitLogin");
	String text = "pati@gmail.com";
	String name = "pati";
	By txtOfSuccessLogin = By.xpath("//*[contains(@class,'error-copy')] ");
	public GuruLogin(WebDriver driver) {
		super(driver);
	}

	public void LoginEmail() {
		ElementsAction.sendKeys(driver, txtEmail, text, name);
		ElementsAction.click(driver, loginB, "name");
		
	};

	public void verifyLoginToTheSite () {
		ElementsAction.verifyElementText(driver, txtOfSuccessLogin, "Successfully Logged in...", name);
		
		
	}

}

