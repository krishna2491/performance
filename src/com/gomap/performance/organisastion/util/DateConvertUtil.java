package com.gomap.performance.organisastion.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateConvertUtil {
	
	public static Date convert(String date) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
		return format.parse(date);
	}

	public static String convert(Date date) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		return df.format(date);
	}
	
	public static String convertWithTime(Date date) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
		return df.format(date);
	}
	
	public static Date convertStringToDate(String date) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.parse(date);
	}
	
	public static String formatDate(Date date, String format) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat(format);
		return df.format(date);
	}
	
	public static String convertMonthByOrder(int order) {
		String month = null;
		switch (order) {
		case 0:
			month = "Jan";
			break;
		case 1:
			month = "Feb";
			break;
		case 2:
			month = "Mar";
			break;
		case 3:
			month = "Apr";
			break;
		case 4:
			month = "May";
			break;
		case 5:
			month = "Jun";
			break;
		case 6:
			month = "Jul";
			break;
		case 7:
			month = "Aug";
			break;
		case 8:
			month = "Sep";
			break;
		case 9:
			month = "Oct";
			break;
		case 10:
			month = "Nov";
			break;
		case 11:
			month = "Dec";
			break;
		default:
			month = null;
			break;
		}
		return month;
	}

	
}
