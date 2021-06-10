package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnPage extends Utility {
    By buildYourPage = By.xpath( "//div[@class='overview']/div/child::h1" );
    By dropDown1 = By.id("product_attribute_1");
    By dropDown2 = By.id( "product_attribute_2" );
    By radioButton1 = By.id( "product_attribute_3_7" );
    By radioButton2 = By.id( "product_attribute_4_9" );
    By radioButton3 = By.id( "product_attribute_5_12" );
    By totalAmt = By.xpath( "//span[text()='$1,475.00']" );
    By clickAddCart = By.id( "add-to-cart-button-1" );
    By topBarMsg = By.xpath( "//p[text()='The product has been added to your ']" );

    public String getBuildYourOwnText(){

        return getTextFromElement( buildYourPage );
    }
    public  void selectProcessorFromDropDownOne(String procesor){
        selectByVisibleTextFromDropDown( dropDown1,procesor );

    }
    public  void selectRamFromDropDownTwo(String ram){

        selectByVisibleTextFromDropDown(dropDown2,ram );
    }
    public  void clickOnHDDRadioButton(){
        clickOnElement(radioButton1 );
    }
    public  void clickOSOnRadioButton(){
        clickOnElement( radioButton2 );
    }
    public void clickOnSoftwareCheckBox(){
        clickOnElement( radioButton3 );
    }
    public String getTotalAmt(){
        return getTextFromElement(totalAmt);
    }
    public void clickOnAddToCart(){
        clickOnElement( clickAddCart );
    }
    public String getTopBarMessage(){
        return getTextFromElement( topBarMsg );
    }


}
