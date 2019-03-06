package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) {
        // we cannot open a browser without setting the path drivers
        // this line must come before creating the webdriver object
        // first argument is the type driver

        // location of the driver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fjiaodaiiti\\Documents\\selenium independencies\\drivers\\chromedriver.exe");


        // this line open a chrome browser
        WebDriver driver = new ChromeDriver();
        // open a website
        driver.get("https://google.com");
        driver.get("https://etsy.com");
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();  // refreshes the page
        // BREAK

    }
}
