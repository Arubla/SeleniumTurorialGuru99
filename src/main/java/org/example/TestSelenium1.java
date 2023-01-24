package org.example;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSelenium1 {

    public void guru99Test() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/");

        WebElement emailInput = driver.findElement(By.xpath("//input[@name='emailid']"));

        emailInput.sendKeys("abc@gmail.com");

        WebElement emailSubmit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        emailSubmit.click(); //the method does not wait for a new page to load


    }

}
