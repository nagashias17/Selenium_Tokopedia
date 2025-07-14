package com.juaracoding.Tokopedia_Selenium.page;
/*
IntelliJ IDEA 2024.1.4 (Community Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author ASUS ROG a.k.a. Muhammad Nagashi Iswahyunianto Wibowo
Java Developer
Created on 13/09/2024 06.32
@Last Modified 13/09/2024 06.32
Version 1.0
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public static void delay(int intDetik){
        try {
            Thread.sleep(intDetik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @FindBy (xpath = "//button[normalize-space()='Masuk']")
    WebElement btnMasuk;

    @FindBy(xpath = "//div[@class='css-1oknyfy'][normalize-space()='Nagashi']")
    WebElement profile;

    @FindBy(xpath = "//img[@alt='Keluar']")
    WebElement btnKeluar;

    @FindBy(xpath = "//input[@placeholder='Cari di Tokopedia']")
    WebElement fieldSearch;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div[4]/div[1]")
    WebElement resultProducts;

    @FindBy(xpath = "//div[@class='css-1852zva']")
    WebElement productNotFound;

    public WebElement getBtnMasuk() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(btnMasuk));
    }

    public WebElement getProfile() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(profile));
    }

    public WebElement getBtnKeluar() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(btnKeluar));
    }

    public WebElement getfieldSearch() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(fieldSearch));
    }

    public WebElement getresultProducts() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(resultProducts));
    }

    public WebElement getproductNotFound() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(productNotFound));
    }
}
