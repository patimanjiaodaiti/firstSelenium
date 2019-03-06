package com.Cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumDowlodeDay {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\fjiaodaiiti\\Documents\\selenium independencies\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();




        // this line open a chrome browser
        //System.setProperty("webdriver.chrome.driver",
        //        "C:\\Users\\fjiaodaiiti\\Documents\\selenium independencies\\drivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com/");



    }
}
