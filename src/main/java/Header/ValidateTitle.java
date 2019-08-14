package Header;

import org.openqa.selenium.WebDriver;

public class ValidateTitle {
	public WebDriver driver;
	public ValidateTitle(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public Object getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
}

