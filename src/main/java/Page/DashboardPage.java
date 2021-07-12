package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardPage extends BasePage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard')]")
	WebElement DASHBOARD_TITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]")
	WebElement CUSTOMER_TAB_FILED;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]")
	WebElement ADD_CUSTOMER_TAB_FILED;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'List Customers')]")
	WebElement LISTCUSTOMERS_FIELD_ELEMENT;

	public void verifyDashboardTitle() {
		String DASHBOARD_TITLE_TEXT = DASHBOARD_TITLE_ELEMENT.getText();
		Assert.assertEquals(DASHBOARD_TITLE_TEXT, "Dashboard", "WRONG PAGE");
	}

	public void clickCustomertab() {
		waitforelements(driver, 50, CUSTOMER_TAB_FILED);
		CUSTOMER_TAB_FILED.click();
	}

	public void clickAddCustomertab() {
		waitforelements(driver, 40, ADD_CUSTOMER_TAB_FILED);

		ADD_CUSTOMER_TAB_FILED.click();
	}
	
	public void clickListCustomerTab() {
		LISTCUSTOMERS_FIELD_ELEMENT.click();
	}

}
