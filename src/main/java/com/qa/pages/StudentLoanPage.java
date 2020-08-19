package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class StudentLoanPage extends TestBase {
	
	@FindBy(id="stateFilter")
	WebElement countryDropdown;
	
	@FindBy(id="creditScoreFilter")
	WebElement scoreDropdown;
	
	@FindBy(id="annualIncomeFilter")
	WebElement annualIncome;
	
	@FindBy(id="educationCompletedFilter")
	WebElement education;
	
	@FindBy(id="loanAmountFilter")
	WebElement loanAmount;
	
	@FindBy(xpath="//div[@class='onboarding-footer']/button")
	WebElement optionButton;
	
	@FindBy(xpath="//h1[@class='_1fKjQ _7NymO']/span")
	WebElement header1;
	
	@FindBy(xpath="//h1[@class='_1fKjQ _7NymO']/span[2]")
	WebElement header2;
	
	@FindBy(id="credit-score-mad-lib")
	WebElement header3;
	
	@FindBy(xpath="//h1[@class='_1fKjQ _7NymO']/span[4]")
	WebElement header4;
	
	@FindBy(id="state-mad-lib")
	WebElement header5;
	
	@FindBy(xpath="//img[@alt='SoFi Student Loan Refinance']")
	WebElement sofi;
	
	@FindBy(xpath="//img[@alt='Earnest Student Loan Refinance']")
	WebElement earnest;
	
	@FindBy(xpath="//img[@alt='CommonBond Student Loan Refinance']")
	WebElement commonbond;
	
	@FindBy(xpath="//img[@alt='LendKey Student Loan Refinance']")
	WebElement lendkey;
	
	public StudentLoanPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void getOptions() {
		countryDropdown.click();
		Select s1=new Select(countryDropdown);
		s1.selectByVisibleText("New Jersey");
		
	
		scoreDropdown.click();
		Select s2=new Select(scoreDropdown);
		s2.selectByVisibleText("650-699");
		
		annualIncome.sendKeys(prop.getProperty("aiAmount"));
		
		education.click();
		Select s3=new Select(education);
		s3.selectByVisibleText("Graduate");
		
		loanAmount.sendKeys(prop.getProperty("lAmount"));
		optionButton.click();
		
	}
	
	public String validateHeader() {
		return header1.getText()+header2.getText()+header3.getText()+header4.getText()+header5.getText();
		
	}
	
	public boolean validateSofi() {
		return sofi.isDisplayed();
	}
	
	public boolean validateEarnest() {
		return earnest.isDisplayed();
	}
	public boolean validateCommonBond() {
		return commonbond.isDisplayed();
	}
	
	public boolean validateLendKey() {
		return lendkey.isDisplayed();
	}
	
	
	
	
	
}
