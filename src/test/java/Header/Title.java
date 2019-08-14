package Header;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import resources.utilities;

public class Title extends utilities {

		@BeforeTest
		public void Initilize() throws IOException {
			driver = initializeDriver();
			driver.get(prop.getProperty("url"));
		}
		@Test
		public void basePageNavigation() throws IOException {
			ValidateTitle l = new ValidateTitle(driver);
			//compare the text from the browser 
			l.getTitle().equals("EXCITE SERVICES | Web design, development, E-commerce and SEO");
		}
		@AfterTest
		public void teardown() {
			driver.close();
			driver = null;
		}

}
