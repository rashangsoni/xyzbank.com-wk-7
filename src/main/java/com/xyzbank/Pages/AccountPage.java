package com.xyzbank.Pages;

import com.xyzbank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountPage extends Utility {


    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }


    //click on "Deposit" Tab
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='deposit()']")
    WebElement clickOnDeposit;
    public void setClickOnDeposit() {
        clickOnElement(clickOnDeposit);
        log.info("Click on Deposit tab");
    }

    //Enter amount 100
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterAmount;
    public void setEnterAmountDeposit() {
        sendTextToElement(enterAmount, "100");
        log.info("Enter amount 100 : " + enterAmount.toString());
    }

    //click on "Deposit" Button
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnDepositButton;
    public void clickONDepositButton() {
        clickOnElement(clickOnDepositButton);
        log.info("Click on Deposit Button");
    }

    //click on "Withdraw" Tab
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    WebElement clickOnWithdrawl;
    public void clickOnWithdrawTab() {
        clickOnElement(clickOnWithdrawl);
        log.info("Click on withdrawal tab");
    }

    //Enter amount 50
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterAmout50;
    public void enterAmountWithdraw() {
        sendTextToElement(enterAmout50, "50");
        log.info("Enter Amount 50");
    }


    //click on "Withdraw" Button
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement getClickOnWithdrawlButton;
    public void clickOnWithdrawButton() {
        clickOnElement(getClickOnWithdrawlButton);
        log.info("Click in withdraw button");
    }


    //verify message "Deposit Successful"
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement verifyDeposit;
    public void verifyDepositText() {
        String expectedMessage2 = "Deposit Successful";
        String actualText1 = getTextFromElement(verifyDeposit);
        Assert.assertEquals(expectedMessage2, actualText1);
    }

    //verify message "Deposit Successful"
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement verifyWithdraw;
    public void verifyWithdrawText() {
        String expectedMessage2 = "Transaction successful";
        String actualText1 = getTextFromElement(verifyWithdraw);
        Assert.assertEquals(expectedMessage2, actualText1);
    }


}