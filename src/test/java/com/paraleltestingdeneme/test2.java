package com.paraleltestingdeneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test2 {
    @Test
    public void m2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kosee\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.udemy.com/");
        Thread.sleep(4000);
    }
}
