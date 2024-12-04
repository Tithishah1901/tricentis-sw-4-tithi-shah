package sw.tricentis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sw.tricentis.utilities.Utility;

import java.util.List;

public class DesktopPage extends Utility {
    By selectOption= By.id("products-orderby");
    By productElements = By.xpath("//h2[@class='product-title']/a");

    public void sortProductByNameZtoA(String option){
        selectByVisibleTextFromDropDown(selectOption,option);
    }

    public List<WebElement> getListOfProduct(){
        return getListOfElements(productElements);
    }

    public void clickOnAddToCartOfYourSelectedProduct(String name){
        clickOnElement(By.linkText(name));
    }
}
