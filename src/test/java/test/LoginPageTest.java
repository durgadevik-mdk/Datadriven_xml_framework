package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page.DashboardPage;
import Page.LoginPage;
import util.BrowserFactory;


public class LoginPageTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"username","password" })
	public void validUserLogin(String userName , String passWord ) {
		
		BrowserFactory.readtheconfigfile();		
		driver = BrowserFactory.init();
		
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(userName);
		loginPage.enterPassWord(passWord);
		loginPage.clickSignIn();
		
		DashboardPage dashBoardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashBoardPage.verifyDashboardTitle();
		
		
		
		
		
		
		
	}

}
