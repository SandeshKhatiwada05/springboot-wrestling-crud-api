package com.wrestling.springboot_wrestling_crud_api.wrestling.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class WrestlerSeleniumTest {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        // Make sure chromedriver is in PATH
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void testWrestlerPage() {
        driver.get("http://localhost:8080/index.html");

        // Check title
        assert driver.getTitle().equals("Wrestlers");

        // Find list
        WebElement list = driver.findElement(By.id("wrestler-list"));
        assert list.getText().contains("The Undertaker");

        // Click Add button
        WebElement addButton = driver.findElement(By.id("add-wrestler"));
        addButton.click();

        // For demo, just print
        System.out.println("Clicked Add Wrestler button");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}