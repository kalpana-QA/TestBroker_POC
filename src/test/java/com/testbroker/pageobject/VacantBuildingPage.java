package com.testbroker.pageobject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.NoSuchElementException;

import org.apache.poi.xwpf.usermodel.ICell;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;
import junit.framework.Assert;

public class VacantBuildingPage {
	@FindBy(xpath="//div[@class='v-card__text']//button[1]//span[1]")
	private WebElement vacantBuildingIcon;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//span[@class='v-btn__content'][contains(text(),'Next')]")
	private WebElement nextButton;
	
	@FindBy(xpath="(//i[contains(@class,'calendar')]/..//following-sibling::div//i)[1]")
	private WebElement inceptiondatedrpdwn;
	@FindBy(xpath="//button[@class='v-btn v-date-picker-table__current v-btn--rounded v-btn--outlined theme--light orange-aegis--text']")
	private WebElement currentdate;
	
	@FindBy(xpath="//input[@id='input-151']")
	private WebElement expireDate;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//div[contains(text(),'No')]")
	private WebElement noButton;
	
	@FindBy(xpath="//div[@class='v-input theme--light v-text-field v-text-field--filled v-text-field--is-booted v-text-field--enclosed']//div[@class='v-text-field__slot']")
	private WebElement fullnamefield;
	@FindBy(xpath="//div[@class='v-input theme--light v-text-field v-text-field--filled v-text-field--is-booted v-text-field--enclosed']//input")
	private WebElement name;
	
	@FindBy(xpath="//div[@class='v-input v-input--hide-details theme--light v-text-field v-text-field--filled v-text-field--is-booted v-text-field--enclosed']//input")
	private WebElement mailingaddressfield;
	
	@FindBy(xpath="//div[@class='v-input v-input--hide-details v-input--is-label-active v-input--is-dirty theme--light v-text-field v-text-field--filled v-text-field--is-booted v-text-field--enclosed draw-input-line']//input")
	private WebElement mailing;
	@FindBy(xpath="(//div[@class='pac-item'])[1]")
	private WebElement valuefromdropdown;
	
	@FindBy(xpath="//label[text()='Manually enter the address']")
	private WebElement checkboxfield;
	
	@FindBy(xpath="(//label[text()='Manually enter the address'])[2]")
	private WebElement checkboxfield1;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//span[text()='Street number']/../..//input")
	private WebElement streetnumberfield;
	
	@FindBy(xpath="//div[@class='v-window-item v-window-item--active']//span[text()='Zip']/../..//input")
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
	public void currentDate(){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, currentdate);
		currentdate.click();;

	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void dateSelect(String startdate ){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, inceptiondatedrpdwn);
		driver.findElement(By.xpath("//div[@class='v-btn__content'][contains(text(),'"+startdate+"')]"));
		}
	
	public void verifytimeBetween() {
		//inceptiondatedrpdwn.getText();
		String expiredDate=expireDate.getAttribute("value");
		DateFormat dateFormat = new SimpleDateFormat("DD Mon,YYYY");
		Calendar calendar = Calendar.getInstance();
		System.out.println("Current Date = " + calendar.getTime());
		calendar.add(Calendar.MONTH, 6);
		System.out.println("Updated Date = " + calendar.getTime());
		String updatedDate=dateFormat.format(calendar.getTime());
		Assert.assertEquals(updatedDate, expiredDate);
		}
	@Step("1.Click on Proceed to Dashboard step....")
	public void noButtonClick(){
		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, noButton);
		noButton.click();
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void fullName(String fullname ) throws InterruptedException{
		WaitStatementLib.threadSleepOfEightSec();
		//WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, fullnamefield);
		//fullnamefield.click();
		WaitStatementLib.threadSleepOfEightSec();
		name.sendKeys(fullname);
		}
	@Step("1.Click on Proceed to Dashboard step....")
	public void addressField(String address ) throws InterruptedException{
		WaitStatementLib.threadSleepOfEightSec();

		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, mailingaddressfield);
		
		mailingaddressfield.sendKeys(address);
		//mailing.click();
		try {
			WaitStatementLib.threadSleepOfSixSec();
		valuefromdropdown.click();

		}catch(NoSuchElementException e) {
			System.out.println(e);
		}
		
		}
	@Step("1.Click on Proceed to Dashboard step....")
	public void checkbox1() throws InterruptedException{
		//WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, checkboxfield);
		WaitStatementLib.threadSleepOfSixSec();
		Actions action = new Actions(driver);
		  action.moveToElement(checkboxfield).perform();
		  checkboxfield.click();
                
		//checkboxfield.click();
	}
	public void checkbox2() throws InterruptedException{
		//WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, checkboxfield);
		WaitStatementLib.threadSleepOfSixSec();
		Actions action = new Actions(driver);
		  action.moveToElement(checkboxfield1).perform();
		  checkboxfield1.click();
                
		//checkboxfield.click();
	}
	@Step("1.Click on Proceed to Dashboard step....")
	public void streetName(String street ) throws InterruptedException{
		WaitStatementLib.threadSleepOfSixSec();

		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, streetnumberfield);
		streetnumberfield.sendKeys(street);
		}
	@Step("1.Click on Proceed to Dashboard step....")
	public void zipcode(String zip ) throws InterruptedException{
		WaitStatementLib.threadSleepOfSixSec();

		WaitStatementLib.explicitlyWaitVisibilityOf(driver, 40, zipfield);
		zipfield.sendKeys(zip);
		}
}
