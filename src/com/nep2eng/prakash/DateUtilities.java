package com.nep2eng.prakash;

import java.util.Calendar;

public class DateUtilities {

	// returns whether a year is leap or not
	public static boolean isLeapYear(int year) {
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			if (year % 4 == 0) {
				return true;
			} else {
				return false;
			}

		}

	}

	// returns whether the given date range is true or false
	public static String israngeEng(int yy, int mm, int dd) {
		String debug_info = "True";
		if (yy < 1944 || yy > 2033) {
			return debug_info = "Error! we only support between 1944-2033";
		}

		if (mm < 1 || mm > 12) {
			return debug_info = "Error! value should be between 1-12";
		}

		if (dd < 1 || dd > 31) {
			return debug_info = "Error! value 1-31 only";
		}

		return debug_info;
	}

	public static String israngeNep(int yy, int mm, int dd) {
		String debug_info = "True";
		if (yy < 2000 || yy > 2089) {
			return debug_info = "Error! we only support between 1944-2033";
		}

		if (mm < 1 || mm > 12) {
			return debug_info = "Error! value should be between 1-12";
		}

		if (dd < 1 || dd > 32) {
			return debug_info = "Error! value 1-31 only";
		}

		return debug_info;
	}

	public static long daysBetween(Calendar startDate, Calendar endDate) {
		Calendar date = (Calendar) startDate.clone();
		long daysBetween = 0;
		while (date.before(endDate)) {
			date.add(Calendar.DAY_OF_MONTH, 1);
			daysBetween++;
		}
		return daysBetween;
	}
}
