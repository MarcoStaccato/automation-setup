package com.staccato.automation.factory;


import com.staccato.automation.model.SearchTemplate;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marco on 2/27/17.
 */
public class TemplateFactory {

    private TemplateFactory(){}

    public static SearchTemplate getSearchTemplate(WebDriver driver) throws Exception{
        return new SearchTemplate(driver);
    }
}
