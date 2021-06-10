package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DeskTopPage extends Utility {
    By clickOnDesktop = By.xpath( "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]" );
    By selectAToZ = By.xpath( "//select[@id='products-orderby']" );
    By addTocart = By.xpath( "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]" );

    public void clickOnDesktopOption() throws InterruptedException {
        Thread.sleep( 1000 );
        clickOnElement(clickOnDesktop);
    }

    public void selectFromDropdown(String sortBy) {

        selectByVisibleTextFromDropDown( selectAToZ, sortBy );
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep( 2000 );
        clickOnElement( addTocart );
    }

}
