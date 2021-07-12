package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id = 'username']")
	WebElement USERNAME_ELEMENT_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id = 'password']")
	WebElement PASSWORD_ELEMENT_FIELD;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]")
	WebElement SIGNINBUTTON_ELEMENT_FIELD;

	public void enterUserName(String username) {
		USERNAME_ELEMENT_FIELD.sendKeys(username);
	}

	public void enterPassWord(String password) {
		PASSWORD_ELEMENT_FIELD.sendKeys(password);
	}

	public void clickSignIn() {
		SIGNINBUTTON_ELEMENT_FIELD.click();

	}

}
