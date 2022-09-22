package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class ReportsPage extends TestBase  {
	
	//Page Factory - Object Repository
	
			@FindBy(xpath = "//table[@id='configs']")//reports list
			WebElement reportsList;
			
			@FindBy(xpath = "//table[@id='reportConfig_119']")//leaves report cell
			WebElement reportLink;
			
			@FindBy(xpath = "//div[@class='lightbox lightboxWithWhiteContent pdfPreviewLightbox createChartMode ancestorEventsEmitter verticalBar']")//leaves report details
			WebElement reportDetailsSlide;
			
			//initialization
			
			public ReportsPage() {
				
				PageFactory.initElements(driver, this);
			}
			
			
			//Action/Methods
			
			//test if the reports list is displayed
			public Boolean validateReportsList() {
				return reportsList.isDisplayed();
			}
			
			
			//test if the HR is able to see the leaves report
			public boolean clickOnReport() {
				reportLink.click();
				return reportDetailsSlide.isDisplayed();
			}
			

}
