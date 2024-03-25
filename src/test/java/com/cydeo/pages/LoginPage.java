package com.cydeo.pages;

import com.cydeo.utilities.*;
import org.apache.commons.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement userNameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
}
