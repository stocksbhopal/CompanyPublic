package com.sanjoyghosh.company.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateUtils {

    private static final Pattern FidelityHoldingsPattern = Pattern.compile(Constants.FidelityHoldingsFileName);
	private static final SimpleDateFormat FidelityDateFormatter = new SimpleDateFormat("MMM-dd-yyyy");
	
	private static final Pattern MerrillLynchHoldingsPattern = Pattern.compile(Constants.MerrillLynchHoldingsFileName);
	private static final SimpleDateFormat MerrillLynchDateFormatter = new SimpleDateFormat("MMddyyyy");
	
	private static final SimpleDateFormat ssmlDateFormatter = new SimpleDateFormat("MMMMM dd, hh:mm aaa");
	
	
	public static Date getDateFromFidelityHoldingsFileName(String fileName) throws ParseException {
		Matcher matcher = FidelityHoldingsPattern.matcher(fileName);
		if (!matcher.matches()) {
			System.err.println("Fidelity Holdings File has bad name: " + fileName);
			return null;
		}
		String dayString = matcher.group(1);
		Date day = FidelityDateFormatter.parse(dayString);
		return day;
	}

	
	public static Date getDateFromMerrillLynchHoldingsFileName(String fileName) throws ParseException {
		Matcher matcher = MerrillLynchHoldingsPattern.matcher(fileName);
		if (!matcher.matches()) {
			System.err.println("Merrill Lynch Holdings File has bad name: " + fileName);
			return null;
		}
		String dayString = matcher.group(1);
		Date day = MerrillLynchDateFormatter.parse(dayString);
		return day;
	}


	public static String toSsmlString(Timestamp timestamp) {
		String date = ssmlDateFormatter.format(timestamp);
		return date;
	}
}
