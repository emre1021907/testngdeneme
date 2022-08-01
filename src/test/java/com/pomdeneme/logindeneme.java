package com.pomdeneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import java.io.IOException;
import java.util.logging.Logger;

public class logindeneme extends BaseClass {


    @Test
    public void google() throws InterruptedException, IOException {
        driver.get(url);

        Logger logger = Logger.getLogger("logindeneme");
        DOMConfigurator.configure("C:\\Source\\testngdeneme\\log4j.xml");

        logger.info("Url is opened");

        pomdeneme pm = new pomdeneme(driver);
        logger.info("base class imported");
        pm.googlearama("emre");
        logger.info("aramaya emre girildi");

        if (driver.getTitle().equals("gogle")){
            Assert.assertTrue(true);
            logger.info("Test passed");
        }
        else{
            captureScreen(driver, "logintest");
            Assert.assertTrue(false);
            logger.info("Login test failed");
        }

        Thread.sleep(4000);

    }


}
