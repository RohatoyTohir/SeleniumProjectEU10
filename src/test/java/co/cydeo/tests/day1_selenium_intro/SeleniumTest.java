package co.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        //1-Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3-Test if driver is working as expected
        driver.get("https://www.google.com");

        WebElement acceptAll = driver.findElement(By.id("L2AGLb"));
        acceptAll.click();

    }
}
