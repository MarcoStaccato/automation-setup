package com.staccato.automation;

import com.staccato.automation.tests.SearchTest;
import com.staccato.automation.util.PropertyLoader;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import java.util.Collections;
import java.util.LinkedList;

public class App 
{
    public static void main( String[] args ){
        PropertyLoader.loadProperties();
        TestListenerAdapter listener = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { SearchTest.class });
        testng.addListener(listener);
        testng.run();
        Collections.synchronizedList(new LinkedList<Object>());
    }
}
