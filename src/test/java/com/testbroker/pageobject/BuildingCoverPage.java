package com.testbroker.pageobject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.testbroker.generic.ExcelUtilityLib;
import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class BuildingCoverPage {
	static final String LoginCredentials = "LoginCredentials_Sheet";

	@FindBy(xpath="(//input[@type='checkbox']/../..//label)[3]")
	private WebElement useAddressCheckBox;

	@FindBy(xpath="//div[@class='v-input theme--light v-input--selection-controls v-input--checkbox']//div[@class='v-input--selection-controls__ripple']")
	private WebElement manualAddressCheckbox;

	@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')])[1]")
	private WebElement buildingvacant12month;

	@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')])[2]")
	private WebElement structuredemolition;

	@FindBy(xpath="//div[@class='v-input create-activity-input theme--light v-text-field v-text-field--filled v-text-field--is-booted v-text-field--enclosed v-select v-autocomplete']")
	private WebElement fusScore;

	@FindBy(xpath="//div[contains(text(),'1-4')]")
	private WebElement score;

	@FindBy(xpath="//span[text()='Total Insured Value']/..//following-sibling::input")
	private WebElement totolInsuredValue;

	@FindBy(xpath=" //div[contains(text(),'CA$ 1,000')]")
	private WebElement cavalue;
	@FindBy(xpath="//div[contains(text(),'Frame / Timber')]")
	private WebElement frametimber;
	@FindBy(xpath="//div[contains(text(),'Under 15 years')]")
	private WebElement buildingAge;
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'Yes')]")
	private WebElement yesoption;
	@FindBy(xpath="//div[contains(text(),'All Risks')]")
	private WebElement allriskvalue;

	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')]")
	private WebElement insuranceoption;
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'0')]")
	private WebElement zerocliam;
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'CA$ 1,000,000')]")
	private WebElement limitrequired;
	@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'CA$ 1,000')])[2]")
	private WebElement deductiblerequired;
	@FindBy(xpath="//div[@id='c2ms5d77742985f6c3_88132932']//button[1]")
	private WebElement loss;
	
	@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'0')])[2]")
	private WebElement mortageorloan;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[@class='v-card__text']//button[1]")
	private WebElement generalLiabiltyCover;
	
	@FindBy(xpath="//span[contains(text(),'Get Quote')]")
	private WebElement getQuote;

	@FindBy(xpath="//span[contains(text(),'PROCEED')]")
	private WebElement proceed;

	@FindBy(xpath="//div[@class='v-dialog__content v-dialog__content--active']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]")
	private WebElement confirmCheckbox;
	@FindBy(xpath="(//div[text()='Current total gross premium']/..//preceding-sibling::div)[2]")
	private WebElement grossamount;
	WebDriver driver;


	public BuildingCoverPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void usemailingAddress(){
		useAddressCheckBox.click();
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void manualAddressCheckbox(){
		manualAddressCheckbox.click();
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void buildingVacantOption(){
		buildingvacant12month.click();
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void structureDemolition(){
		structuredemolition.click();
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void scroll(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", buildingvacant12month);
		js.executeScript("window.scrollBy(0,1000)");
	}
	public void frameTimberClick() throws InterruptedException{
		WaitStatementLib.threadSleepOfFourSec();
		frametimber.click();
	}
	public void fuscSore() throws InterruptedException{
		WaitStatementLib.threadSleepOfFourSec();
		fusScore.click();
		WaitStatementLib.threadSleepOfFourSec();
		score.click();
	}
	@Step("2.Login with username: {0} step....")
	public void totolInsuredValue(String totalvalue) throws InterruptedException{
		WaitStatementLib.threadSleepOfEightSec();
		WaitStatementLib.explicitlyWaitForClickable(driver, 20, totolInsuredValue);
		totolInsuredValue.sendKeys(totalvalue);
	}
	public void caValue() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		cavalue.click();
	}
	public void buildingAge() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();

		buildingAge.click();
	}
	public void yesoption() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();

		yesoption.click();
	}
	public void allRiskValue() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();

		allriskvalue.click();
	}
	public void insuranceOption() throws InterruptedException{
		WaitStatementLib.threadSleepOfFourSec();

		insuranceoption.click();
	}
	public void zeroClaim() throws InterruptedException{
		WaitStatementLib.threadSleepOfFourSec();

		zerocliam.click();
	}
	public void limitRequired() throws InterruptedException{
		WaitStatementLib.threadSleepOfFourSec();

		limitrequired.click();
	}
	public void deductableRequired() throws InterruptedException{
		WaitStatementLib.threadSleepOfFourSec();

		deductiblerequired.click();
	}
	public void lossValue() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		loss.click();
	}
	public void mortageOrLoan() throws InterruptedException{
		WaitStatementLib.threadSleepOfEightSec();
		mortageorloan.click();
	}
	public void generalLiabilityCover() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		generalLiabiltyCover.click();
	}
	public void getQuote() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		getQuote.click();
	}
	public void confirmCheckbox() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		confirmCheckbox.click();
	}
	public void proceed() throws InterruptedException{
		WaitStatementLib.threadSleepOfTwoSec();
		proceed.click();
	}
	public void verifyGrossAmount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		WaitStatementLib.threadSleepOfEightSec();
		WaitStatementLib.threadSleepOfEightSec();
		String Actual=grossamount.getText();
		String Expected=ExcelUtilityLib.getKeyValue(LoginCredentials, "GrossValue", "Valid-GrossValue");
		Assert.assertEquals(Actual, Expected, "The amount of gross value is not correct");
		Reporter.log("The amount of gross value is expected", true);
	}
}
