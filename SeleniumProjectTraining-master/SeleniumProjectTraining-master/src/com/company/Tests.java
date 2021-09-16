package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Instant;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Tests {

    ChromeDriver driver;

    @BeforeClass
    void beforeClass(){
        System.out.println("==== @BeforeClass =====");
    }

    @AfterClass
    void afterClass(){
        System.out.println("==== @AfterClass =====");
    }

    @BeforeMethod
    void setup(){
        System.out.println("==== @BeforeMethod =====");
        /*
        String url = "http://training.skillo-bg.com:4300/posts/all";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
         */
    }

    @AfterMethod
    void cleanUp(){
        System.out.println("==== @AfterMethod =====");
        //driver.close();
    }

    @Test
    void successfulRegistration(){
        System.out.println(" Tests.Test 1");
        /*
        long timestamp = Instant.now().getEpochSecond();
        String username = "hjusein" + timestamp;
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys(username);
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='email']"));
        emailField.sendKeys(timestamp + "@gmail.com");
        WebElement birthDate = driver.findElement(By.xpath("//input[@placeholder='Birth date']"));
        birthDate.sendKeys("03211984");
        WebElement passField = driver.findElement(By.id("defaultRegisterFormPassword"));
        passField.sendKeys("Hju123_");
        WebElement passField2 = driver.findElement(By.id("defaultRegisterPhonePassword"));
        passField2.sendKeys("Hju123_");
        WebElement publicInfoField = driver.findElement(By.name("pulic-info"));
        publicInfoField.sendKeys("alabala");
        WebElement registerBtn = driver.findElement(By.id("sign-in-button"));
        registerBtn.click();
        WebElement profileLink = driver.findElement(By.id("nav-link-profile"));
        WebElement postLink = driver.findElement(By.id("nav-link-new-post"));
        Assert.assertTrue(profileLink.isDisplayed());
        Assert.assertTrue(postLink.isDisplayed());

         */
    }

    @Test
    void unsuccessfulRegistrationUsernameTaken(){
        System.out.println("Tests.Test 2");
        /*
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("hjusein1234");
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='email']"));
        emailField.sendKeys("hjusein@gmail.com");
        WebElement birthDate = driver.findElement(By.xpath("//input[@placeholder='Birth date']"));
        birthDate.sendKeys("03211984");
        WebElement passField = driver.findElement(By.id("defaultRegisterFormPassword"));
        passField.sendKeys("Hju123_");
        WebElement passField2 = driver.findElement(By.id("defaultRegisterPhonePassword"));
        passField2.sendKeys("Hju123_");
        WebElement publicInfoField = driver.findElement(By.name("pulic-info"));
        publicInfoField.sendKeys("alabala");
        WebElement registerBtn = driver.findElement(By.id("sign-in-button"));
        registerBtn.click();

        WebElement usernameTakenMsg = null;
        try {
            usernameTakenMsg = driver.findElement(By.xpath("//div[contains(text(), 'Username takenx')]"));
        } catch (Exception e) {
            System.out.println("Nyama takuv element");
        }

        Assert.assertTrue(usernameTakenMsg.isDisplayed());

         */
    }

    @Test(groups = { "group1", "group2" })
    void test3(){
        System.out.println("Tests.Test 3");
        /*
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("hjusein1234");
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='email']"));
        emailField.sendKeys("hjusein@gmail.com");
        WebElement birthDate = driver.findElement(By.xpath("//input[@placeholder='Birth date']"));
        birthDate.sendKeys("03211984");
        WebElement passField = driver.findElement(By.id("defaultRegisterFormPassword"));
        passField.sendKeys("Hju123_");
        WebElement passField2 = driver.findElement(By.id("defaultRegisterPhonePassword"));
        passField2.sendKeys("Hju123_");
        WebElement publicInfoField = driver.findElement(By.name("pulic-info"));
        publicInfoField.sendKeys("alabala");
        WebElement registerBtn = driver.findElement(By.id("sign-in-button"));
        registerBtn.click();

        WebElement usernameTakenMsg = null;
        try {
            usernameTakenMsg = driver.findElement(By.xpath("//div[contains(text(), 'Username takenx')]"));
        } catch (Exception e) {
            System.out.println("Nyama takuv element");
        }

        Assert.assertTrue(usernameTakenMsg.isDisplayed());

         */
    }

    @Test(groups = { "group1" })
    void test5(){
        System.out.println("Tests.Test 5");
        /*
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("hjusein1234");
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='email']"));
        emailField.sendKeys("hjusein@gmail.com");
        WebElement birthDate = driver.findElement(By.xpath("//input[@placeholder='Birth date']"));
        birthDate.sendKeys("03211984");
        WebElement passField = driver.findElement(By.id("defaultRegisterFormPassword"));
        passField.sendKeys("Hju123_");
        WebElement passField2 = driver.findElement(By.id("defaultRegisterPhonePassword"));
        passField2.sendKeys("Hju123_");
        WebElement publicInfoField = driver.findElement(By.name("pulic-info"));
        publicInfoField.sendKeys("alabala");
        WebElement registerBtn = driver.findElement(By.id("sign-in-button"));
        registerBtn.click();

        WebElement usernameTakenMsg = null;
        try {
            usernameTakenMsg = driver.findElement(By.xpath("//div[contains(text(), 'Username takenx')]"));
        } catch (Exception e) {
            System.out.println("Nyama takuv element");
        }

        Assert.assertTrue(usernameTakenMsg.isDisplayed());

         */
    }

    @Test(groups = { "group3"})
    void test4(){
        System.out.println("Tests.Test 4");
        /*
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("hjusein1234");
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='email']"));
        emailField.sendKeys("hjusein@gmail.com");
        WebElement birthDate = driver.findElement(By.xpath("//input[@placeholder='Birth date']"));
        birthDate.sendKeys("03211984");
        WebElement passField = driver.findElement(By.id("defaultRegisterFormPassword"));
        passField.sendKeys("Hju123_");
        WebElement passField2 = driver.findElement(By.id("defaultRegisterPhonePassword"));
        passField2.sendKeys("Hju123_");
        WebElement publicInfoField = driver.findElement(By.name("pulic-info"));
        publicInfoField.sendKeys("alabala");
        WebElement registerBtn = driver.findElement(By.id("sign-in-button"));
        registerBtn.click();

        WebElement usernameTakenMsg = null;
        try {
            usernameTakenMsg = driver.findElement(By.xpath("//div[contains(text(), 'Username takenx')]"));
        } catch (Exception e) {
            System.out.println("Nyama takuv element");
        }

        Assert.assertTrue(usernameTakenMsg.isDisplayed());

         */
    }
}
