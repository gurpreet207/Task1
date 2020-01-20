package com.crm.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Platform;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.crm.qa.util.TestUtil;
import org.testng.annotations.Parameters;

//import com.crm.qa.util.TestUtil;
//import com.crm.qa.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Actions act;
	//public  static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm"
					+ "/qa/config/config_N.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization() throws MalformedURLException{
		/*
		//********************Selenium Grid*************************
		if (prop.getProperty("browser").equals("chrome")){
		
			// Define desired capabilities
			DesiredCapabilities cap = new DesiredCapabilities();
			//cap.setBrowserName("chrome");
			cap.setBrowserName(prop.getProperty("browser"));
			cap.setPlatform(Platform.WINDOWS);
			
			// Chrome options definitions
			ChromeOptions options= new ChromeOptions(); 
			options.merge(cap);
			
			String nodeUrl="http://10.0.75.1:3932/wd/hub/";
			driver= new RemoteWebDriver(new URL(nodeUrl),options);
			
		}
		
		else if(prop.getProperty("browser").equals("firefox")) {
		
			// Define desired capabilities
			
			File pathBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
			
			DesiredCapabilities cap = new DesiredCapabilities();
			//cap.setBrowserName("firefox");
			cap.setBrowserName(prop.getProperty("browser"));
			cap.setPlatform(Platform.WINDOWS);
			FirefoxOptions options = new FirefoxOptions();
			cap.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
			
			String nodeUrl="http://10.0.75.1:3932/wd/hub/";
			driver= new RemoteWebDriver(new URL(nodeUrl),cap);
			
		}
		
      */
		
		
		//*******************Normal Code for local execution**************
						
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Gurpreet\\Gurpreet\\Furlough\\chromedriver_win32-2_Chrome 79\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Gurpreet\\Gurpreet\\Furlough\\geckodriver-v0.26.0-win64_ FF 71\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		
		
		
		act= new Actions(driver);
		//e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		//eventListener = new WebEventListener();
		//e_driver.register(eventListener);
		//driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	

}
