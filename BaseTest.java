package base;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	private static FileReader fr;


	@BeforeTest
	public void setUp() throws IOException {
		if (driver == null) {
			fr = new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumautomationFramework\\testAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);

			String browser = prop.getProperty("browser");
			String testUrl = prop.getProperty("testurl");

			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else {
				throw new RuntimeException("Unsupported browser: " + browser);
			}

			driver.get(testUrl);
		}
	}
	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		System.out.println("Teardown successful");
	}
}

