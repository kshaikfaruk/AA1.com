package resuablecomponents;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.TestSetup;
public class Technicalcomponents extends TestSetup {
	
	public static WebDriver driver;
	
	 public   void navigateurl( String url){
		  try{
			   driver=getDriver();
			   driver.get(url);
			    driver.manage().window().maximize();
		  }catch(Exception e){
			   e.printStackTrace();
		  }
	 }
	 
	 public static void click(WebElement element){
		  try{
		 element.click();
		  }catch(Exception e){
			   e.printStackTrace();
		  }
	 }

	 
	 public  static  void  type(WebElement element, String text){
		  try{
		 element.sendKeys(text);
		 }catch(Exception e){
			   e.printStackTrace();
		  }
	 }
	 
	 public  static  String  getext(WebElement element){
		 String text="";
		 try{
	 text=element.getText();
		 
		 }catch(Exception e){
			   e.printStackTrace();
		  }
			 return text;
	 }
}
