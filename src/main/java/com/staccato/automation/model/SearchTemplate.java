package com.staccato.automation.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Marco on 2/20/17.
 */
public class SearchTemplate {

    WebDriver driver;
    WebElement searchInput;
    WebElement searchButton;

    public SearchTemplate(WebDriver driver) throws Exception{
        this.driver = driver;
        try{
            searchInput = driver.findElement(By.id("lst-ib"));
            searchButton = driver.findElement(By.name("btnK"));
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw e;
        }

    }

    public void setSearch(String query){
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(query);
    }

    public void doSearch(){
        searchButton.click();
    }

}
