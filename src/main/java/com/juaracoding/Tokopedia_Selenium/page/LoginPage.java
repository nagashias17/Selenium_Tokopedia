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
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public  void delay(int intDetik){
        try {
            Thread.sleep(intDetik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @FindBy(xpath = "//input[@id='email-phone']")
    WebElement fieldEmailAndPhone;

    @FindBy(xpath = "//h3[@class='css-14sozj8-unf-heading e1qvo2ff3']")
    WebElement titleMasuk;

    @FindBy(xpath = "//span[normalize-space()='Selanjutnya']")
    WebElement btnSelanjutnya;

    @FindBy(xpath = "//input[@id='password-input']")
    WebElement fieldPassword;

    @FindBy(xpath = "//span[@class='css-1i85qm8-unf-checkbox__area e3y1k2n1']")
    WebElement checboxIngatSaya;

    @FindBy(xpath = "//span[@aria-label='login-button']")
    WebElement btnLogin;

    @FindBy(xpath = "/html/body/div[6]/div[2]/article/div/div/div/div[2]/div/div")
    WebElement btnEmailVerification;

    @FindBy(xpath = "//h5[@class='css-xvn0u1-unf-heading e1qvo2ff5']")
    WebElement titleEmailBelumTerdaftar;

    @FindBy(xpath = "//span[normalize-space()='Ubah']")
    WebElement btnUbah;

    @FindBy(xpath = "//p[@class='css-t9c9fq erj7th78']")
    WebElement alertMessages;

    public WebElement getFieldEmailAndPhone() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(fieldEmailAndPhone));
    }

    public WebElement getTitleMasuk() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(titleMasuk));
    }

    public WebElement getFieldPassword() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(fieldPassword));
    }

    public WebElement getBtnSelanjutnya() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(btnSelanjutnya));
    }

    public WebElement getChecboxIngatSaya() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(checboxIngatSaya));
    }

    public WebElement getBtnLogin() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(btnLogin));
    }

    public WebElement gettitleEmailBelumTerdaftar() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(titleEmailBelumTerdaftar));
    }

    public WebElement getbtnUbah() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(btnUbah));
    }

    public WebElement getalertMessages() {
        delay(1);
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(alertMessages));
    }
}
