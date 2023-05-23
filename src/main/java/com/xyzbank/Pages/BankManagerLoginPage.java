package com.xyzbank.Pages;

import com.xyzbank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());
    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }


    //click On "Bank Manager Login" Tab
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement clickOnBankManagerTab;
    public void clickOnBankManagerLoginTab()
    {clickOnElement(clickOnBankManagerTab);}

}

