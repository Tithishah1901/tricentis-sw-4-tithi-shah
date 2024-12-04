package sw.tricentis.pages;

import org.openqa.selenium.By;
import sw.tricentis.utilities.Utility;

public class CheckOutPage extends Utility {
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By emailAddress = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address1 = By.id("BillingNewAddress_Address1");
    By zipCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    By btnContinueBillingSave = By.xpath("//input[@onclick='Billing.save()']");
    By btnContinueShippingSave = By.xpath("//input[@onclick='Shipping.save()']");
    By nextDayAir = By.id("shippingoption_1");
    By twoNdDayAir = By.id("shippingoption_2");
    By btnContinueShippingMethodNextStep = By.xpath("//input[@class='button-1 shipping-method-next-step-button']");
    By creditCard = By.id("paymentmethod_2");
    By btnContinuePayment = By.xpath("//input[@class='button-1 payment-method-next-step-button']");
    By cardType = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By selectMonth = By.id("ExpireMonth");
    By selectYear = By.id("ExpireYear");
    By ccCode = By.id("CardCode");
    By btnContinuePaymentInfo = By.xpath("//input[@class='button-1 payment-info-next-step-button']");
    By getCardType = By.xpath("//li[@class='payment-method']");
    By getShippingMethod = By.xpath("//li[@class='shipping-method']");
    By totalPrice = By.xpath("//span[@class='product-subtotal']");
    By btnConfirm = By.xpath("//input[@value='Confirm']");
    By thankYou = By.xpath("//h1[normalize-space()='Thank you']");
    By successfullyMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By btnContinueCompleted = By.xpath("//input[@class='button-2 order-completed-continue-button']");

    public void enterFirstName(String name){
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String name){
        sendTextToElement(lastName, name);
    }

    public void enterEmailAddress(String email){
        sendTextToElement(emailAddress, email);
    }

    public void selectCountryFromDropdown(String countryName){
        sendTextToElement(country, countryName);
    }

    public void enterCityName(String cityName){
        sendTextToElement(city, cityName);
    }

    public void enterShippingAddress(String addressOfShipping){
        sendTextToElement(address1, addressOfShipping);
    }

    public void enterZipCode(String code){
        sendTextToElement(zipCode, code);
    }

    public void enterPhoneNumber(String number){
        sendTextToElement(phoneNumber, number);
    }

    public void clickOnContinueBillingSaveButton(){
        clickOnElement(btnContinueBillingSave);
    }

    public void clickOnContinueShippingSaveButton(){
        clickOnElement(btnContinueShippingSave);
    }

    public void clickOnShippingMethodOnNextDayAir(){
        clickOnElement(nextDayAir);
    }

    public void clickOnShippingMethodOn2ndDayAir(){
        clickOnElement(twoNdDayAir);
    }

    public void clickOnContinueShippingMethodNextStep(){
        clickOnElement(btnContinueShippingMethodNextStep);
    }

    public void clickOnCreditCard(){
        clickOnElement(waitUntilVisibilityOfElementLocated(creditCard, 2));
        //clickOnElement(creditCard);
    }

    public void clickOnContinuePayment(){
        clickOnElement(btnContinuePayment);
    }

    public void selectCardTypFromDropdown(String card){
        selectByVisibleTextFromDropDown(cardType, card);
    }

    public void enterCardholderName(String name){
        sendTextToElement(cardHolderName, name);
    }

    public void enterCardNumber(String number){
        sendTextToElement(cardNumber, number);
    }

    public void selectMonthOfExpiry(String month){
        selectByVisibleTextFromDropDown(selectMonth, month);
    }

    public void selectYearOfExpire(String year){
        selectByVisibleTextFromDropDown(selectYear, year);
    }

    public void enterCardCode(String code){
        sendTextToElement(ccCode, code);
    }

    public void clickOnContinuePaymentInfoButton(){
        clickOnElement(btnContinuePaymentInfo);
    }

    public String getPaymentCardType(){
        return getTextFromElement(getCardType);
    }

    public String getShippingMethod(){
        return getTextFromElement(getShippingMethod);
    }

    public String getTotalPrice(){
        return getTextFromElement(totalPrice);
    }

    public void clickOnConfirmButton(){
        clickOnElement(btnConfirm);
    }

    public String getTitleOfThankYou(){
        return getTextFromElement(thankYou);
    }

    public String getSuccessMessageOfOrderSuccessfullyProcessed(){
        return getTextFromElement(successfullyMessage);
    }

    public void clickOnContinueOrderCompleteButton(){
        clickOnElement(btnContinueCompleted);
    }
}
