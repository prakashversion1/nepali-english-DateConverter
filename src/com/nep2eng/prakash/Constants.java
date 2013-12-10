package com.nep2eng.prakash;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	// The 0s at index 0 are dummy values so as to make the int array of
	// days in months seems more intuitive that index 1 refers to first
	// month "Baisakh", index 2 refers to second month "Jesth" and so on.
	public static Map<Integer, int[]> getEndofMonths() {

		Map<Integer, int[]> nepaliMap = new HashMap<Integer, int[]>();
		nepaliMap.put(2000, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2001, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2002, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2003, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2004, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2005, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2006, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2007, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2008, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 29, 31 });
		nepaliMap.put(2009, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2010, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2011, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2012, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 30, 30 });
		nepaliMap.put(2013, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2014, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2015, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2016, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 30, 30 });
		nepaliMap.put(2017, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2018, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2019, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2020, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2021, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2022, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 30 });
		nepaliMap.put(2023, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2024, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2025, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2026, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2027, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2028, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2029, new int[] { 0, 31, 31, 32, 31, 32, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2030, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2031, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2032, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2033, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2034, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2035, new int[] { 0, 30, 32, 31, 32, 31, 31, 29, 30, 30,
				29, 29, 31 });
		nepaliMap.put(2036, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2037, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2038, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2039, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 30, 30 });
		nepaliMap.put(2040, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2041, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2042, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2043, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 30, 30 });
		nepaliMap.put(2044, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2045, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2046, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2047, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2048, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2049, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 30 });
		nepaliMap.put(2050, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2051, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2052, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2053, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 30 });
		nepaliMap.put(2054, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2055, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2056, new int[] { 0, 31, 31, 32, 31, 32, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2057, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2058, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2059, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2060, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2061, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2062, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2063, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2064, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2065, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2066, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 29, 31 });
		nepaliMap.put(2067, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2068, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2069, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2070, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 30, 30 });
		nepaliMap.put(2071, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2072, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2073, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2074, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2075, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2076, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 30 });
		nepaliMap.put(2077, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2078, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2079, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2080, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 30 });
		nepaliMap.put(2081, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2082, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2083, new int[] { 0, 31, 31, 32, 31, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2084, new int[] { 0, 31, 31, 32, 31, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2085, new int[] { 0, 31, 32, 31, 32, 30, 31, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2086, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2087, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2088, new int[] { 0, 30, 31, 32, 32, 30, 31, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2089, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2090, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 30, 30 });
		return nepaliMap;
	}

	public static Map<Integer, String> getNepaliMonths() {
		Map<Integer, String> nepaliMonths = new HashMap<Integer, String>();
		nepaliMonths.put(1, "Baishak");
		nepaliMonths.put(2, "Jestha");
		nepaliMonths.put(3, "Ashad");
		nepaliMonths.put(4, "Shrawn");
		nepaliMonths.put(5, "Bhadra");
		nepaliMonths.put(6, "Ashwin");
		nepaliMonths.put(7, "Kartik");
		nepaliMonths.put(8, "Mangshir");
		nepaliMonths.put(9, "Poush");
		nepaliMonths.put(10, "Magh");
		nepaliMonths.put(11, "Falgun");
		nepaliMonths.put(11, "Chaitra");
		return nepaliMonths;
	}
}
