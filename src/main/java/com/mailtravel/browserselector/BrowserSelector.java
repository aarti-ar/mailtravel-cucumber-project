package com.mailtravel.browserselector;

import com.mailtravel.basepage.BasePage;
import com.mailtravel.loadproperty.LoadProperty;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    String baseUrl=new LoadProperty().SelectProperties("baseUrl");
    String projectPath = System.getProperty("user.dir");//Anyone can run this programme in their mashin if we can use "ProjectPath"here

    public void selectBrowser(String browser){

        System.out.println("The Browser is  :"+ browser);
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver.exe");
            driver=new FirefoxDriver();
            driver.get(baseUrl);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

        }else {
            System.out.println("Please Select Valid Browser");
        }
    }
}
