package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utilities {

		public static WebDriver driver;
		public Properties prop;
		public WebDriver initializeDriver() throws IOException {
			
			prop = new Properties();
			FileInputStream fis = new FileInputStream("root\\bhanu\\Sel-cls\\finalproject\\mcit\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			String browserName = prop.getProperty("browser");
			System.out.println(browserName);
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "root/bhanu/chromedriver");
				driver = new ChromeDriver();
				
			}
			else if(browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "root/bhanu/geckodriver");
				driver = new FirefoxDriver();
				
			}
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			//driver.close();
			return driver;
			
	}
	
}
