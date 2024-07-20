package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherPage {
	WebDriver driver;
	public TeacherPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@placeholder='Enter index number']")
	private WebElement teacherIndex;
	
	@FindBy(xpath = "//input[@placeholder='Enter full name']")
	private WebElement teacherName;
	
	@FindBy(xpath = "//input[@placeholder='Enter name with initials']")
	private WebElement teacherIntial;
	
	@FindBy(xpath = "//input[@placeholder='Enter address']")
	private WebElement teacherAddress;
	
	@FindBy(xpath = "//select[@id='gender']")
	private WebElement teacherGender;
	
	@FindBy(xpath = "//input[@placeholder='123-456-7890']")
	private WebElement teacherPhone;
	
	@FindBy(xpath = "//input[@placeholder='Enter valid email address']")
	private WebElement teacherMail;
	
	@FindBy(xpath = "//input[@name='fileToUpload']")
	private WebElement teacherChooseBtn;
	
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElement teacherSubmitBtn;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchField;
	
	@FindBy(xpath = "//table[@id='example1']/tbody/tr/td[2]")
	private WebElement tabledetails;
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
	private WebElement teachereventIcon;
	
	@FindBy(xpath = "//a[@onclick='showNotifyEvent(100)']")
	private WebElement teachereventlist;
	
	@FindBy(xpath = "//td[@id='title1']")
	private WebElement eventheader;
	
	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")
	private WebElement xBtn;
	
	
	public WebElement getxBtn() {
		return xBtn;
	}

	public WebElement getTeachereventIcon() {
		return teachereventIcon;
	}

	public WebElement getTeachereventlist() {
		return teachereventlist;
	}

	public WebElement getEventheader() {
		return eventheader;
	}

	public WebElement getTeacherIndex() {
		return teacherIndex;
	}

	public WebElement getTeacherName() {
		return teacherName;
	}

	public WebElement getTeacherIntial() {
		return teacherIntial;
	}

	public WebElement getTeacherAddress() {
		return teacherAddress;
	}

	public WebElement getTeacherGender() {
		return teacherGender;
	}

	public WebElement getTeacherPhone() {
		return teacherPhone;
	}

	public WebElement getTeacherMail() {
		return teacherMail;
	}

	public WebElement getTeacherChooseBtn() {
		return teacherChooseBtn;
	}

	public WebElement getTeacherSubmitBtn() {
		return teacherSubmitBtn;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getTabledetails() {
		return tabledetails;
	}
	
	
	
	
	

}
