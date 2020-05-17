package com.gomap.performance.master.constant;

import java.util.ResourceBundle;

public class MailConstants {
	static ResourceBundle bundle = ResourceBundle
			.getBundle("mail");
	static ResourceBundle bundle1 = ResourceBundle
			.getBundle("db-hibernate");
	public static String REPORTS_PATH = bundle.getString("reports.path");
	public static String APP_REPORT_FILENAME=bundle.getString("reports.path.filename");
	public static String DB_SCHEMANAME=bundle1.getString("hibernate.default_schema");
}
