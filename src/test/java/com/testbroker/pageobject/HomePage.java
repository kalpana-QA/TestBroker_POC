package com.testbroker.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class HomePage {
	@FindBy(xpath="//div[contains(text(),'Get a quote')]")
	private WebElement getAQuotes;
	
	@FindBy(xpath="//div[contains(text(),'Vacant')]")
	private WebElement vacantIcon;
	
	
	 WebDriver driver;

	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void getQuotesClick(){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, getAQuotes);
		getAQuotes.click();;

	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void vacantIconClick(){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, vacantIcon);
		vacantIcon.click();;

	}
}