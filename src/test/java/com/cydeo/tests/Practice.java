package com.cydeo.tests;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Practice {

    //Go to https://the-internet.herokuapp.com/status_codes
    //Verify if the correct status code is written when the status code link is clicked

    @Test
    public void verify_status_code(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/status_codes");
        verifyStatusCode("200");
        verifyStatusCode("301");
        verifyStatusCode("404");
        verifyStatusCode("500");

//        Driver.getDriver().findElement(By.linkText("200")).click();
//        String actualText = Driver.getDriver().findElement(By.tagName("p")).getText();
//        Assert.assertTrue(actualText.contains("200"));
//
//        Driver.getDriver().navigate().back();
//
//        Driver.getDriver().findElement(By.linkText("301")).click();
//        String actualText1 = Driver.getDriver().findElement(By.tagName("p")).getText();
//        Assert.assertTrue(actualText1.contains("301"));
//
//        Driver.getDriver().navigate().back();
//
//        Driver.getDriver().findElement(By.linkText("404")).click();
//        String actualText2 = Driver.getDriver().findElement(By.tagName("p")).getText();
//        Assert.assertTrue(actualText2.contains("404"));
//
//        Driver.getDriver().navigate().back();
//
//        Driver.getDriver().findElement(By.linkText("500")).click();
//        String actualText3 = Driver.getDriver().findElement(By.tagName("p")).getText();
//        Assert.assertTrue(actualText3.contains("500"));
//
//        Driver.getDriver().navigate().back();

    }

public void verifyStatusCode(String statusCode){
    Driver.getDriver().findElement(By.linkText(statusCode)).click();
    String actualText = Driver.getDriver().findElement(By.tagName("p")).getText();
    Assert.assertTrue(actualText.contains(statusCode));

    Driver.getDriver().navigate().back();

//    Driver.getDriver().findElement(By.xpath("//a[.='"+statusCode+"']")).click();
//    String xpath = "//a[.='"+statusCode+"']";
//
//    String actualText1 = Driver.getDriver().findElement(By.tagName("p")).getText();
//    Assert.assertTrue(actualText1.contains(statusCode));
//
//    Driver.getDriver().navigate().back();
}


}