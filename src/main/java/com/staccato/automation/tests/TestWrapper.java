package com.staccato.automation.tests;

import com.staccato.automation.factory.DriverFactory;
import com.staccato.automation.util.PropertyLoader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class TestWrapper {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception{
        PropertyLoader.loadProperties();
        driver = DriverFactory.getChromeDriver(10);
        setupProps();
    }

    /**
     * Close driver
     * @throws Exception
     */
    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit(); //closes browser
    }

    protected abstract void setupProps();
}
