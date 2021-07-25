package com.mailtravel;

import com.mailtravel.basepage.BasePage;
import com.mailtravel.browserselector.BrowserSelector;
import com.mailtravel.loadproperty.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage {
    BrowserSelector browserSelector=new BrowserSelector();

    @Before
    public void init(){
        System.out.println("This is Testing Hooks");
        browserSelector.selectBrowser(new LoadProperty().SelectProperties("browser"));
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}