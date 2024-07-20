package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		WebDriver driver;
		public LoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "//input[@placeholder='Enter email address']")
		private WebElement emailInput;
		
		@FindBy(xpath = "//input[@placeholder='Enter password']")
		private WebElement passwordInput;
		
		@FindBy(xpath = "//button[@id='btnSubmit']")
		private WebElement submitBtn;
		public WebElement getEmailInput() {
			return emailInput;
		}

		public WebElement getPasswordInput() {
			return passwordInput;
		}

		public WebElement getSubmitBtn() {
			return submitBtn;
		}
		public void LoginToApp(String url,String username,String password) {
			driver.get(url);
			driver.manage().window().maximize();
			emailInput.click();
			emailInput.sendKeys(username);
			passwordInput.click();
			passwordInput.sendKeys(password);
			submitBtn.click();
		}
		public void LoginToApp(String username,String password) {
			driver.manage().window().maximize();
			emailInput.sendKeys(username);
			passwordInput.sendKeys(password);
			submitBtn.click();
		}

}
