package co.cydeo.tests.day1_selenium_intro;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {
        //*TC #1: Yahoo Title Verification
        //do set up for browser driver
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome browser
        WebDriver driver =new ChromeDriver();

        //makes our page full screen
        driver.manage().window().maximize();

        // 2.Go to https://www.yahoo.com
        driver.get("https://yahoo.com");


        // 3. Verify title:

        //Expected:  Yahoo UK | News, email and search
        String expectedTitle = "Yahoo UK | News, email and search";

        //actual title comes from the browser
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else{
            System.out.println("Title is not as expected. Verification FAILED!");
        }
    }
}
