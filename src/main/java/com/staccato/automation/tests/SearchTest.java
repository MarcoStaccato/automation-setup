package com.staccato.automation.tests;

import com.staccato.automation.factory.TemplateFactory;
import com.staccato.automation.model.SearchTemplate;
import org.testng.annotations.Test;

public class SearchTest extends TestWrapper{

    private String baseUrl;

    @Test
    public void searchTest() throws Exception{

        driver.get(baseUrl); //load webpage

        SearchTemplate searchTemplate = TemplateFactory.getSearchTemplate(driver); //map page elements to an object
        searchTemplate.setSearch("demo");
        searchTemplate.doSearch();
    }


    protected void setupProps(){
        baseUrl = System.getProperty("site.url");
    }
}
