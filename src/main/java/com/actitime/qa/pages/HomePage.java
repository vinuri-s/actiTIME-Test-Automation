package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class HomePage extends TestBase {

	
	//Page Factory - Object Repository
		
		@FindBy(xpath = "//a[@class='content reports']") //link to reports page
		WebElement reportsLink;
		
		@FindBy(xpath = "//a[@class='content users']") //link to users page
		WebElement usersLink;
		
		@FindBy(xpath = "//a[@class='content selected tt']") //link to time sheet(home) page
		WebElement timeSheetLink;
		
		@FindBy(xpath = "//div[@id='logo_aT']") //logo in home page
		WebElement actitimeLogo;
		
		@FindBy(xpath = "//div[@class='weekApprovalStatusControlOuterContainer']") //approve/reject time sheet button container
		WebElement approvalStatus;
		
		@FindBy(xpath = "//div[@class='tt-table ']") //time sheet
		WebElement timeSheetTable;
	
		
		//initialization
		
		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}
		
		
		//Action/Methods
		
		//test if the logo is displayed in the home page
		public Boolean validateActiTimeLogo() {
			return actitimeLogo.isDisplayed();
		}
		
		//test if the the users link on home page redirects to users page
		public UsersPage clickOnUsersLink() {
			usersLink.click();
			return new UsersPage();
		}
		
		//test if the the reports link on home page redirects to reports page
        public ReportsPage clickOnReportsLink() {
	         reportsLink.click();
	         return new ReportsPage();
		}
        
        //test if the the time sheet link on home page redirects to time sheet page(same as the home page)
        public HomePage clickOnTimeSheetLink() {
	         timeSheetLink.click();
	         return new HomePage();
		}
        
        //test if the time sheet is displayed
        public Boolean timeSheetTableTest() {
			return timeSheetTable.isDisplayed();
		}
        
        
        //test if the time sheet approval/reject button is available
    	public Boolean validateApprovalStatus() {
			return approvalStatus.isDisplayed();
		}
	
}
