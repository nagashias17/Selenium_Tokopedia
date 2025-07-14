package com.juaracoding.Tokopedia_Selenium.impl;
/*
IntelliJ IDEA 2024.1.4 (Community Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author ASUS ROG a.k.a. Muhammad Nagashi Iswahyunianto Wibowo
Java Developer
Created on 13/09/2024 06.48
@Last Modified 13/09/2024 06.48
Version 1.0
*/
import com.juaracoding.Tokopedia_Selenium.page.HomePage;
import com.juaracoding.Tokopedia_Selenium.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginNegativeSteps {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tokopedia.com/");
    }

    @Test(dataProvider = "loginDataInvalidPassword")
    public void LoginNegative_Invalid_Password(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.getBtnMasuk().click();
        Assert.assertTrue(loginPage.getTitleMasuk().isDisplayed());
        loginPage.getFieldEmailAndPhone().sendKeys(username);
        loginPage.getBtnSelanjutnya().click();
        loginPage.getFieldPassword().sendKeys(password);
        loginPage.getChecboxIngatSaya().click();
        loginPage.getBtnLogin().click();
        Assert.assertTrue(loginPage.getalertMessages().isDisplayed());
    }

    @DataProvider(name = "loginDataInvalidPassword")
    public Object[][] getDataPassword() {
        return new Object[][] {
                {"nagashias17@gmail.com", "Naga1234"} // invalid password
        };
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
