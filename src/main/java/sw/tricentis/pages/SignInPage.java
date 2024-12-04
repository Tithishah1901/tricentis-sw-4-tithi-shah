package sw.tricentis.pages;

import org.openqa.selenium.By;
import sw.tricentis.utilities.Utility;

public class SignInPage extends Utility {
    By signInTitle = By.xpath("//h1");
    By guest = By.xpath("//input[@value='Checkout as Guest']");
    By register = By.xpath("//input[@value='Register']");

    public String getWelcomeTextFromSignInTitle(){
        return getTextFromElement(signInTitle);
    }

    public void clickSignInAsAGuestButton(){
        clickOnElement(guest);
    }

    public void clickOnRegisterButton(){
        clickOnElement(register);
    }
}
