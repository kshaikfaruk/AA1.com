package testscript;

import org.testng.annotations.Test;

import resuablecomponents.BussinessComponents;
import resuablecomponents.Technicalcomponents;


public class VerifyMessage  extends BussinessComponents{
	@Test
	public void verifyerrormessage(){
		try{
			new Technicalcomponents().navigateurl( pro.getProperty("url"));
			clickplanTravelButton();
			enterdetails();
		}catch(Exception e){
			e.printStackTrace();
		}
	}



}
