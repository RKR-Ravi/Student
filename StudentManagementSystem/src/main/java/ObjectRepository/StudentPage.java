package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentPage {
	WebDriver driver;
	public StudentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "(//input[@placeholder='Enter index number'])[1]")
	private WebElement studentIndex;
	
	@FindBy(xpath = "//input[@id='full_name']")
	private WebElement studentName;
	
	@FindBy(xpath = "//input[@id='i_name']")
	private WebElement studentIntialName;
	
	@FindBy(xpath = "//input[@id='address']")
	private WebElement studentAddress;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement studentEmail;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement studentPhone;
	
	@FindBy(xpath = "//input[@id='b_date']")
	private WebElement studentBdate;
	
	@FindBy(xpath = "//select[@id='gender']")
	private WebElement studentGender;
	
	@FindBy(xpath = "//input[@id='fileToUpload']")
	private WebElement studentChooseBtn;
	
	@FindBy(xpath = "//input[@id='g_full_name']")
	private WebElement guadName;
	
	@FindBy(xpath = "//input[@id='g_i_name']")
	private WebElement guadIntialNmae;
	
	@FindBy(xpath = "//input[@id='g_address']")
	private WebElement guadAddress;
	
	@FindBy(xpath = "//input[@id='g_email']")
	private WebElement guadEmail;
	
	@FindBy(xpath = "//input[@id='g_phone']")
	private WebElement  guadPhone;
	
	@FindBy(xpath = "//input[@id='g_b_date']")
	private WebElement guadBdate;
	
	@FindBy(xpath = "//select[@id='g_gender']")
	private WebElement guadGender;
	
	@FindBy(xpath = "//input[@id='g_fileToUpload']")
	private WebElement guadPicture;
	
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElement nextBtn;
	
	@FindBy(xpath = "//select[@id='grade']")
	private WebElement gradedropdown;
	
	@FindBy(xpath = "(//input[@id='checkbox'])[1]")
	private WebElement checkBox;
	
	@FindBy(xpath = "//button[@id='btnSubmit1']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "(//button[@id='btnSubmit1'])[2]")
	private WebElement paidBtn;
	
	@FindBy(xpath = "(//button[@type='button'])[25]")
	private WebElement Xbtn;
	
	@FindBy(xpath = "//td[@id='full_name']")
	private WebElement fullNameText;
	
	@FindBy(xpath = "//span[text()='My Profile']")
	private WebElement myProfile;
	
	@FindBy(xpath = "//td[@id='full_name']")
	private WebElement studentProfileName;
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
	private WebElement studEventIcon;
	
	@FindBy(xpath = "//a[@onclick='showNotifyEvent(98)']")
	private WebElement studenteventList;
	
	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")
	private WebElement xBtn;
	
	public WebElement getxBtn() {
		return xBtn;
	}

	public WebElement getEventHeading() {
		return eventHeading;
	}
	@FindBy(xpath = "//td[@id='title1']")
	private WebElement eventHeading;
	
	
	
	
	public WebElement getStudEventIcon() {
		return studEventIcon;
	}

	public WebElement getStudenteventList() {
		return studenteventList;
	}

	public WebElement getStudentProfileName() {
		return studentProfileName;
	}

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getStudentIndex() {
		return studentIndex;
	}

	public WebElement getStudentName() {
		return studentName;
	}

	public WebElement getStudentIntialName() {
		return studentIntialName;
	}

	public WebElement getStudentAddress() {
		return studentAddress;
	}

	public WebElement getStudentEmail() {
		return studentEmail;
	}

	public WebElement getStudentPhone() {
		return studentPhone;
	}

	public WebElement getStudentBdate() {
		return studentBdate;
	}

	public WebElement getStudentGender() {
		return studentGender;
	}

	public WebElement getStudentChooseBtn() {
		return studentChooseBtn;
	}

	public WebElement getGuadName() {
		return guadName;
	}

	public WebElement getGuadIntialNmae() {
		return guadIntialNmae;
	}

	public WebElement getGuadAddress() {
		return guadAddress;
	}

	public WebElement getGuadEmail() {
		return guadEmail;
	}

	public WebElement getGuadPhone() {
		return guadPhone;
	}

	public WebElement getGuadBdate() {
		return guadBdate;
	}

	public WebElement getGuadGender() {
		return guadGender;
	}

	public WebElement getGuadPicture() {
		return guadPicture;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public WebElement getGradedropdown() {
		return gradedropdown;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getPaidBtn() {
		return paidBtn;
	}

	public WebElement getXbtn() {
		return Xbtn;
	}

	public WebElement getFullNameText() {
		return fullNameText;
	}
	
	

}
