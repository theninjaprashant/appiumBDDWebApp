package com.qa.runners;

import io.appium.java_client.AppiumDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.apache.logging.log4j.ThreadContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.ServerManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\ProgramsJava\\AppiumBDDWebApp\\resources\\",
		glue = {"com.qa.stepdef"},
		//com.qa.stepdef
		plugin = {"pretty","html:target/cucumber", "summary","de.monochromata.cucumber.report.PrettyReports:target/cucumber-html-reports"}, 
		strict = true, 
		dryRun = false,
		monochrome = true,
		tags = { "@test"})

public class MyRunnerTest {
    @BeforeClass
    public static void initialize() throws Exception {
        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();

        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                + params.getDeviceName());

        new ServerManager().startServer();
        
        
        
    }

    @AfterClass
    public static void quit(){
        
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }
    }
}