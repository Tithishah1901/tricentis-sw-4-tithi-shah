package sw.tricentis.pages;

import org.openqa.selenium.By;
import sw.tricentis.utilities.Utility;

public class HomePage extends Utility {


    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//input[@value='Go to cart']");
    By welcomeOurStore = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By electronicTab = By.xpath("//ul[@class='top-menu']//a[normalize-space()='Electronics']");
    By cellPhones = By.xpath("//a[contains(text(), 'Cell phones')]");
    By logOut = By.xpath("//a[normalize-space()='Log out']");

    public void clickOnTopMenuComputer(String name){
        clickOnElement(By.linkText(name));
    }
    public void mouseHoverOnShoppingCartOnTop(){
        mouseHoverToElement(shoppingCart);
    }

    public void clickOnGoToCartButton(){
        clickOnElement(waitUntilVisibilityOfElementLocated(goToCart, 5));
        //clickOnElement(goToCart);
    }

    public String getMessageOfWelcomeOurStore(){
        return getTextFromElement(welcomeOurStore);
    }

    public void mouseHoverOnElectronicTab(){
        mouseHoverToElement(electronicTab);
    }

    public void mouseHoverAndClickOnCellPhones(){
        mouseHoverToElementAndClick(cellPhones);
    }

    public void clickOnLogOutButton(){
        clickOnElement(logOut);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
