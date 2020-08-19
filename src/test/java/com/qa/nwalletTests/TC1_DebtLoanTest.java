package com.qa.nwalletTests;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DebtConsolePage;
import com.qa.pages.WalletHomePage;

public class TC1_DebtLoanTest extends TestBase {
	WalletHomePage walletHome;
	DebtConsolePage debtConsole;
	
	public TC1_DebtLoanTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialize();
		walletHome=new WalletHomePage();
		debtConsole=new DebtConsolePage();
		
	}
	
	@Test
	public void verifyHeader() {
		walletHome.moveToDebtLoan();
		boolean head=debtConsole.validateheader();
		Assert.assertTrue(head);
	
	}
	@Test
	public void verifyLendingPartners() {
		debtConsole.inputAnnual();
		boolean prosper=debtConsole.validateProsper();
		Assert.assertTrue(prosper);
		boolean onemain=debtConsole.validateOneMain();
		Assert.assertTrue(onemain);
		boolean upstart=debtConsole.validateUpstart();
		Assert.assertTrue(upstart);
	}
	
	
	@AfterTest
	public void close() {
		driver.quit();
	}

}
