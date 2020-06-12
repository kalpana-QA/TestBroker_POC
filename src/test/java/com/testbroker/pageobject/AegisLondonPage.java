package com.testbroker.pageobject;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.testbroker.generic.WaitStatementLib;

import io.qameta.allure.Step;

public class AegisLondonPage {
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
	@FindBy(xpath="(//div[@class='officeLocationsPage']//div[contains(@class,'layoutContainer ')]//span)[1]")
	private WebElement address;
	 WebDriver driver;

	 
	public AegisLondonPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@Step("User has clicked on contact us....")
	public void contactUs(){
		contactus.click();

	}
	@Step("User has clicked on enquiry link....")
	public void enquiryLink() throws InterruptedException{
		WaitStatementLib.threadSleepOfEightSec();      
		enquiry.click();

	}
	@Step("User has clicked on office location....")
	public void officeLocation() throws InterruptedException{
        WaitStatementLib.threadSleepOfEightSec();
        String actualOfficeLoc=officelocation.getText();
		officelocation.click();
		AssertDataWithMultipleWindows(actualOfficeLoc);
		Reporter.log("User has successfully land on office location page", true);
	}
	@Step("The address has been highlighted and verified")
	public  void highLightElement() {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", address);
			Thread.sleep(1000);
			js.executeScript("arguments[0].style.border=''", address, "");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void AssertDataWithMultipleWindows(String datatoAssert) throws InterruptedException{
		String parentWindow=driver.getWindowHandle();
		for(String childWindow:driver.getWindowHandles()){
			driver.switchTo().window(childWindow);
		}
        String PageTitle=driver.getTitle();
        Assert.assertTrue(PageTitle.contains(datatoAssert));
		WaitStatementLib.threadSleepOfFourSec();

	}
	
	
}
