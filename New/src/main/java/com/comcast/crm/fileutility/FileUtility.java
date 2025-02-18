package com.comcast.crm.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getFileUtility(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\rohan\\AdvSelenium\\New\\configData\\common.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

}
