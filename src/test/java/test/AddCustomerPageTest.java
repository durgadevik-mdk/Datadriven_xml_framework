package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page.AddCustomerPage;
import Page.DashboardPage;
import Page.LoginPage;
import util.BrowserFactory;

public class AddCustomerPageTest {

	WebDriver driver;

	@Test
	@Parameters({ "username", "password" ,"FullName","company","email","phonenumber","address","city","state","zipcode","country","currency"})
		public void validUserLoginTest(String userName, String passWord,String fullName,String comapany,String email,String phonenumber,String address,String city,String state,String zipcode,String country,String currency) throws InterruptedException {
		
		BrowserFactory.readtheconfigfile();

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(userName);
		loginPage.enterPassWord(passWord);
		loginPage.clickSignIn();

		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.verifyDashboardTitle();
		dashboardpage.clickCustomertab();
		dashboardpage.clickAddCustomertab();
	}
		

		@Test
		@Parameters({ "username", "password" ,"FullName","company","email","phonenumber","address","city","state","zipcode","country","currency"})
		public void addcust(String userName, String passWord,String fullName,String comapany,String email,String phonenumber,String address,String city,String state,String zipcode,String country,String currency) throws InterruptedException {
			BrowserFactory.readtheconfigfile();

		AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
		addcustomerpage.verifyAddCustomerPage();
		addcustomerpage.addFullName(fullName);
		addcustomerpage.selectCompany(comapany);
		addcustomerpage.addemail(email);
		addcustomerpage.addPhoneNumber(phonenumber);
		addcustomerpage.addAddress(address);
		addcustomerpage.addCity(city);
		addcustomerpage.addState(state);
		addcustomerpage.addZip(zipcode);
		addcustomerpage.addCountry(country);
		addcustomerpage.addCurrency(currency);
		addcustomerpage.clickSaveButton();
		addcustomerpage.verifySummaryPage();
		BrowserFactory.tearDown();
	}


}
