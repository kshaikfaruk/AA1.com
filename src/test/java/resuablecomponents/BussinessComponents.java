package resuablecomponents;

import java.util.concurrent.TimeUnit;

import or.Homepage;

public class BussinessComponents extends Technicalcomponents {

 public void  clickplanTravelButton(){
	 Homepage hm= new  Homepage(driver);
	 hm.clickPlanTravelButton();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 hm.clickflightButton();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 }

 public void  enterdetails(){
	 Homepage hm= new  Homepage(driver);	 
	 hm.enterFrom();
	 hm.enterTo();
	 hm. clicksearchButton();
	 hm.verifyerrorMessage();

 }
}
