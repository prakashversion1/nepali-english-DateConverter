package com.nep2eng.prakash;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class DateConverter {

	// function to calculate weather a given english year is leap year or not

	public static String engToNep(int yy, int mm, int dd) {
		String debug_msg = DateUtilities.israngeEng(yy, mm, dd);
		if (!debug_msg.equals("True")) {
			return debug_msg;
		} else {
			int startingEngYear = 1944;
			int startingEngMonth = 1;
			int startingEngDay = 1;
			int dayOfWeek = Calendar.SATURDAY; // 1944/1/1 is Saturday
			int startingNepYear = 2000;
			int startingNepMonth = 9;
			int startingNepDay = 17;

			Calendar currentEngDate = new GregorianCalendar();
			currentEngDate.set(yy, mm, dd);

			Calendar baseEngDate = new GregorianCalendar();
			baseEngDate.set(startingEngYear, startingEngMonth, startingEngDay);

			long totalEngDaysCount = DateUtilities.daysBetween(baseEngDate,
					currentEngDate);
			// initialize required Nepali date variables with starting Nepali
			// date

			int nepYear = startingNepYear;
			int nepMonth = startingNepMonth;
			int nepDay = startingNepDay;

			// decrement totalEngDaysCount until its value becomes 0
			while (totalEngDaysCount != 0) {

				// getting the total number of days in month nepMonth in year
				// nepYear
				int daysInIthMonth = Constants.getEndofMonths().get(nepYear)[nepMonth];
				nepDay++; // incrementing nepali day

				if (nepDay > daysInIthMonth) {
					nepMonth++;
					nepDay = 1;
				}
				if (nepMonth > 12) {
					nepYear++;
					nepMonth = 1;
				}
				dayOfWeek++; // count the days in terms of 7 days
				if (dayOfWeek > 7) {
					dayOfWeek = 1;
				}
				totalEngDaysCount--;
			}
			return nepYear + "/" + nepMonth + "/" + nepDay;
		}
	}

	public static String nepToEng(int yy, int mm, int dd) {
		String debug_msg = DateUtilities.israngeNep(yy, mm, dd);
		if (!debug_msg.equals("True")) {
			return debug_msg;
		} else {
			int startingNepYear = 2000;
			int startingNepMonth = 1;
			int startingNepDay = 1;
			int dayOfWeek = Calendar.WEDNESDAY; // 2000/1/1 is Wednesday
			int startingEngYear = 1943;
			int startingEngMonth = 4;
			int startingEngDay = 14;

			long totalNepDaysCount = 0;

			// count total days in-terms of year
			for (int i = startingNepYear; i < yy; i++) {
				for (int j = 1; j <= 12; j++) {
					totalNepDaysCount += Constants.getEndofMonths().get(i)[j];
				}
			}

			// count total days in-terms of month
			for (int j = startingNepMonth; j < mm; j++) {
				totalNepDaysCount += Constants.getEndofMonths().get(yy)[j];
			}

			// count total days in-terms of date
			totalNepDaysCount += dd - startingNepDay;
			// initialize required Nepali date variables with starting Nepali
			// date

			int[] daysInMonth = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31,
					30, 31, 30, 31 };
			int[] daysInMonthOfLeapYear = new int[] { 0, 31, 29, 31, 30, 31,
					30, 31, 31, 30, 31, 30, 31 };

			// calculation of equivalent english date...
			int engYear = startingEngYear;
			int engMonth = startingEngMonth;
			int engDay = startingEngDay;
			int endDayOfMonth = 0;

			while (totalNepDaysCount != 0) {
				if (DateUtilities.isLeapYear(engYear)) {
					endDayOfMonth = daysInMonthOfLeapYear[engMonth];
				} else {
					endDayOfMonth = daysInMonth[engMonth];
				}
				engDay++;
				dayOfWeek++;
				if (engDay > endDayOfMonth) {
					engMonth++;
					engDay = 1;
					if (engMonth > 12) {
						engYear++;
						engMonth = 1;
					}
				}
				if (dayOfWeek > 7) {
					dayOfWeek = 1;
				}
				totalNepDaysCount--;
			}
			return engYear + "/" + engMonth + "/" + engDay;
		}
	}

	/*
	 * This meathod gives back a list of start end english date for a given
	 * nepali month and year
	 */
	public static Map<String, String> getNepMonthRange(int mm, int yyyy) {
		Map<String, String> startEndDate = new HashMap<String, String>();
		// Gives start nepali date for the month
		int startnepDD = 1;
		int startnepMM = mm;
		int startnepYY = yyyy;

		// Gives end of the month constants for the month mm

		int endnepDD = Constants.getEndofMonths().get(yyyy)[mm];
		int endnepMM = mm;
		int endnepYY = yyyy;

		String startEngDate = nepToEng(startnepYY, startnepMM, startnepDD);
		String endEngDate = nepToEng(endnepYY, endnepMM, endnepDD);
		startEndDate.put("StartDate", startEngDate);
		startEndDate.put("EndDate", endEngDate);
		return startEndDate;
	}
}
