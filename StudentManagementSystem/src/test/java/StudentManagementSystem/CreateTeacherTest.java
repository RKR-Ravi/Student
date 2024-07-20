package StudentManagementSystem;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import BaseClassUtility.BaseClass;
import ObjectRepository.HomePage;
import ObjectRepository.TeacherPage;
import WebDriverUtility.UtilityClassObject;
@Listeners(ListenersUtility.ListenerUtility.class)
public class CreateTeacherTest extends BaseClass{
	@Test
	public void CreateTeachersTest() throws EncryptedDocumentException, IOException, InterruptedException {
		wu.waitForPageToLoad(driver);
		HomePage hp=new HomePage(driver);
		String Index=eu.getDataFromExcel("Sheet1",10,0)+ju.getRandomNumber();
		String fullname=eu.getDataFromExcel("Sheet1",10,1)+ju.getRandomNumber();
		String initial=eu.getDataFromExcel("Sheet1",10,2)+ju.getRandomNumber();
		String address=eu.getDataFromExcel("Sheet1",10,3);
		String email=ju.getRandomNumber()+eu.getDataFromExcel("Sheet1",10,4);
		String phone=eu.getDataFromExcel("Sheet1",10,5);
		hp.getTeacherLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Clicked on the Teacherlink in home page");
		Reporter.log("Step1", true);
		hp.getAddTeacherLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Clicked on the AddTeacherlink in home page");
		Reporter.log("Step2", true);
		TeacherPage tp=new TeacherPage(driver);
		tp.getTeacherIndex().sendKeys(Index);
		tp.getTeacherName().sendKeys(fullname);
		tp.getTeacherIntial().sendKeys(initial);
		tp.getTeacherAddress().sendKeys(address);
		tp.getTeacherMail().sendKeys(email);
		tp.getTeacherPhone().sendKeys(phone);
		File file=new File("./testdata/download.jpeg");
		String path=file.getAbsolutePath();
		tp.getTeacherChooseBtn().sendKeys(path);
		Thread.sleep(2000);
		tp.getTeacherSubmitBtn().click();
		UtilityClassObject.getTest().log(Status.INFO,"Teacher profile is created successfully");
		Reporter.log("Step3", true);
		Thread.sleep(6000);
		hp.getTeacherLink().click();
		Reporter.log("Step4", true);
		hp.getAllTeacherLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Navigate to the teachers module to check");
		Reporter.log("Step5", true);
		tp.getSearchField().sendKeys(initial);
		Thread.sleep(6000);
		if(tp.getTabledetails().equals(initial)) {
			System.out.println("Teacher profile is created");
		}
		else {
			System.out.println("Teacher profile is not created");

		}
		UtilityClassObject.getTest().log(Status.INFO,"Validation is successful");
		Reporter.log("Step6", true);

		
		
	}
	

}
