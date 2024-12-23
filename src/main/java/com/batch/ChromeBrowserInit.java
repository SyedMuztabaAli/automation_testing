package com.batch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChromeBrowserInit {
    WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void openURL() throws InterruptedException {
        driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();
        Thread.sleep(10000);

    }
    @AfterSuite
    public void closeChromeBrowser(){
        driver.close();
    }
}
