package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationAddressBook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fjiaodaiiti\\Documents\\selenium independencies\\drivers\\chromedriver.exe");
        //we cannot open a browser without setting the path drivers
        //this line must come before creating the webdriver object
        //first argument is the type driver
        WebDriver driver = new ChromeDriver();
        //how to maximize the system
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/sign_in");
        //this method comes from the webdrive class. it locates an element on the page
        //finding element from page. nothing visible will heppens when we open the site
        WebElement inputEmail = driver.findElement(By.id("session_email"));//returns an element whose id is session_emil
        //WebElement= class that represents a specific element on the page. we can do click, type... operations on webelement
        // enter username
        inputEmail.sendKeys("kexesobepu@zsero.com");
        //find the passward input box
        WebElement inputPassword = driver.findElement(By.id("session_password"));
        // enter password
        inputPassword.sendKeys("password");
        //inputEmail.clear(); will clear the enterd email
        //inputEmail.isDisplayed()


        // locates the sign in button
        WebElement signinButton = driver.findElement(By.name("commit"));

        System.out.println(driver.getTitle());

        // clicks on the button
        signinButton.click();

        System.out.println(driver.getTitle());

        // located the username element
        WebElement username = driver.findElement(By.className("navbar-text"));

        String actualUsername = username.getText();
        System.out.println(actualUsername);

        if ("kexesobepu@zsero.com".equals(actualUsername)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("EXPECTED: kexesobepu@zsero.com");
            System.out.println("actualUsername = " + actualUsername);
        }
        if ( !driver.getTitle().contains("Sign In") ) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
            System.out.println(driver.getTitle());
        }

        driver.
                findElement(
                        By.id("session_email")
                );



    }
}
