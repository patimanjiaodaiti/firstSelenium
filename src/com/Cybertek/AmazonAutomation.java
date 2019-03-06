package com.Cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomation {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fjiaodaiiti\\Documents\\selenium independencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");//will take to google
        //driver.manage().window().fullscreen();//will increase the size of the website

        //first way

        driver.findElement(By.name("q")).sendKeys("Amazon"+ Keys.ENTER);//on search box it will print amazon
        //second way
//        WebElement googleAmazon = driver.findElement(By.name("q"));
//        googleAmazon.sendKeys("Amazon");
        driver.findElement(By.className("LC20lb")).click();
        driver.findElement(By.id("nav-link-accountList")).click();

        WebElement inputEmail = driver.findElement(By.id("ap_email"));
        inputEmail.sendKeys("patima0218@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("ap_password"));
        inputPassword.sendKeys("hope0218");

        driver.findElement(By.id("signInSubmit")).click();  //click sign in but/ passport is wrong

        driver.findElement(By.id("auth-fpp-link-bottom")).click(); //click forget password

        WebElement EmailOrPhoneNumber= driver.findElement(By.name("email"));
        EmailOrPhoneNumber.clear();
        EmailOrPhoneNumber.sendKeys("patima0218@gmail.com");//Email or mobile phone number here i input phone number

        driver.findElement(By.id("continue")).click();//click continue

        WebElement ZipCode= driver.findElement(By.name("zipCode"));
        ZipCode.sendKeys("22030");
        driver.findElement(By.id("continue")).click();


        driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");


        WebElement EnterEmail= driver.findElement(By.className("whsOnd zHQkBf"));
        EnterEmail.sendKeys("patima0218@gmail.com");







 //        Thread.sleep(5000); //will slow down the page for two sec
//        driver.quit();    //will close the page




    }
}
