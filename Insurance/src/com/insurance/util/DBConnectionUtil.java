package com.insurance.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DBConnectionUtil {

	public static Properties getProperties() {
		Properties properties = new Properties();
		InputStream inputStream = DBConnectionUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");

		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;

	}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}