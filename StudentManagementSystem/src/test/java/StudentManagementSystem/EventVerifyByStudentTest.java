package StudentManagementSystem;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import BaseClassUtility.BaseClass;
import ObjectRepository.EventsPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.StudentPage;
import WebDriverUtility.UtilityClassObject;
@Listeners(ListenersUtility.ListenerUtility.class)
public class EventVerifyByStudentTest extends BaseClass{
	
	@Test
	public void EventsVerifyByStudentTest() throws EncryptedDocumentException, IOException, InterruptedException {
		wu.waitForPageToLoad(driver);
		HomePage hp=new HomePage(driver);
		hp.getEventsLink().click();
		Reporter.log("step1",true);
		hp.getMyEventsLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Navigate to Events page");
		Reporter.log("step2",true);
		EventsPage ep=new EventsPage(driver);
		ep.getCreateEventBtn().click();
		UtilityClassObject.getTest().log(Status.INFO,"Create Event btutton is clicked");
		ep.getTitleInput().sendKeys(eu.getDataFromExcel("Sheet1",13,0));
		Reporter.log("step3",true);
		ep.getCategory().click();
		wu.select(ep.getCategory(), "All Teachers & Student");
		Reporter.log("step4",true);
		ep.getTime().click();
		ep.getFormDate().click();
		ep.getToDate().click();
		ep.getApplyBtn().click();
		Reporter.log("step5",true);
		ep.getNote().sendKeys(eu.getDataFromExcel("Sheet1",13,1));
		Reporter.log("step6",true);
		ep.getColor().sendKeys(eu.getDataFromExcel("Sheet1",13,2));
		Reporter.log("step7",true);
		ep.getSubmitBtn().click();
		UtilityClassObject.getTest().log(Status.INFO,"Event is created Successfully");
		Reporter.log("step8",true);
		Thread.sleep(6000);
		hp.getProfile().click();
		hp.getSignOut().click();
		UtilityClassObject.getTest().log(Status.INFO,"Admin sign Out is successfully done");
		Reporter.log("step9",true);
		LoginPage lp=new LoginPage(driver);
		String Teachername=eu.getDataFromExcel("Sheet1",16,0);
		String password="12345";
		lp.LoginToApp(Teachername, password);
		UtilityClassObject.getTest().log(Status.INFO,"Login as Student is successful");
		Reporter.log("step10",true);
		StudentPage sp=new StudentPage(driver);
		sp.getStudEventIcon().click();
		UtilityClassObject.getTest().log(Status.INFO,"clicked on the event Icon in the home page");
		Reporter.log("step11",true);
		sp.getStudenteventList().click();
		UtilityClassObject.getTest().log(Status.INFO,"Selected the created event");
		Reporter.log("step12",true);
		Reporter.log("step13",true);
		String titlename=sp.getEventHeading().getText();
		if(titlename.equals(eu.getDataFromExcel("Sheet1",16,0))) {
			System.out.println("Event is shown in Student profile");
		}
		else {
			System.out.println("Event is shown not in Student profile");

		}
		Reporter.log("step14",true);
		UtilityClassObject.getTest().log(Status.INFO,"Event is created and validation is successfully done");
		sp.getxBtn().click();
	}

}
