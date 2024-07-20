package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingGradePage {
	WebDriver driver;
	public CreatingGradePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@placeholder='Enter name']")
	private WebElement gradeNameInput;
	
	@FindBy(xpath = "//input[@placeholder='Enter admission fee']")
	private WebElement admissionFee;
	
	@FindBy(xpath = "//input[@placeholder='Enter hall charge']")
	private WebElement hallCharge;
	
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElement next;
	
	
	@FindBy(xpath = "//input[@id='mark_range_text_1']")
	private WebElement range;
	
	
	@FindBy(xpath = "//input[@id='mark_grade_text_1']")
	private WebElement grade;
	
	@FindBy(xpath = "(//button[@id='btnSubmit1'])[1]")
	private WebElement submitBtn;
	public WebElement getGradeNameInput() {
		return gradeNameInput;
	}

	public WebElement getAdmissionFee() {
		return admissionFee;
	}

	public WebElement getHallCharge() {
		return hallCharge;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getRange() {
		return range;
	}

	public WebElement getGrade() {
		return grade;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
}
