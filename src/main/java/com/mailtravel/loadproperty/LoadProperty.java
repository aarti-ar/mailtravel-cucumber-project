package com.mailtravel.loadproperty;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperty {
    public static  Properties properties;
    FileInputStream fileInputStream;
    String projectPath = System.getProperty("user.dir");


    public String SelectProperties(String key){
        try{
            fileInputStream=new FileInputStream(projectPath+"\\src\\test\\java\\resources\\properties\\config.properties");
            properties=new Properties();
            properties.load(fileInputStream);
        }catch (Exception e){
            System.out.println(e);
        }
        return properties.getProperty(key);
    }

}
