package sw.tricentis.pages;

import org.openqa.selenium.By;
import sw.tricentis.utilities.Utility;

public class ComputerPage extends Utility {

    By getComputerTitle = By.xpath("//h1[normalize-space()='Computers']");

    public String getComputerTitle(){
        return getTextFromElement(getComputerTitle);
    }
}
