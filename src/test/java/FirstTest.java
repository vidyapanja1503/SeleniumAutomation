package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class FirstTest {

    @Test
    public void loginTest() {

        WebDriver driver = new ChromeDriver();

        // Open practice website
        driver.get("https://www.saucedemo.com");

        System.out.println("Page title: " + driver.getTitle());

        // Find username field and type
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        // Find password field and type
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        // Find login button and click
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Wait to see result
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ASSERTION — verify login was successful
        String ExpetedURL = "https://www.saucedemo.com/inventory.html";
        String ActualURL = driver.getCurrentUrl();
        System.out.println("Expected URL: " + ExpetedURL);
        System.out.println("Actual URL:   " + ActualURL);
        Assert.assertEquals(ActualURL, ExpetedURL, "Login failed! URL does not match!");
        System.out.println("LOGIN ASSERTION PASSED!");
        driver.quit();

    }
}