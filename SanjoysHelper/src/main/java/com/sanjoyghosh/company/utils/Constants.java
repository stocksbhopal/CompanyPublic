package com.sanjoyghosh.company.utils;

import java.io.File;

public class Constants {

	public static final String FidelityBrokerage = "F";
	public static final String MerrillLynchBrokerage = "L";
	
	public static final String CSVFileExtension = ".csv";
	public static final String FidelityActivityFileNameStart = "Accounts_History";
	public static final String FidelityHoldingsFileName = "Portfolio_Position_([a-zA-Z]{3}-[0-9]{2}-[0-9]{4}).csv";
	
	public static final String MerrillLynchSettledActivityFileName = "SettledActivity_([0-9]{6})_([0-9]{6}).csv";
	public static final String MerrillLynchPendingAndSettledActivityFileName = "PendingAndSettledActivity_([0-9]{6})_([0-9]{6}).csv";
	public static final String MerrillLynchHoldingsFileName = "Holdings_([0-9]{8}).csv";

	
	public static final File DownloadsFolder = new File("/Users/sanjoyghosh/Downloads");
}
