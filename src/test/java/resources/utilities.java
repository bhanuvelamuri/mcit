package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/bhanu/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://exciteservices.net");
		driver.close();
	}

}
