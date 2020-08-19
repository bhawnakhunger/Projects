package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try
		{
			prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Bhawna Khunger\\eclipse-workspace\\nerdWalletTest\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void initialize()
	{   //To decide which browser need to test
		String browsername = prop.getProperty("browser");
		if(browsername .equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bhawna Khunger\\eclipse-workspace\\nerdWalletTest\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			FirefoxOptions fo = new FirefoxOptions();
			fo.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		}
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhawna Khunger\\eclipse-workspace\\nerdWalletTest\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		//Configuration before test start
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
