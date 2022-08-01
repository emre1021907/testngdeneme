package com.paraleltestingdeneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {



    @Test
    public void m1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kosee\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(4000);
    }
    @Test
    public void m4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kosee\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ensonhaber.com/");
        Thread.sleep(4000);
    }
}
