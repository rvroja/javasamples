package com.csrk.javasamples.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.csrk.apps.MonthFinder;
import com.csrk.support.exceptions.NotAValidInput;

public class TestMonthFinder {
	public static final Logger LOG = LoggerFactory.getLogger(TestMonthFinder.class);
	
	MonthFinder monthFinder;
	
	@BeforeClass
	public void setup(){
		LOG.debug("in the method trying to create a month finder");
		monthFinder = new MonthFinder();
		LOG.debug("created month finder class");
	}
	
	@AfterClass
	public void tearDown(){
		// nothing to tear down
	}
	
	@Test
	public void testJanuary() {
		LOG.debug("inside the test january method");
		try {
			String month = monthFinder.findMonth("2");
			Assert.assertEquals(month, "January");
		} catch (NotAValidInput e) {
			Assert.fail("Not a valid input exception is thrown ");
		}
		LOG.debug("completed the test january method");

	}
	
	@Test(expectedExceptions = { NotAValidInput.class })
	public void testInvalidStringInput() throws Exception{
		LOG.debug("inside the test invalid method");
			monthFinder.findMonth("1");
		LOG.debug("completed the invalid method");

	}

}
