package sw.tricentis.pages;

import org.openqa.selenium.By;
import sw.tricentis.utilities.Utility;

public class ShoppingCartPage extends Utility {
    By shoppingCartTitle = By.xpath("//h1[normalize-space()='Shopping cart']");
    By qtyChange = By.xpath("//input[contains(@name,'itemquantity')]");
    By btnUpdateCart = By.xpath("//input[@name='updatecart']");
    By quantity = By.xpath("//input[contains(@name,'itemquantity')]");
    By totalPrice = By.xpath("//span[@class='product-subtotal']");
    By termsAndCondition = By.id("termsofservice");
    By btnCheckOut = By.xpath("//button[@id='checkout']");

    public String getShoppingCartTitle() {
        return getTextFromElement(shoppingCartTitle);
    }

    public void changeQuantityOfProduct(String qty) {
        sendTextToElementWithClearText(qtyChange, qty);
    }

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(btnUpdateCart);
    }

    public String getQuantityOfProduct() {
        return getTextFromElement(quantity);
    }

    public String getTotalPriceOfProduct() {
        return getTextFromElement(totalPrice);
    }

    public void clickOnCheckBoxOfTermsAndCondition() {
        if (!getWebElement(termsAndCondition).isSelected()) {
            clickOnElement(termsAndCondition);
        }
    }

    public void clickOnCheckOutButton() {
        clickOnElement(btnCheckOut);
    }
}
