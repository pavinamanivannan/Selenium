package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Set_properties {
	@Test
	public Object set(String key, String value) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("./propertyfile/output.properties",true);
		Properties p = new Properties();
		Object pass = p.setProperty(key, value);
		p.store(fos,"data is stored");
		return pass;
	}
}
