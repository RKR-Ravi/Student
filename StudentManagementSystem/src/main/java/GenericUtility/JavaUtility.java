package GenericUtility;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
		Random random=new Random();
		int randomNumber=random.nextInt(5000);
		return randomNumber;	
	}
	public String getSystemDateYYYYMMDD() {
		Date dateobj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
		String data=sdf.format(dateobj);
		return data;
	}
	public String getRequiredDateYYYYMMDD(int days) {
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal=sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,days);
		String reqDate=sim.format(cal.getTime());
		return reqDate;
	}
}
