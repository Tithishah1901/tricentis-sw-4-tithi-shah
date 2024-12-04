package sw.tricentis.testsuit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sw.tricentis.pages.*;
import sw.tricentis.testbase.BaseTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        //1.1 Click on the COMPUTERS Menu .
        homePage.clickOnTopMenuComputer("Computers");
        //1.2 Click on Desktop
        homePage.clickOnTopMenuComputer("Desktops");
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.sortProductByNameZtoA("Name: Z to A");

        //  Verify the products are arranged in descending order
        List<String> actualProductNames = new ArrayList<>();
        for (WebElement product : desktopPage.getListOfProduct()) {
            actualProductNames.add(product.getText());
        }

        // Create a sorted copy of the product names in descending order
        List<String> expectedProductNames = new ArrayList<>(actualProductNames);
        Collections.sort(expectedProductNames, Collections.reverseOrder());

        // Assert that the product names are sorted correctly
        Assert.assertEquals(actualProductNames, expectedProductNames, "Products are not sorted in descending order!");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() {

        //2.1 Click on the COMPUTERS Menu.
        homePage.clickOnTopMenuComputer("Computers");
        //2.2 Click on the Desktop
        homePage.clickOnTopMenuComputer("Desktops");
        //2.3 Select Sort By option "Name: A to Z"
        desktopPage.sortProductByNameZtoA("Name: A to Z");
        //2.4 Click on the "Add To Cart" button of the product name ‘Build your own computer’
        desktopPage.clickOnAddToCartOfYourSelectedProduct("Build your own computer");
        //2.5 Verify the Text "Build your own computer"
        Assert.assertEquals(productDetailsPage.getTitleOfYourSelectedProduct(),
                "Build your own computer"
                , "Product title mismatch!");
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using the Select class
        productDetailsPage.selectProcessorInDropDown("2.2 GHz Intel Pentium Dual-Core E2200");
        //2.7.Select "8GB [+$60.00]" using the Select class.
        productDetailsPage.selectRamInDropDown("8GB [+60.00]");
        //2.8 Select HDD radio button "400 GB [+$100.00]"
        productDetailsPage.clickOnHDDRadioButton400GB();
        //2.9 Select the OS radio button "Windows 10 [+$60.00]"
        productDetailsPage.clickOnOSRadioButtonWindow10();
        //2.10 Check Two Checkboxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        productDetailsPage.clickOnCheckboxMicrosoftOffice();
        productDetailsPage.clickOnCheckboxTotalCommander();
        //2.11 Verify the price "1200.00"
        Assert.assertEquals(productDetailsPage.getTotalPrice(), "1200.00"
                , "Total Price mismatch!");
        //2.12 Click on the "Add to card" Button.
        productDetailsPage.clickOnAddToCartButton();
        //2.13 Verify the Message "The product has been added to your shopping cart" on the Top green Bar
        Assert.assertTrue(productDetailsPage.getSuccessMessageToAddProductInCart()
                .contains("The product has been added to your shopping cart"), "Success message mismatch!");
        //2.14 After that close the bar by clicking on the cross button.
        productDetailsPage.clickOnCrossButtonInGreenBar();
        //2.15 Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
        homePage.mouseHoverOnShoppingCartOnTop();
        homePage.clickOnGoToCartButton();
        //2.16 Verify the message "Shopping cart"
        Assert.assertEquals(shoppingCartPage.getShoppingCartTitle(),
                "Shopping cart", "Cart title mismatch!");
        //2.17 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeQuantityOfProduct("2");
        shoppingCartPage.clickOnUpdateShoppingCartButton();
        //2.18 Verify the Total "2,950.00"
        Assert.assertEquals(shoppingCartPage.getTotalPriceOfProduct(),
                "2950.00", "Total price mismatch!");
        //2.19 click on the checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckBoxOfTermsAndCondition();
        //2.20 Click on “Checkout”
        shoppingCartPage.clickOnCheckOutButton();
        //2.21 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(signInPage.getWelcomeTextFromSignInTitle(),
                "Welcome, Please Sign In!", "Sign-in title mismatch!");
        //2.22 Click on the “Checkout as Guest” Tab
        signInPage.clickSignInAsAGuestButton();
        //2.23 Enter the First name
        checkOutPage.enterFirstName("Tithi");
        //2.24 Enter the Last name
        checkOutPage.enterLastName("Shah");
        //2.25 Enter the email
        checkOutPage.enterEmailAddress("tithi.123@gmail.com");
        //2.26 Select the Country “United Kingdom” using the select class
        checkOutPage.selectCountryFromDropdown("United Kingdom");
        //2.27 Enter the city
        checkOutPage.enterCityName("Leicester");
        //2.28 Enter the Address1
        checkOutPage.enterShippingAddress("city town");
        //2.29 Enter the Zip/Postal code
        checkOutPage.enterZipCode("LE16BD");
        //2.30 Enter the Phone number
        checkOutPage.enterPhoneNumber("7474757885");
        //2.31 Click on the “Continue” button
        checkOutPage.clickOnContinueBillingSaveButton();
        //2.32 Click on the “Continue” button
        checkOutPage.clickOnContinueShippingSaveButton();
        //2.33 Click on the Radio Button “Next Day Air($0.00)”
        checkOutPage.clickOnShippingMethodOnNextDayAir();
        //2.34 Click on the “Continue” button
        checkOutPage.clickOnContinueShippingMethodNextStep();
        //2.35 Select the Radio Button “Credit Card”
        checkOutPage.clickOnCreditCard();
        //2.36 Click on the “Continue” button
        checkOutPage.clickOnContinuePayment();
        //2.37 Select “Master card” From the Select credit card dropdown using the Select class
        checkOutPage.selectCardTypFromDropdown("Master card");
        //2.38 Enter the Cardholder's name
        checkOutPage.enterCardholderName("Alexis Runolfsdottir");
        //2.39 Enter the Card number
        checkOutPage.enterCardNumber("5451628062666699");
        //2.40 Select the Expiration date using the select class
        checkOutPage.selectMonthOfExpiry("08");
        checkOutPage.selectYearOfExpire("2025");
        //2.41 Enter the Card code
        checkOutPage.enterCardCode("031");
        //2.42 Click on the “Continue” button
        checkOutPage.clickOnContinuePaymentInfoButton();
        //2.43 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(checkOutPage.getPaymentCardType()
                , "Credit Card", "Payment method is not match!");
        //2.44 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(checkOutPage.getShippingMethod(),
                "Next Day Air", "Shipping Method is not matched!");
        //2.45 Verify Total is “2,950.00”
        Assert.assertEquals(checkOutPage.getTotalPrice(), "2950.00",
                "Total price mismatch!");
        //2.46 Click on the “Confirm” button
        checkOutPage.clickOnConfirmButton();
        //2.47 Verify the Text “Thank You”
        Assert.assertEquals(checkOutPage.getTitleOfThankYou(), "Thank you",
                "Thank you message mismatch!");
        //2.48 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(checkOutPage.getSuccessMessageOfOrderSuccessfullyProcessed(),
                "Your order has been successfully processed!", "order successfully message not matched!");
        //2.49 Click on the “Continue” button
        checkOutPage.clickOnContinueOrderCompleteButton();
        //2.50 Verify the text “Welcome to our store”
        Assert.assertEquals(homePage.getMessageOfWelcomeOurStore(), "Welcome to our store",
                "Welcome message mismatch!");
    }
}
