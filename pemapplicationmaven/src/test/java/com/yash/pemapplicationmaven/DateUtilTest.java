package com.yash.pemapplicationmaven;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.yash.pemapplication.util.DateUtil;

import junit.framework.TestCase;

public class DateUtilTest extends TestCase {
	
	@Test
	public void test_empty_string() {
		DateUtil date = new DateUtil();
		Date result = date.stringToDate("");
		assertEquals(null,result);
	}
	
	@Test
	public void test_for_any_date_format() {
		DateUtil date = new DateUtil();
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		Date result = date.stringToDate("02/18/1994");
		Date expected= null;
		try {
			expected = df.parse("02/18/1994");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		assertEquals(expected,result);
	}
	
	@Test
	public void test_for_date_to_string() {
		DateUtil date = new DateUtil();
		String result = date.dateToString(new Date());
		assertEquals("20/04/2018", result);
		
	}

}
