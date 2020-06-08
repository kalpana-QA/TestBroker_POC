package com.testbroker.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.Reporter;

import com.testbroker.generic.WaitStatementLib;


import io.qameta.allure.Step;

public class LoginPage  {
		
	@FindBy(xpath="//span")
	private WebElement proceedButton;
	
	@FindBy(xpath="//input[@id='input-18']")
	private WebElement usernameField;
	
	@FindBy(xpath="//input[@id='input-22']")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[@class='login-button aegis-login-button v-btn v-btn--depressed theme--light v-size--large']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[@class='v-btn__content']")
	private WebElement authorize;
	 WebDriver driver;

	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void dashboardClick(){
		proceedButton.click();;

	}
	@Step("2.Login with username: {0} step....")
	public void usernameField(String username) throws InterruptedException{
		//WaitStatementLib.explicitlyWaitForClickable(driver, 20, usernameField);
		//WaitStatementLib.threadSleepOfEightSec();
		Thread.sleep(15000);
		usernameField.sendKeys(username);

	}
	@Step("3.Login with password: {0} step....")
	public void passwordField(String password) throws InterruptedException{
		Thread.sleep(1000);

		passwordField.sendKeys(password);

	}
	@Step("4.Click on login button to land on login screen step....")
	public void LoginClick(){
		//WaitStatementLib.explicitlyWaitVisibilityOf(driver1, 20, loginButton);
		
		loginButton.click();
	}
	
	@Step("4.Click on login button to land on login screen step....")
	public void authorizeButton() throws InterruptedException{
		//WaitStatementLib.explicitlyWaitVisibilityOf(driver1, 20, loginButton);
		Thread.sleep(10000);
		authorize.click();
	}
	
}
