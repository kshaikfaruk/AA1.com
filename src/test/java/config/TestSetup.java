package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSetup {
	
	 public static WebDriver driver;
	 public static  Properties pro;
	 
	 @BeforeSuite
	  public void method(){
		 
	 }

	 @BeforeMethod
	  public void   method1(){
		 openBrowser(getPropertie("browser"));
		 
	 }
	 
	 
	 @AfterMethod
	  public void teardown(){
		 
		  driver.quit();
	 }
	 
	 
	 @AfterSuite
	  public void  quite(){
		  
	 }
	 
	   public static WebDriver getDriver(){
         return driver;
	   }
	 
	   public WebDriver openBrowser( String  browser){

		    switch(browser){
		    case "chrome":
		    	 WebDriverManager.chromedriver().setup();
		       driver= new ChromeDriver();
		    	 break;
		    case "firefox":
		    	 WebDriverManager.firefoxdriver().setup();
		       driver= new FirefoxDriver();
		    	 break;
		    case "edge":
		    	 WebDriverManager.edgedriver().setup();
		       driver= new EdgeDriver();
		    	 break;
		    	 
		    	 default:
		    		  System.out.println(" no browser given");
		    	 
		    	 
		    }
		     return driver;
	   }
	   
	    public static  String getPropertie(String key){
	    	 String value="";
	    	 try{
	    	 File  f= new File("./config.properties");
	    	  FileInputStream fis= new FileInputStream(f);
	    	 pro= new  Properties();
	    	  pro.load(fis);
	    	     value= pro.getProperty(key);
	    	  
	    }catch(Exception e){
	    	 e.printStackTrace();
	    }
	    	  return value;

}
}
