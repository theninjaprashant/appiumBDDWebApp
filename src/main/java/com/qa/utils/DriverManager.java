package com.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverManager {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

    public WebDriver getDriver(){
        return driver.get();
    }

    public void setDriver(WebDriver driver2){
        driver.set(driver2);
    }

    public void initializeDriver() throws Exception {
        WebDriver driver = null;
        GlobalParams params = new GlobalParams();
        PropertyManager props = new PropertyManager();

        if(driver == null){
            try{
                utils.log().info("initializing Appium driver");
                switch(params.getPlatformName()){
                    case "Android":
                        //driver = new RemoteWebDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                        driver = new AndroidDriver<MobileElement>(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());

                        break;
                    case "iOS":
                        driver = new IOSDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                        break;
                }
                if(driver == null){
                    throw new Exception("driver is null. ABORT!!!");
                }
                utils.log().info("Driver is initialized");
                this.driver.set(driver);
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
                throw e;
            }
        }

    }

}