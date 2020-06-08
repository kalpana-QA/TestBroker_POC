package com.testbroker.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class BuildingCoverPage {
	@FindBy(xpath="//div[@class='v-input xl2 theme--light v-input--selection-controls v-input--checkbox']//label")
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

	@FindBy(xpath="//div[@class='v-input theme--light v-text-field v-text-field--filled v-text-field--is-booted v-text-field--enclosed']")
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
	public void fuscSore(){
		fusScore.click();
		score.click();
	}
	@Step("2.Login with username: {0} step....")
	public void totolInsuredValue(String totalvalue){
		WaitStatementLib.explicitlyWaitForClickable(driver, 20, totolInsuredValue);
		totolInsuredValue.sendKeys(totalvalue);
	}
	public void caValue(){
		cavalue.click();
	}
	public void buildingAge(){
		buildingAge.click();
	}
	public void yesoption(){
		yesoption.click();
	}
	public void allRiskValue(){
		allriskvalue.click();
	}
	public void insuranceOption(){
		insuranceoption.click();
	}
	public void lossValue(){
		loss.click();
	}
	public void generalLiabilityCover(){
		generalLiabiltyCover.click();
	}
	public void getQuote(){
		getQuote.click();
	}
	public void confirmCheckbox(){
		confirmCheckbox.click();
	}
	public void proceed(){
		proceed.click();
	}
}
