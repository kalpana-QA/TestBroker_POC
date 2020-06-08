package com.testbroker.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class BuildingCoverPage {
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
	@FindBy(xpath="//div[contains(text(),'16-30 years')]")
	private WebElement buildingAge;
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'Yes')]")
	private WebElement yesoption;
	@FindBy(xpath="//div[contains(text(),'All Risks')]")
	private WebElement allriskvalue;

	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')]")
	private WebElement insuranceoption;

	@FindBy(xpath="//div[@id='c2ms5d77742985f6c3_88132932']//button[1]")
	private WebElement loss;
	
	@FindBy(xpath="(//div[@class='v-window-item v-window-item--active']//div[contains(text(),'0')])[2]")
	private WebElement mortageorloan;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[@class='v-card__text']//button[2]")
	private WebElement generalLiabiltyCover;
	
	@FindBy(xpath="//span[contains(text(),'Get Quote')]")
	private WebElement getQuote;

	@FindBy(xpath="//span[contains(text(),'PROCEED')]")
	private WebElement proceed;

	@FindBy(xpath="//div[@class='v-dialog__content v-dialog__content--active']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]")
	private WebElement confirmCheckbox;
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
	public void frameTimberClick(){
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
		WaitStatementLib.threadSleepOfEightSec();

		insuranceoption.click();
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
}
