package com.testbroker.scripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.testbroker.generic.BaseLib;
import com.testbroker.pageobject.AegisLondonPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class AegisLondonTest extends BaseLib {
	static final String LoginCredentials = "LoginCredentials_Sheet";
	@Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify the enquiry under contact us")
	@Story("Story Name: Contus Us verification")
	public void aegisLondonContactUs() throws InterruptedException, IOException, IllegalStateException, InvalidFormatException{
		logger.info("URL is opened");
		AegisLondonPage page= new AegisLondonPage(driver);
		page.contactUs();
		page.enquiryLink();
		page.officeLocation();
		page.highLightElement();
		//page.MediaContacts();
		//page.complaintLink();
}
}