package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubjectPage {
	WebDriver driver;
	public SubjectPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@placeholder='Enter Subject name']")
	private WebElement subjectName;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitBtn;
	public WebElement getSubjectName() {
		return subjectName;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	

}
