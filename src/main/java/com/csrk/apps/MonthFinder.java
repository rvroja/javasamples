package com.csrk.apps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.csrk.support.exceptions.NotAValidInput;

public class MonthFinder {
	
	public static final Logger LOG = LoggerFactory.getLogger(MonthFinder.class);
	
	public String findMonth(String monthNum) throws NotAValidInput{
		 
		String month="";
		
		try{
			
			int monthNumber = Integer.parseInt(monthNum);
			if(monthNumber>=1 && monthNumber<=12){
				switch (monthNumber) {
				case 1:
					month = "January";
					break;
				case 2:
					month = "February";
					break;					
				case 3:
					month = "March";
					break;
				case 4:
					month = "April";
					break;
				case 5:
					month = "May";
					break;
				case 6:
					month = "June";
					break;
				case 7:
					month = "July";
					break;
				case 8:
					month = "August";
					break;
				case 9:
					month = "September";
					break;
				case 10:
					month = "October";
					break;
				case 11:
					month = "November";
					break;
				case 12:
					month = "December";
					break;					
				}
			}else{
				throw new NotAValidInput();
			}
		}catch(NumberFormatException exp){
			LOG.debug("The input string is not a number");
			throw new NotAValidInput();
		}	
		return month;
	}
}