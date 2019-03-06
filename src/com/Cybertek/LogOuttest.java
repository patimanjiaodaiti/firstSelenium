package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOuttest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fjiaodaiiti\\Documents\\selenium independencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement inputEmail = driver.findElement(By.id("session_email"));//returns an element whose id is session_emil
        inputEmail.sendKeys("kexesobepu@zsero.com");
        WebElement inputPassword = driver.findElement(By.id("session_password"));
        inputPassword.sendKeys("password");
        WebElement signinButton = driver.findElement(By.name("commit"));
        signinButton.click();
        WebElement  lougOutLink = driver.findElement(By.linkText("Sign out"));
        lougOutLink.click();
        WebElement homeLink = driver.findElement(By.partialLinkText("Hom"));
        homeLink.click();


    }
}
