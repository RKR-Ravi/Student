package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
		WebDriver driver;
		public HomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath = "//a[@href='admin_profile.php']")
		private WebElement myProfilelink;
		
		@FindBy(xpath = "//span[text()='Classroom']")
		private WebElement classroomLink;
		
		@FindBy(xpath = "//span[text()='Grade']")
		private WebElement gradeLink;
		
		@FindBy(xpath = "//span[text()='Subject']")
		private WebElement subjectLink;
		
		@FindBy(xpath = "//span[text()='Teacher']")
		private WebElement teacherLink;
		
		@FindBy(xpath = "//a[@href='teacher.php']")
		private WebElement addTeacherLink;
		
		@FindBy(xpath = "//a[@href='all_teacher.php']")
		private WebElement allTeacherLink;
		
		@FindBy(xpath = "//span[text()='Subject Routing']")
		private WebElement subjectRoutingLink;
		
		@FindBy(xpath = "//a[@href='timetable.php']")
		private WebElement timeTableLink;
		
		@FindBy(xpath = "//span[text()='Student']")
		private WebElement studentLink;
		
		@FindBy(xpath = "//a[@href='student.php']")
		private WebElement addStudentLink;
		
		@FindBy(xpath = "//a[@href='all_student.php']")
		private WebElement allStudentLink;
		
		@FindBy(xpath = "//a[@href='student_leave.php']")
		private WebElement leaveStudentLink;
		
		@FindBy(xpath = "//span[text()='Student Payment']")
		private WebElement studentPaymentLink;
		
		@FindBy(xpath = "//span[text()='Attendance']")
		private WebElement attendanceLink;
		
		@FindBy(xpath = "//span[text()='Event']")
		private WebElement eventsLink;
		
		@FindBy(xpath = "//a[@href='my_events.php']")
		private WebElement myEventsLink;
		
		@FindBy(xpath = "//a[@href='all_events.php']")
		private WebElement allEventsLink;
		
		@FindBy(xpath = "//a[@class='dropdown-toggle']")
		private WebElement notificationIcon;
		
		@FindBy(xpath = "//ul[@class='dropdown-menu']")
		private WebElement dropdown;
		
		@FindBy(xpath = "(//a[@class='dropdown-toggle'])[4]")
		private WebElement profile;
		
		@FindBy(xpath = "//a[text()='Sign out']")
		private WebElement signOut;
		
		public WebElement getProfile() {
			return profile;
		}

		public WebElement getSignOut() {
			return signOut;
		}

		public WebElement getMyProfilelink() {
			return myProfilelink;
		}

		public WebElement getClassroomLink() {
			return classroomLink;
		}

		public WebElement getGradeLink() {
			return gradeLink;
		}

		public WebElement getSubjectLink() {
			return subjectLink;
		}

		public WebElement getTeacherLink() {
			return teacherLink;
		}

		public WebElement getAddTeacherLink() {
			return addTeacherLink;
		}

		public WebElement getAllTeacherLink() {
			return allTeacherLink;
		}

		public WebElement getSubjectRoutingLink() {
			return subjectRoutingLink;
		}

		public WebElement getTimeTableLink() {
			return timeTableLink;
		}

		public WebElement getStudentLink() {
			return studentLink;
		}

		public WebElement getAddStudentLink() {
			return addStudentLink;
		}

		public WebElement getAllStudentLink() {
			return allStudentLink;
		}

		public WebElement getLeaveStudentLink() {
			return leaveStudentLink;
		}

		public WebElement getStudentPaymentLink() {
			return studentPaymentLink;
		}

		public WebElement getAttendanceLink() {
			return attendanceLink;
		}

		public WebElement getEventsLink() {
			return eventsLink;
		}

		public WebElement getMyEventsLink() {
			return myEventsLink;
		}

		public WebElement getAllEventsLink() {
			return allEventsLink;
		}

		public WebElement getNotificationIcon() {
			return notificationIcon;
		}

		public WebElement getDropdown() {
			return dropdown;
		}
		
		

	}
