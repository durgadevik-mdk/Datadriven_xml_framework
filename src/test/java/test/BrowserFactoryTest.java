package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.BrowserFactory;

public class BrowserFactoryTest {

	WebDriver driver;

	@Test
	public void launchBrowserTest() {

		BrowserFactory.readtheconfigfile();
		driver = BrowserFactory.init();
		// BrowserFactory.tearDown();
	}

}
