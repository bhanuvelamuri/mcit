package Header;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.utilities;

public class Title extends utilities {

		public static Logger Log = LogManager.getLogger(ValidateTitle.class.getName());
		@BeforeTest
		public void Initilize() throws IOException {
			driver = initializeDriver();
			Log.info("Driver is initilized");
			driver.get(prop.getProperty("url"));
			Log.info("Navigated to Homepage");
		}
		@Test
		public void basePageNavigation() throws IOException {
			ValidateTitle l = new ValidateTitle(driver);
			//compare the text from the browser 
			AssertJUnit.assertEquals(l.getTitle().getText(), "EXCITE SERVICES | Web design, development, E-commerce and SEO");
			AssertJUnit.assertTrue(l.getTitle().isDisplayed());
			Log.info("Successfully Validated Text Message");
		}
		@AfterTest
		public void teardown() {
			driver.close();
			driver = null;
		}

}
