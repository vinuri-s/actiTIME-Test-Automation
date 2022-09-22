package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class ReportsPage extends TestBase  {
	
	//Page Factory - Object Repository
	
			@FindBy(xpath = "//table[@id='configs']")
			WebElement reportsList;
			
			@FindBy(xpath = "//table[@id='reportConfig_119']")
			WebElement reportLink;
			
			@FindBy(xpath = "//div[@class='lightbox lightboxWithWhiteContent pdfPreviewLightbox createChartMode ancestorEventsEmitter verticalBar']")
			WebElement reportDetailsSlide;
			
			//initialization
			
			public ReportsPage() {
				
				PageFactory.initElements(driver, this);
			}
			
			
			//Action/Methods
			
			public Boolean validateReportsList() {
				return reportsList.isDisplayed();
			}
			
			
			
			public boolean clickOnReport() {
				
				reportLink.click();
				return reportDetailsSlide.isDisplayed();
				
			}
			

}
