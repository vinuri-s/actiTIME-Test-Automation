package com.actitime.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.UsersPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	public HomePageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		
		
	}
	
	
	@Test(priority = 1)
	public void homePageLogoTest() {
		
	boolean flag= homePage.validateActiTimeLogo();
	Assert.assertTrue(flag,"Cannot find the home page Logo");
		
	}
	
	@Test(priority = 2)
	public void usersPageUserLinkTest() {
		
	homePage.clickOnUsersLink();

		
	}
	
	@Test(priority = 3)
	public void homePageTimeSheetLinkTest() {
		
	homePage.clickOnTimeSheetLink();

		
	}
	
	@Test(priority = 4)
	public void timSheetTableTest() {
		
	boolean flag= homePage.timeSheetTableTest();
	Assert.assertTrue(flag,"Cannot find the time sheet");
		
	}
	
	@Test(priority = 5)
	public void timSheetApprovalTest() {
		
	boolean flag= homePage.validateApprovalStatus();
	Assert.assertTrue(flag,"Cannot find the time sheet approval/rejection option");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
}
