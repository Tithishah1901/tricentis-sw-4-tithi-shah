package sw.tricentis.pages;

import org.openqa.selenium.By;
import sw.tricentis.utilities.Utility;

public class RegisterPage extends Utility {
    By title = By.xpath("//h1");
    By genderMale = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By emailAddress = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registerSuccess = By.xpath("//div[@class='result']");
    By continueBtn = By.xpath("//input[@value='Continue']");

    public String getRegisterPageTitle(){
        return getTextFromElement(title);
    }

    public void clickOnGenderOnMale(){
        clickOnElement(genderMale);
    }

    public void enterFirstName(String name){
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String name){
        sendTextToElement(lastName, name);
    }

    public void enterEmailAddress(String email){
        sendTextToElement(emailAddress, email);
    }

    public void enterPassword(String pass){
        sendTextToElement(password, pass);
    }

    public void enterConfirmPassword(String confirmPass){
        sendTextToElement(confirmPassword, confirmPass);
    }

    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

    public String getRegisterSuccessMessage(){
        return getTextFromElement(registerSuccess);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueBtn);
    }
}
