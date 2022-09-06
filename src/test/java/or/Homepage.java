package or;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resuablecomponents.Technicalcomponents;
import resuablecomponents.Technicalcomponents;

public class Homepage  extends Technicalcomponents{
	 public Homepage( WebDriver driver){
		  driver= this.driver;
		   PageFactory.initElements(driver, this);
	 }
	 
	 
	 @FindBy(xpath="//a[contains(text(),'Plan Travel ')]")
	  public WebElement planTravelButton;
	 
	 @FindBy(xpath="//a[contains(text(),'Flights')]")
	  public WebElement  flightButton;
	 
	 @FindBy(xpath="//input[@id='segments0.origin']")
	  public WebElement  frominput;
	 
	 @FindBy(xpath="//input[@id='segments0.destination']")
	  public WebElement  destinput;
	 
	 @FindBy(xpath="//button[@id='flightSearchSubmitBtn']")
	  public WebElement  searchbutton;
	
	//div[@class='message-error margin-bottom']/h2
	 
	 @FindBy(xpath="//div[@class='message-error margin-bottom']/h2")
	  public WebElement   errorMessage;
	//input[@id='segments0.origin']
	 public   void clicksearchButton(){
		 Technicalcomponents.click(searchbutton);
	 }
	 
 public void clickPlanTravelButton(){
	 Technicalcomponents.click(planTravelButton);
 }
 
 public void clickflightButton(){
	 Technicalcomponents.click(flightButton);
 }
 
 
 public void  enterFrom(){
	 Technicalcomponents.type(frominput,"ord");
 }
 public void  enterTo(){
	 Technicalcomponents.type(destinput,"MAA");
 }
 
  public void verifyerrorMessage()
  {
	 String text=  Technicalcomponents. getext(errorMessage);
	  if(text.equalsIgnoreCase("Something went wrong")){
		   System.out.println("  message verified");
	  }else{
		  System.out.println(" message not verified");
	  }
  }
  }
