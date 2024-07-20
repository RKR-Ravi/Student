package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTablePage {
	WebDriver driver;
	public TimeTablePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//select[@name='grade']")
	private WebElement timetableGrade;
	
	@FindBy(xpath = "//button[@onclick='showTimeTable(this)']")
	private WebElement timetableSubmitBtn;

	
	@FindBy(xpath = "//a[@onclick='showModal(this)']")
	private WebElement timeTableAdd;

	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement timetableDay;

	
	@FindBy(xpath = "//select[@id='subject']")
	private WebElement timetableSubject;

	
	@FindBy(xpath = "//select[@id='teacher']")
	private WebElement timetableTeacher;

	
	@FindBy(xpath = "//select[@id='classroom']")
	private WebElement timetableClassroom;

	
	@FindBy(xpath = "//input[@id='start_time']")
	private WebElement timetableStarttime;

	
	@FindBy(xpath = "//input[@id='end_time']")
	private WebElement timetableEndtime;
	
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElement submitBtn;
	public WebElement getTimetableGrade() {
		return timetableGrade;
	}

	public WebElement getTimetableSubmitBtn() {
		return timetableSubmitBtn;
	}

	public WebElement getTimeTableAdd() {
		return timeTableAdd;
	}

	public WebElement getTimetableDay() {
		return timetableDay;
	}

	public WebElement getTimetableSubject() {
		return timetableSubject;
	}

	public WebElement getTimetableTeacher() {
		return timetableTeacher;
	}

	public WebElement getTimetableClassroom() {
		return timetableClassroom;
	}

	public WebElement getTimetableStarttime() {
		return timetableStarttime;
	}

	public WebElement getTimetableEndtime() {
		return timetableEndtime;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	

}
