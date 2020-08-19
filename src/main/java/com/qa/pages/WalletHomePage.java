package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class WalletHomePage extends TestBase{
	
	@FindBy(xpath="//a[@href='/blog/category/loans/?trk=nw_gn_4.0']")
	WebElement loan;
	
	@FindBy(linkText="Debt consolidation loans")
	WebElement debt;
	
	@FindBy(linkText="Refinance student loans")
	WebElement student;

	
	public WalletHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public DebtConsolePage moveToDebtLoan() {
		Actions action=new Actions(driver);
		action.moveToElement(loan).build().perform();
		debt.click();
		return new DebtConsolePage();
		
	}
	
	public StudentLoanPage moveToStudentLoan() {
		Actions action=new Actions(driver);
		action.moveToElement(loan).build().perform();
		student.click();
		return new StudentLoanPage();
		
	}

}
