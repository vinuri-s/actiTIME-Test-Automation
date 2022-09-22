package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class UsersPage extends TestBase  {
	
	//Page Factory - Object Repository
	
			@FindBy(xpath = "//div[@class='userListPage']")//users list
			WebElement usersTable;
			
			@FindBy(xpath = "//div[@class='userNameContent clickable']")//particular user
			WebElement userLink;
			
			@FindBy(xpath = "//div[@class='edit_user_sliding_panel sliding_panel components_panelContainer']")//user details
			WebElement userDetailsSlide;
			
			//initialization
			
			public UsersPage() {	
				PageFactory.initElements(driver, this);
			}
			
			
			//Action/Methods
			
			//test is the users list is displayed
			public Boolean validateUsersList() {
				return usersTable.isDisplayed();
			}
			
			
			//test if the details is displayed when click on a user
			public boolean clickOnUser() {
				userLink.click();
				return userDetailsSlide.isDisplayed();
			}
			

}
