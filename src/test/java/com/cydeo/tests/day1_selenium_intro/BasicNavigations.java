package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1-Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the Selenium webdriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //or driver.manage().window().fullscreen();

        //3-go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate().to():
        driver.navigate().to("https://google.com");
         currentTitle = driver.getTitle();


        //to click cookies on google page
        WebElement acceptAll=driver.findElement(By.id("L2AGLb"));
        acceptAll.click();

        //get the title of the page
       // System.out.println("driver.getTitle() = " + driver.getTitle());


        System.out.println("currentTitle = " + currentTitle);

        //get current URL
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //this will close the current opened window
        //driver.close();

        //this will close all of the opened windows
      driver.quit();

    }
}
