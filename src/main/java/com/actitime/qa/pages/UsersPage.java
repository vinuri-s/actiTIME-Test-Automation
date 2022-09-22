package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class UsersPage extends TestBase  {
	
	//Page Factory - Object Repository
	
			@FindBy(xpath = "//div[@class='userListPage']")
			WebElement usersTable;
			
			@FindBy(xpath = "//div[@class='userNameContent clickable']")
			WebElement userLink;
			
			@FindBy(xpath = "//div[@class='edit_user_sliding_panel sliding_panel components_panelContainer']")
			WebElement userDetailsSlide;
			
			//initialization
			
			public UsersPage() {
				
				PageFactory.initElements(driver, this);
			}
			
			
			//Action/Methods
			
			public Boolean validateUsersList() {
				return usersTable.isDisplayed();
			}
			
			
			
			public boolean clickOnUser() {
				
				userLink.click();
				return userDetailsSlide.isDisplayed();
				
			}
			

}
