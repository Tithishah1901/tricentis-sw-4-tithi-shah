package sw.tricentis.pages;

import org.openqa.selenium.By;
import sw.tricentis.utilities.Utility;

public class ProductDetailsPage extends Utility {
    By productTitle = By.xpath("//h1");
    By processor = By.id("product_attribute_16_5_4");
    By ram = By.id("product_attribute_16_6_5");
    By HDD400GB = By.xpath("//input[@id='product_attribute_16_3_6_19']");
    By windows10 = By.id("product_attribute_16_4_7_21");
    By microsoftOffice = By.id("product_attribute_16_8_8_22");
    By totalCommander = By.id("product_attribute_16_8_8_24");
    By totalPrise = By.xpath("//span[@itemprop='price']");
    By quantity  = By.xpath("//input[@id='addtocart_43_EnteredQuantity']");
    By addToCart = By.xpath("//input[@class='button-1 add-to-cart-button']");
    By successMessage = By.xpath("//p[@class='content']");
    By closeButton = By.xpath("//span[@title='Close']");


    public String getTitleOfYourSelectedProduct(){
        return getTextFromElement(productTitle);
    }

    public void selectProcessorInDropDown(String name){
        selectByVisibleTextFromDropDown(processor, name);
    }

    public void selectRamInDropDown(String name){
        selectByVisibleTextFromDropDown(ram, name);
    }

    public void clickOnHDDRadioButton400GB(){
        clickOnElement(HDD400GB);
    }

    public void clickOnOSRadioButtonWindow10(){
        clickOnElement(windows10);
    }

    public void clickOnCheckboxMicrosoftOffice(){
        if (!getWebElement(microsoftOffice).isSelected()){
            clickOnElement(microsoftOffice);
        }
    }

    public void clickOnCheckboxTotalCommander(){
        if (!getWebElement(totalCommander).isSelected()){
            clickOnElement(totalCommander);
        }
    }

    public String getTotalPrice(){
        return getTextFromElement(totalPrise);
    }

    public void changeProductQuantity(String qty){
        sendTextToElementWithClearText(quantity ,qty);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
    }

    public String getSuccessMessageToAddProductInCart(){
        return getTextFromElement(successMessage);
    }

    public void clickOnCrossButtonInGreenBar(){
        clickOnElement(closeButton);
    }
}
