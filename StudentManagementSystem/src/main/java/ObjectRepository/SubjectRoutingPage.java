package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubjectRoutingPage {
	WebDriver driver;
	public SubjectRoutingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[@data-toggle='modal']")
	private WebElement subjectAddBtn;
	
	@FindBy(xpath = "//select[@name='grade_id']")
	private WebElement selectGrade;
	
	@FindBy(xpath = "(//select[@name='subject_id'])[1]")
	private WebElement selectSubject;
	
	@FindBy(xpath = "(//select[@name='teacher_id'])[1]")
	private WebElement selectTeacher;
	
	@FindBy(xpath = "//input[@id='fee']")
	private WebElement SubjectFees;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitBtn;
	public WebElement getSubjectAddBtn() {
		return subjectAddBtn;
	}

	public WebElement getSelectGrade() {
		return selectGrade;
	}

	public WebElement getSelectSubject() {
		return selectSubject;
	}

	public WebElement getSelectTeacher() {
		return selectTeacher;
	}

	public WebElement getSubjectFees() {
		return SubjectFees;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
}
