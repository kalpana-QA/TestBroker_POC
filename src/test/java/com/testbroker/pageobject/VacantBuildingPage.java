package com.testbroker.pageobject;

import org.apache.poi.xwpf.usermodel.ICell;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class VacantBuildingPage {
	@FindBy(xpath="//div[@class='v-card__text']//button[1]//span[1]")
	private WebElement vacantBuildingIcon;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement nextButton;
	
	@FindBy(xpath="//input[@id='input-143']")
	private WebElement inceptiondatedrpdwn;
	
	@FindBy(xpath="//input[@id='input-151']")
	private WebElement expireDate;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')]")
	private WebElement noButton;
	
	@FindBy(xpath="//span[text()='Full name']")
	private WebElement fullnamefield;
	
	@FindBy(xpath="//span[text()='//label[contains(text(),'Start typing to find addresses')]']")
	private WebElement mailingaddressfield;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkboxfield;
	
	@FindBy(xpath="//span[contains(text(),'Street number')]")
	private WebElement streetnumberfield;
	
	@FindBy(xpath="//span[text()='Zip']")
	private WebElement zipfield;
	
	 WebDriver driver;

	
	public VacantBuildingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void vacantBuildingClick(){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, vacantBuildingIcon);
		vacantBuildingIcon.click();;

	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void nextButton(){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, nextButton);
		nextButton.click();;

	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void inceptionDate(){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, inceptiondatedrpdwn);
		inceptiondatedrpdwn.click();
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void dateSelect(String startdate ){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, inceptiondatedrpdwn);
		driver.findElement(By.xpath("//div[@class='v-btn__content'][contains(text(),'"+startdate+"')]"));
		}
	public void verifytimeBetween() {
		inceptiondatedrpdwn.getText();
		expireDate.getText();
		
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void noButtonClick(){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, noButton);
		noButton.click();
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void fullName(String fullname ){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, fullnamefield);
		fullnamefield.sendKeys(fullname);
		}
	@Step("1.Click on Proceed to Dashboard step....")
	public void addressField(String address ){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, mailingaddressfield);
		mailingaddressfield.sendKeys(address);
		mailingaddressfield.sendKeys(Keys.ARROW_DOWN);
		mailingaddressfield.sendKeys(Keys.ENTER);
		}
	@Step("1.Click on Proceed to Dashboard step....")
	public void checkbox(){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, checkboxfield);
		checkboxfield.click();
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void streetName(String street ){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, streetnumberfield);
		streetnumberfield.sendKeys(street);
		}
	@Step("1.Click on Proceed to Dashboard step....")
	public void zipcode(String zip ){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, zipfield);
		zipfield.sendKeys(zip);
		}
}
