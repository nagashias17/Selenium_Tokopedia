package com.juaracoding.Tokopedia_Selenium.impl;
/*
IntelliJ IDEA 2024.1.4 (Community Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author ASUS ROG a.k.a. Muhammad Nagashi Iswahyunianto Wibowo
Java Developer
Created on 13/09/2024 07.43
@Last Modified 13/09/2024 07.43
Version 1.0
*/
import com.juaracoding.Tokopedia_Selenium.page.HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchProductPositiveSteps {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tokopedia.com/");
    }

    @Test(dataProvider = "DataProduct")
    public void Search_Positive_Products(String product) {
        HomePage homePage = new HomePage(driver);

        homePage.getfieldSearch().sendKeys(product);
        homePage.getfieldSearch().sendKeys(Keys.ENTER);

        Boolean state = true;
        while (state) {
            try {
                String result = homePage.getresultProducts().getText();
                System.out.println("Results Product : ");
                System.out.println(result);
                System.out.println("===============================================");
                System.out.println("Expected Product : " + result.contains(product));
                Assert.assertEquals(result.contains(product), true);
                state = false;
            } catch (Exception e) {
            }
        }
    }

    @DataProvider(name = "DataProduct")
    public Object[][] getDataProduct() {
        return new Object[][] {
                {"Canon EOS 3000D"},
                {"canon EOS 750D"},
                {"SONY APLHA"}
        };
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
