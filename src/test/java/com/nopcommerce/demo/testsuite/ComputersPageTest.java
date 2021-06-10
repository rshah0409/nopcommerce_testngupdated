package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputersPageTest extends TestBase {
    ComputersPage computersPage = new ComputersPage();

    @Test
    public void clickOnDesktopAndSortByZtoA() throws InterruptedException {
        computersPage.clickOnComputersTab();
        computersPage.clickOnDesktopOption();
        computersPage.verifyproductsSortByGivenOrder();
    }
}
