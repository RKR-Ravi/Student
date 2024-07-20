package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsPage {
	WebDriver driver;
	public EventsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[@data-toggle='modal']")
	private WebElement createEventBtn;
	
	@FindBy(xpath = "//input[@id='title']")
	private WebElement titleInput;
	
	@FindBy(xpath = "(//select[@name='category'])[1]")
	private WebElement category;
	
	@FindBy(xpath = "//input[@id='reservationtime']")
	private WebElement time;
	
	@FindBy(xpath = "(//td[@data-title='r3c0'])[1]")
	private WebElement formDate;
	
	@FindBy(xpath = "(//td[@data-title='r3c0'])[2]")
	private WebElement toDate;
	
	@FindBy(xpath = "//textarea[@id='note']")
	private WebElement note;
	
	@FindBy(xpath = "//input[@id='colorF']")
	private WebElement color;
	
	@FindBy(xpath = "//button[@id='btnSubmit3']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//td[@id='td_21']/div[7]")
	private WebElement eventImage;
	
	@FindBy(xpath = "//td[@id='title1']")
	private WebElement titleHead;
	
	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement applyBtn;
	
	@FindBy(xpath = "//span[text()='Events']")
	private WebElement TeacherEventLink;
	
	@FindBy(xpath = "//a[@href='all_events2.php']")
	private WebElement TeacherAllEvenkLink;
	
	@FindBy(xpath = "//table[@class='cal-table']/tr[5]/td/div[8]/a")
	private WebElement studentEventLink;
	
	@FindBy(xpath = "//td[@id='title1']")
	private WebElement studentTitle;
	
	public WebElement getStudentTitle() {
		return studentTitle;
	}

	public WebElement getStudentEventLink() {
		return studentEventLink;
	}

	public WebElement getTeacherEventLink() {
		return TeacherEventLink;
	}

	public WebElement getTeacherAllEvenkLink() {
		return TeacherAllEvenkLink;
	}

	public WebElement getApplyBtn() {
		return applyBtn;
	}

	public WebElement getTitleHead() {
		return titleHead;
	}

	public WebElement getEventImage() {
		return eventImage;
	}

	public WebElement getCreateEventBtn() {
		return createEventBtn;
	}

	public WebElement getTitleInput() {
		return titleInput;
	}

	public WebElement getCategory() {
		return category;
	}

	public WebElement getTime() {
		return time;
	}

	public WebElement getFormDate() {
		return formDate;
	}

	public WebElement getToDate() {
		return toDate;
	}

	public WebElement getNote() {
		return note;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	

}
