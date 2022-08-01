package com.pomdeneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomdeneme {

    WebDriver driver;

    pomdeneme(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

     @FindBy(name = "q")
    WebElement txtarama;

    public void googlearama(String yazi) {
        txtarama.sendKeys(yazi);
    }



}

