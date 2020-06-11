package com.testbroker.pageobject;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class AegisLodonPage {
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactus;
	
	@FindBy(xpath="//li//span[contains(text(),'Enquiry')]")
	private WebElement enquiry;
	
	@FindBy(xpath="(//li//span[contains(text(),'Office Locations')])[2]")
	private WebElement officelocation;
	
	@FindBy(xpath="(//li//span[contains(text(),'Media Contacts')])[2]")
	private WebElement mediacontact;
	
	@FindBy(xpath="(//li//span[contains(text(),'Complaints')])[2]")
	private WebElement complaint;
	 WebDriver driver;

	
	public AegisLodonPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Step("User has clicked on contact us....")
	public void contactUs(){
		contactus.click();

	}
	@Step("User has clicked on contact us....")
	public void enquiryLink() throws InterruptedException{
		WaitStatementLib.threadSleepOfEightSec();
        //driver.close();
        //driver.switchTo().window(tabs2.get(0));
		enquiry.click();

	}
	@Step("User has clicked on contact us....")
	public void officeLocation() throws InterruptedException{
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(2));
        WaitStatementLib.threadSleepOfEightSec();
		officelocation.click();

	}
	@Step("User has clicked on contact us....")
	public void MediaContacts(){
		mediacontact.click();

	}
	@Step("User has clicked on contact us....")
	public void complaintLink(){
		complaint.click();

	}
}
