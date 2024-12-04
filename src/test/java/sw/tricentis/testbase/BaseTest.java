package sw.tricentis.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sw.tricentis.propertyreader.PropertyReader;
import sw.tricentis.utilities.Utility;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }
}
