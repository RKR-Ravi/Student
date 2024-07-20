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
import ObjectRepository.TeacherPage;
import WebDriverUtility.UtilityClassObject;
@Listeners(ListenersUtility.ListenerUtility.class)
public class EventVerifyByTeacher extends BaseClass{
	
	@Test
	public void EventsVerifyByTeacher() throws EncryptedDocumentException, IOException, InterruptedException{
		wu.waitForPageToLoad(driver);
		HomePage hp=new HomePage(driver);
		hp.getEventsLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Clicked event link in home page");
		Reporter.log("step1",true);
		hp.getMyEventsLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Clicked on the MyEvent link in home page");
		Reporter.log("step2",true);
		EventsPage ep=new EventsPage(driver);
		ep.getCreateEventBtn().click();
		UtilityClassObject.getTest().log(Status.INFO,"clicked on create event in event page by admin");
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
		UtilityClassObject.getTest().log(Status.INFO,"Event is created successfully");
		Reporter.log("step8",true);
		Thread.sleep(6000);
		hp.getProfile().click();
		hp.getSignOut().click();
		UtilityClassObject.getTest().log(Status.INFO,"Admin Sign Out is successfully done");
		Reporter.log("step9",true);
		LoginPage lp=new LoginPage(driver);
		String Teachername=eu.getDataFromExcel("Sheet1",16,1);
		String password="12345";
		lp.LoginToApp(Teachername, password);
		UtilityClassObject.getTest().log(Status.INFO,"Login as teacher successful");
		Reporter.log("step10",true);
		TeacherPage tp=new TeacherPage(driver);
		tp.getTeachereventIcon().click();
		Reporter.log("step11",true);
		tp.getTeachereventlist().click();
		Reporter.log("step12",true);
		String titlename=tp.getEventheader().getText();
		UtilityClassObject.getTest().log(Status.INFO,"Event details popup is shown");
		if(titlename.equals(eu.getDataFromExcel("Sheet1",16,1))) {
			System.out.println("Event is shown in Teacher profile");
		}
		else {
			System.out.println("Event is shown not in Teacher profile");

		}
		Reporter.log("step13",true);
		UtilityClassObject.getTest().log(Status.INFO,"Event is created and validation is successful");
		tp.getxBtn().click();
	}
	}
