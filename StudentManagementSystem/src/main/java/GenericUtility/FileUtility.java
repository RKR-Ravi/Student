package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getDataFromFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Ravi\\credentilas.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String data=pobj.getProperty(key);
		return data;
		
	}

}
