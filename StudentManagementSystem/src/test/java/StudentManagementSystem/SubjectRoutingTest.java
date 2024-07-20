package StudentManagementSystem;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import BaseClassUtility.BaseClass;
import ObjectRepository.CreatingGradePage;
import ObjectRepository.HomePage;
import ObjectRepository.SubjectPage;
import ObjectRepository.SubjectRoutingPage;
import ObjectRepository.TeacherPage;
import WebDriverUtility.UtilityClassObject;
@Listeners(ListenersUtility.ListenerUtility.class)
public class SubjectRoutingTest extends BaseClass{
	
	@Test
	public void SubjectRoutingsTest() throws EncryptedDocumentException, IOException, InterruptedException {
		wu.waitForPageToLoad(driver);
		HomePage hp=new HomePage(driver);
		hp.getGradeLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Grade link is clicked");
		Reporter.log("Step1",true);
		CreatingGradePage cgp=new CreatingGradePage(driver);
		String gradename=eu.getDataFromExcel("Sheet1",5,1)+ju.getRandomNumber();
		String addmissionfee=eu.getDataFromExcel("Sheet1",5,2);
		String hall=eu.getDataFromExcel("Sheet1",5,3);
		String range=eu.getDataFromExcel("Sheet1",5,4);
		String grade=eu.getDataFromExcel("Sheet1",5,5);
		cgp.getGradeNameInput().sendKeys(gradename);
		cgp.getAdmissionFee().sendKeys(addmissionfee);
		cgp.getHallCharge().sendKeys(hall);
		cgp.getNext().click();
		cgp.getRange().sendKeys(range);
		cgp.getGrade().sendKeys(grade);
		cgp.getSubmitBtn().click();
		UtilityClassObject.getTest().log(Status.INFO,"Grade is created");
		Reporter.log("Step2",true);
		Thread.sleep(6000);
		hp.getSubjectLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Navigate into the subject creating page");
		SubjectPage sp=new SubjectPage(driver);
		String subjectname=eu.getDataFromExcel("Sheet1",8,1)+ju.getRandomNumber();
		sp.getSubjectName().sendKeys(subjectname);
		sp.getSubmitBtn().click();
		UtilityClassObject.getTest().log(Status.INFO,"Subject is created");
		Reporter.log("Step3",true);
		Thread.sleep(6000);
		hp.getTeacherLink().click();
		hp.getAddTeacherLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Navigate into the teacher creating page");
		TeacherPage tp=new TeacherPage(driver);
		String Index=eu.getDataFromExcel("Sheet1",10,0)+ju.getRandomNumber();
		String fullname=eu.getDataFromExcel("Sheet1",10,1)+ju.getRandomNumber();
		String initial=eu.getDataFromExcel("Sheet1",10,2)+ju.getRandomNumber();
		String address=eu.getDataFromExcel("Sheet1",10,3);
		String email=ju.getRandomNumber()+eu.getDataFromExcel("Sheet1",10,4);
		String phone=eu.getDataFromExcel("Sheet1",10,5);
		tp.getTeacherIndex().sendKeys(Index);
		tp.getTeacherName().sendKeys(fullname);
		tp.getTeacherIntial().sendKeys(initial);
		tp.getTeacherAddress().sendKeys(address);
		tp.getTeacherGender().click();
		wu.select(tp.getTeacherGender(),"Male");
		tp.getTeacherMail().sendKeys(email);
		tp.getTeacherPhone().sendKeys(phone);
		File file=new File("./testdata/download.jpeg");
		String path=file.getAbsolutePath();
		tp.getTeacherChooseBtn().sendKeys(path);
		Thread.sleep(3000);
		tp.getTeacherSubmitBtn().click();
		UtilityClassObject.getTest().log(Status.INFO,"Teacher profile is created successfully");
		Reporter.log("Step4",true);
		Thread.sleep(6000);
		hp.getSubjectRoutingLink().click();
		UtilityClassObject.getTest().log(Status.INFO,"Navigate into the Subject Routing page");
		SubjectRoutingPage srp=new SubjectRoutingPage(driver);
		srp.getSubjectAddBtn().click();
		Thread.sleep(6000);
		srp.getSelectGrade().click();
		wu.select(srp.getSelectGrade(), gradename);
		Thread.sleep(2000);
		Reporter.log("Step5",true);
		srp.getSelectSubject().click();
		wu.select(srp.getSelectSubject(), subjectname);
		Thread.sleep(2000);
		Reporter.log("Step6",true);
		srp.getSelectTeacher().click();
		wu.select(srp.getSelectTeacher(), initial);
		Reporter.log("Step7",true);
		srp.getSubjectFees().sendKeys("12");
		Reporter.log("Step8",true);
		srp.getSubmitBtn().click();
		UtilityClassObject.getTest().log(Status.INFO,"Subject Routing is created successfully");
		Reporter.log("Step9",true);
	}
}
