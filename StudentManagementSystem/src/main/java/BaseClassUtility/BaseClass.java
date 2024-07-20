package BaseClassUtility;
import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import DataBaseUtility.DataBaseUtility;
import GenericUtility.ExcelUtility;
import GenericUtility.FileUtility;
import GenericUtility.JavaUtility;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import WebDriverUtility.UtilityClassObject;
import WebDriverUtility.WebDriverUtility;

public class BaseClass {
	 public ExcelUtility eu= new ExcelUtility();
	 public JavaUtility ju= new JavaUtility();
	 public WebDriverUtility wu=new WebDriverUtility();
	 public DataBaseUtility du=new DataBaseUtility();
	 public FileUtility fu=new FileUtility();
	 public WebDriver driver=null;
	 public static WebDriver sdriver=null;
	@BeforeSuite
	public void configBS() throws SQLException {
		System.out.println("====connect to DB,ReportConfig===");
		du.getConnection();	
	}
//	@Parameters("BROWSER")
//	@BeforeClass
//	public void configBC(String browser) throws Throwable {
	@BeforeClass
	public void configBC() throws Throwable{
		System.out.println("===Launch Browser===");
		//String BROWSER= browser;
		String BROWSER=fu.getDataFromFile("browser");
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		    sdriver=driver;
		    UtilityClassObject.setDriver(driver);
	}
	@BeforeMethod
	public void configBM() throws Throwable {
		System.out.println("===Login===");
		String URL=fu.getDataFromFile("url");
		String USERNAME=fu.getDataFromFile("adminUsername");
		String PASSWORD=fu.getDataFromFile("adminpassword");
		LoginPage lp=new LoginPage(driver);
		lp.LoginToApp(URL, USERNAME, PASSWORD);
	}
	@AfterMethod
	public void configAM() {
		System.out.println("===Logout===");
		HomePage hp=new HomePage(driver);
		hp.getProfile().click();
		hp.getSignOut().click();
	}
	@AfterClass
	public void configAC() throws SQLException {
		System.out.println("===Close the Browser===");
		driver.quit();
	}
	@AfterSuite
	public void configAS() throws SQLException {
		System.out.println("===close DB,Reprot BackUp====");
		du.closeDbconnection();	
	}
}

