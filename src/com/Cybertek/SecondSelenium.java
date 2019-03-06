package com.Cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\fjiaodaiiti\\Documents\\selenium independencies\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();// this line open firefox driver
        driver.get("https://etsy.com");
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();

    }
}
