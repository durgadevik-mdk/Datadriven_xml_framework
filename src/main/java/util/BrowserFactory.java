package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	static WebDriver driver;
	static String Browser;
	static String Url;

	public static void readtheconfigfile() {

		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");
			prop.load(input);
			Browser = prop.getProperty("browser");
			Url = prop.getProperty("url");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static WebDriver init() {
		if (Browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (Browser.equalsIgnoreCase("edge")) {
			System.setProperty( "webdriver.edge.driver", "Driver/msedgedriver.exe");
			driver = new EdgeDriver();
		
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(Url);
		return driver;
	}

	public static void tearDown() {
		driver.close();
		driver.quit();

	}

}
