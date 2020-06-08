package com.testbroker.scripts;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testbroker.generic.BaseLib;
import com.testbroker.generic.ExcelUtilityLib;
import com.testbroker.generic.WaitStatementLib;
import com.testbroker.pageobject.BuildingCoverPage;
import com.testbroker.pageobject.HomePage;
import com.testbroker.pageobject.LoginPage;
import com.testbroker.pageobject.VacantBuildingPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LoginTest extends BaseLib {
	static final String LoginCredentials = "LoginCredentials_Sheet";
	@Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: To verify when user is able to login with correct username and passowrd")
	@Story("Story Name: To check login page functionality")
	public void validLoginTest() throws InterruptedException, IOException, IllegalStateException, InvalidFormatException{
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.dashboardClick();
		lp.usernameField(ExcelUtilityLib.getKeyValue(LoginCredentials, "Login-UserEmail", "Valid-Email"));
		logger.info("Entered username");
		lp.passwordField(ExcelUtilityLib.getKeyValue(LoginCredentials, "Login-UserPassword", "Valid-Password"));
		logger.info("Entered password");
		lp.LoginClick();
		logger.info("User has clicked on login Button");

		lp.authorizeButton();
		logger.info("User has clicked on authorize Button");
		HomePage home = new HomePage(driver);
		home.getQuotesClick();
		logger.info("User has clicked on get A Quotes Icon");
		home.vacantIconClick();
		logger.info("User has clicked on next Button");
		VacantBuildingPage vacantbuilding= new VacantBuildingPage(driver);
		vacantbuilding.vacantBuildingClick();
		logger.info("User has clicked on vacant building Icon");
		vacantbuilding.nextButton();
		logger.info("User has clicked on next Button");
		vacantbuilding.inceptionDate();
		logger.info("User has clicked on inception date field");
		vacantbuilding.dateSelect(ExcelUtilityLib.getKeyValue(LoginCredentials, "Date-Select", "Valid-date"));
		logger.info("User has clicked on date passed from the excel sheet");
		//vacantbuilding.verifytimeBetween();
		vacantbuilding.nextButton();
		vacantbuilding.noButtonClick();
		vacantbuilding.nextButton();
		vacantbuilding.fullName(ExcelUtilityLib.getKeyValue(LoginCredentials, "FullName", "Valid-fullname"));
		vacantbuilding.addressField(ExcelUtilityLib.getKeyValue(LoginCredentials, "Address", "Valid-address"));
		vacantbuilding.checkbox();
		vacantbuilding.streetName(ExcelUtilityLib.getKeyValue(LoginCredentials, "StreetName", "Valid-streetname"));
		vacantbuilding.zipcode(ExcelUtilityLib.getKeyValue(LoginCredentials, "ZipCode", "Valid-ZipCode"));
		vacantbuilding.nextButton();
		BuildingCoverPage cover= new BuildingCoverPage(driver);
		cover.manualAddressCheckbox();
		cover.usemailingAddress();
		vacantbuilding.streetName(ExcelUtilityLib.getKeyValue(LoginCredentials, "StreetName", "Valid-streetname"));
		vacantbuilding.zipcode(ExcelUtilityLib.getKeyValue(LoginCredentials, "ZipCode", "Valid-ZipCode"));
		cover.scroll();
		cover.buildingVacantOption();
		cover.structureDemolition();
		vacantbuilding.nextButton();
		cover.frameTimberClick();
		cover.scroll();
		cover.fuscSore();
		cover.totolInsuredValue(ExcelUtilityLib.getKeyValue(LoginCredentials, "totalinsuredvalue", "Valid-totalinsuredvalue"));
		cover.caValue();
		cover.buildingAge();
		cover.yesoption();
		cover.allRiskValue();
		vacantbuilding.nextButton();
		cover.insuranceOption();
		cover.lossValue();
		vacantbuilding.nextButton();
		cover.generalLiabilityCover();
		cover.getQuote();
		cover.confirmCheckbox();
		cover.proceed();







	}


}
