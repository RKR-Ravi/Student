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
import ObjectRepository.LoginPage;
import ObjectRepository.StudentPage;
import WebDriverUtility.UtilityClassObject;

@Listeners(ListenersUtility.ListenerUtility.class)
public class CreateStudentTest extends BaseClass{
	@Test
	public void createStudentTest() throws EncryptedDocumentException, IOException, InterruptedException {
		wu.waitForPageToLoad(driver);
		HomePage hp=new HomePage(driver);
		hp.getStudentLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Student link is clicked in home page");
		Reporter.log("Step1", true);
		hp.getAddStudentLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Add Student link is clicked in home page");
		Reporter.log("Step2", true);
		StudentPage sp=new StudentPage(driver);
		String index=eu.getDataFromExcel("Sheet1",1, 0)+ju.getRandomNumber();
		String fullname=eu.getDataFromExcel("Sheet1",1, 1)+ju.getRandomNumber();
		String Intial=eu.getDataFromExcel("Sheet1",1, 2)+ju.getRandomNumber();
		String address=eu.getDataFromExcel("Sheet1",1,3);
		String email=ju.getRandomNumber()+eu.getDataFromExcel("Sheet1",1,4);
		String phone=eu.getDataFromExcel("Sheet1",1,5);
		String Bdate=eu.getDataFromExcel("Sheet1",1,6);
		sp.getStudentIndex().sendKeys(index);
		sp.getStudentName().sendKeys(fullname);
		sp.getStudentIntialName().sendKeys(Intial);
		sp.getStudentAddress().sendKeys(address);
		sp.getStudentEmail().sendKeys(email);
		sp.getStudentPhone().sendKeys(phone);
		sp.getStudentBdate().sendKeys(Bdate);
		Thread.sleep(3000);
		sp.getStudentGender().click();
		wu.select(sp.getStudentGender(),"Male");
		Thread.sleep(3000);
		File file=new File("./testdata/download.jpeg");
		String path=file.getAbsolutePath();
		sp.getStudentChooseBtn().sendKeys(path);
		sp.getGuadName().sendKeys(eu.getDataFromExcel("Sheet1",2,1));
		sp.getGuadIntialNmae().sendKeys(eu.getDataFromExcel("Sheet1",2,2));
		sp.getGuadAddress().sendKeys(eu.getDataFromExcel("Sheet1",2,3));
		sp.getGuadEmail().sendKeys(eu.getDataFromExcel("Sheet1",2,4));
		sp.getGuadPhone().sendKeys(eu.getDataFromExcel("Sheet1",2,5));
		sp.getGuadBdate().sendKeys(eu.getDataFromExcel("Sheet1",2,6));
		sp.getGuadGender().click();
		wu.select(sp.getGuadGender(),"Male");
		sp.getGuadPicture().sendKeys(path);
		UtilityClassObject.getTest().log(Status.INFO,"All details of student and student guardian is entered");
		sp.getNextBtn().click();
		Reporter.log("Step3", true);
		Thread.sleep(6000);
		sp.getGradedropdown().click();
		wu.select(sp.getGradedropdown(), "Grade D");
		UtilityClassObject.getTest().log(Status.INFO,"Grade is selected");
		Reporter.log("Step4", true);
		Thread.sleep(6000);
		sp.getCheckBox().click();
		sp.getSubmitBtn().click();
		UtilityClassObject.getTest().log(Status.INFO,"Subject is allocated to student");
		Reporter.log("Step5", true);
		sp.getXbtn().click();
		UtilityClassObject.getTest().log(Status.INFO,"Invoice is closed");
		Thread.sleep(6000);
		Reporter.log("Step6", true);
		hp.getProfile().click();
		hp.getSignOut().click();
		UtilityClassObject.getTest().log(Status.INFO,"Admin is Sign Out");
		Thread.sleep(6000);
		Reporter.log("Step7", true);
		String password="12345";
		LoginPage lp=new LoginPage(driver);
		lp.LoginToApp(email,password);
		UtilityClassObject.getTest().log(Status.INFO,"Login as Student");
		Reporter.log("Step8", true);
		Thread.sleep(2000);
		sp.getMyProfile().click();
		String name=sp.getStudentProfileName().getText();
		if(Intial.equals(name)) {
			System.out.println("Student is created");
		}
		else {
			System.out.println("Student is not created");
		}
		Reporter.log("Step9", true);
		UtilityClassObject.getTest().log(Status.INFO,"Student profile is created successsfully");
	}

}
