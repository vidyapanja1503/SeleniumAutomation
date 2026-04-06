package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void openWthreeSchools() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        System.out.println("Page Title is " + driver.getTitle());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
        System.out.println("Browser closed successfully!");
    }
}