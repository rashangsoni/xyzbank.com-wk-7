package com.xyzbank.Pages;

import com.xyzbank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());
    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    //enter FirstName
    @CacheLookup
    @FindBy(css = "input[placeholder='First Name']")
    WebElement enterFirstName;
    public void enterFirstName(String firstName)
    {sendTextToElement(enterFirstName,firstName);
        log.info("Enter First Name : " + firstName.toString());}

    //enter LastName
    @CacheLookup
    @FindBy(css ="input[placeholder='Last Name']")
    WebElement lastNameField;
    public void lastName(String lastName)
    {sendTextToElement(lastNameField,lastName);
        log.info("Enter Last Name :" +lastName.toString());}


    //enter PostCode
    @CacheLookup
    @FindBy(css ="input[placeholder='Post Code']" )
    WebElement postCode;
    public void postCode(String pCode)
    {sendTextToElement(postCode,pCode);
        log.info("Enter PostCode :"+pCode.toString());}


    //click On "Add Customer" Button
    @CacheLookup
    @FindBy(css = "button[type='submit']")
    WebElement clickOnAddCustome;
    public void clickOnAddCustomerButton()
    {clickOnElement(clickOnAddCustome);
        log.info("Click on Add Customer Button ");}

}