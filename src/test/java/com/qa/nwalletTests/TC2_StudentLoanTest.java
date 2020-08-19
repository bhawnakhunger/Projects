package com.qa.nwalletTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.StudentLoanPage;
import com.qa.pages.WalletHomePage;

public class TC2_StudentLoanTest extends TestBase{
	
	WalletHomePage walletHome;
	StudentLoanPage studentloan;
	
	public TC2_StudentLoanTest() {
	super();
	}
	
	@BeforeMethod
	public void setUp() {
		walletHome=new WalletHomePage();
		studentloan=new StudentLoanPage();
		initialize();
		
	}

	@Test
	public void verifyHeader() {
		walletHome.moveToStudentLoan();
		String header=studentloan.validateHeader();
		Assert.assertEquals(header, "Compare your student loan refi options for fair credit in NJ");
	}
	
	@Test
	public void verifyOptions() {
		boolean sofi=studentloan.validateSofi();
		Assert.assertTrue(sofi);
		boolean earnest=studentloan.validateEarnest();
		Assert.assertTrue(earnest);
		boolean common=studentloan.validateCommonBond();
		Assert.assertTrue(common);
		boolean lend=studentloan.validateLendKey();
		Assert.assertTrue(lend);
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}

}
