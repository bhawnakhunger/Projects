package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.TestBase;

public class DebtConsolePage extends TestBase{
	
	@FindBy(xpath="//body/div/div/div/div/div/div[2]/h1/span")
	public
	WebElement header;
	
	@FindBy(xpath="//body/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/label/span[2]/input")
	WebElement AnnualIncome;
	
	@FindBy(xpath="//img[@alt='Prosper Borrowers']")
	WebElement Prosper;
	
	@FindBy(xpath="//img[@alt='OneMain']")
	WebElement OneMain;
	
	@FindBy(xpath="//img[@alt='Upstart']")
	WebElement Upstart;
	
	
	public boolean validateheader() {
		return header.isDisplayed();
	}
	
 
	
	public boolean validateProsper() {
		return Prosper.isDisplayed();
	}
	
	public boolean validateOneMain() {
		return OneMain.isDisplayed();
	}
	
	public boolean validateUpstart() {
		return Upstart.isDisplayed();
	}
	

}
