package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties ps;

	public ConfigurationReader() throws IOException {
		File f = new File("src//test//java//com//adactin//properties//Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);
	}

	public String getBrowserName() {
		String browserName = ps.getProperty("BrowserName");
		return browserName;
	}

	public String getUrl() {
		String url = ps.getProperty("Url");
		return url;
	}
}
