package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Get_properties {
	@Test
	public String get(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./propertyfile/data.properties");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	@Test
	public String get_output_property(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./propertyfile/output.properties");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
}
