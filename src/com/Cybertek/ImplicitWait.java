package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args)  throws Exception{
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fjiaodaiiti\\Documents\\selenium independencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //this line makes the findElement method wait for some time when it cannot find an element
        //findElement method will keep trying to locate the element during the given durartion
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.http://cheapfansedge.info");

        driver.findElement(By.tagName("input")).sendKeys("astfhd");
        //hard code wait
        Thread.sleep(5000);// throws Exception will help compile the code
        driver.get("https://google.com");
    }
}

