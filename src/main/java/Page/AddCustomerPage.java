package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='page-wrapper']/div[2]/div/h2")
	WebElement ADD_CUSTOMER_PAGE_VERIFY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id ='account']")
	WebElement FULLNAME_ELEMENT_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@id ='cid']")
	WebElement COMPANY_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id ='email']")
	WebElement EMAIL_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'phone']")
	WebElement PHONE_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'address']")
	WebElement ADDRESS_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'city']")
	WebElement CITY_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'state']")
	WebElement STATE_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'zip']")
	WebElement ZIP_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id = 'country']")
	WebElement COUNTRY_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id = 'currency']")
	WebElement CURRENCY_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id = 'group']")
	WebElement GROUP_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'password']")
	WebElement PASSWORD_ADDCUSTOMERPAGE_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'cpassword']")
	WebElement CONFIRM_PASSWORD_ADDCUSTOMERPAGE_FILED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id = 'submit']")
	WebElement SAVE_BUTTON_FILED_ELEMENT;

	@FindBy(how = How.XPATH, using = "//a[@id = 'summary']")
	WebElement VERIFY_CONTACTS_SUMMARY_PAGE;

	public void verifyAddCustomerPage() {
		Assert.assertEquals(ADD_CUSTOMER_PAGE_VERIFY_ELEMENT.getText(), "Contacts", "WRONG PAGE");
	}
	
	public void addFullName(String fullname) {
		waitforelements(driver, 20, FULLNAME_ELEMENT_FIELD);		
		FULLNAME_ELEMENT_FIELD.sendKeys(fullname);
		
	}
	
	public void selectCompany(String visbiletext) {
		selectDropDownMenu(COMPANY_FILED_ELEMENT, visbiletext);
	}
	
	public void addemail(String email) {
		EMAIL_FILED_ELEMENT.sendKeys(randomNumberGenerator(9939) + email);
	}

	public void addPhoneNumber(String extension) {
		PHONE_FILED_ELEMENT.sendKeys(randomNumberGenerator(9939) + extension);
	}

	public void addAddress(String address) {
		ADDRESS_FILED_ELEMENT.sendKeys(address);
	}

	public void addCity(String city) {
		CITY_FILED_ELEMENT.sendKeys(city);
	}

	public void addState(String state) {
		STATE_FILED_ELEMENT.sendKeys(state);
	}

	public void addZip(String zip) {
		ZIP_FILED_ELEMENT.sendKeys(zip);
	}

	public void addCountry(String country) {
		selectDropDownMenu(COUNTRY_FILED_ELEMENT, country);
	}

	public void addCurrency(String currency) {
		selectDropDownMenu(CURRENCY_FILED_ELEMENT, currency);
	}

	public void addGroup(String Group) {
		selectDropDownMenu(GROUP_FILED_ELEMENT, Group);
	}

	public void addPassword(String password) {
		PASSWORD_ADDCUSTOMERPAGE_FILED_ELEMENT.sendKeys(password);
	}

	public void addConfirnPassword(String confirmpassword) {
		waitforelements(driver, 20, CONFIRM_PASSWORD_ADDCUSTOMERPAGE_FILED_ELEMENT);
		CONFIRM_PASSWORD_ADDCUSTOMERPAGE_FILED_ELEMENT.sendKeys(confirmpassword);
	}
	
	public void clickSaveButton() {
		SAVE_BUTTON_FILED_ELEMENT.click();

	}
	
	public void verifySummaryPage() {
		waitforelements(driver,30,VERIFY_CONTACTS_SUMMARY_PAGE);
		Assert.assertEquals(VERIFY_CONTACTS_SUMMARY_PAGE.getText(), "Summary", "WrongPage");
	}

}
