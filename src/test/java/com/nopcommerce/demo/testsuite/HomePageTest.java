package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest extends TestBase {

    HomePage homepage = new HomePage();
    @Test

public void clickOnTopMenuTabAndVerify() {

   homepage.selectMenu("Computers");


}

}
