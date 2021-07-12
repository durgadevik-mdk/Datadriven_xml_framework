package Page;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void waitforelements(WebDriver driver, int TimeToWaitInSeconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, TimeToWaitInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	
	

	public void waittoaccept(WebDriver driver, int TimeinSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, TimeinSeconds);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();		

	}

	public void selectDropDownMenu(WebElement webelement, String visbiletext) {

		Select sel = new Select(webelement);
		sel.selectByVisibleText(visbiletext);
	}

	public int randomNumberGenerator(int number) {
		Random ran = new Random();
		int numberGenerated = ran.nextInt(number);
		return numberGenerated;

	}

}
