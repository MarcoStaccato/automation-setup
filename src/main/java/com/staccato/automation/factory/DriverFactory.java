package com.staccato.automation.factory;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marco on 2/20/17.
 */
public class DriverFactory {

    public static ChromeDriver getChromeDriver(){
        return getChromeDriver(30);
    }

    public static ChromeDriver getChromeDriver(int timeout) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        return driver;
    }
}
