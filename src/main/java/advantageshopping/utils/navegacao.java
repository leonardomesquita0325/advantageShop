package advantageshopping.utils;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class navegacao {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	
	public static WebDriver openDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			wait = new WebDriverWait(navegacao.openDriver(), 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		return driver;
	}
	public void browseTheWeb(String url) {
		navegacao.openDriver().get(url);
	}
	
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
			}
		
	}
}
