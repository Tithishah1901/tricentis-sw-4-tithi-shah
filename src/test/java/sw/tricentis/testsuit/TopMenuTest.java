package sw.tricentis.testsuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import sw.tricentis.pages.ComputerPage;
import sw.tricentis.pages.HomePage;
import sw.tricentis.testbase.BaseTest;

public class TopMenuTest extends BaseTest {
    HomePage homepage = new HomePage();
    ComputerPage computerPage = new ComputerPage();

    //create a class "TopMenuTest" into the testsuite package
    //1.1 create a method with the name "selectMenu" It has one parameter named "menu" of type string
    //1.2 This method should click on the menu whatever name is passed as a parameter.

    public void selectMenu(String menu) {
        homepage.clickOnTopMenuComputer(menu);
    }

    //1.3. create the @Test
    @Test
    public void verifyPageNavigation() {
        //Use the selectMenu
        selectMenu("Computers");
        //    method to select the Menu click on it and verify the page navigation
        Assert.assertEquals("Computers",
                computerPage.getComputerTitle(), "Computers text is not matched!");
    }
}
