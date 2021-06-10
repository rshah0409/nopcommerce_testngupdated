package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TestBase {

    DeskTopPage deskTopPage = new DeskTopPage();
    BuildYourOwnPage buildyourownpage2 = new BuildYourOwnPage();
    ComputersPage computersPage = new ComputersPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserNavigatesToBuildYourPageAndProductAddedToCartSuccessfully() throws InterruptedException {
        homePage.selectMenu( "Computers" );
        deskTopPage.clickOnDesktopOption();
        deskTopPage.selectFromDropdown("Name: A to Z");
        deskTopPage.clickOnAddToCart();
        String expectedPagetext = "Build your own computer";  //verify build your own page
        String actualPageText = buildyourownpage2.getBuildYourOwnText();
        Assert.assertEquals( expectedPagetext, actualPageText );
        buildyourownpage2.selectProcessorFromDropDownOne( "2.2 GHz Intel Pentium Dual-Core E2200" );
        buildyourownpage2.selectRamFromDropDownTwo( "8GB [+$60.00]" );
        buildyourownpage2.clickOnHDDRadioButton();
        buildyourownpage2.clickOSOnRadioButton();
        buildyourownpage2.clickOnSoftwareCheckBox();
        String expectedtotal = "$1,475.00";          //Verifying Total
        String actualTotal = buildyourownpage2.getTotalAmt();
        Assert.assertEquals( expectedtotal, actualTotal );
        buildyourownpage2.clickOnAddToCart();
        String expectedBarMessage = "The product has been added to your shopping cart";
        String actualBarMessage = buildyourownpage2.getTopBarMessage();
        Assert.assertEquals( expectedBarMessage, actualBarMessage );


    }
}
