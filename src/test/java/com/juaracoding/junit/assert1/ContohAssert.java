package com.juaracoding.junit.assert1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertNotSame;

import java.util.Arrays;

import org.junit.Test;

public class ContohAssert {

	private static final char[] Null = null;

	@Test
	public void testAssert1() {
		
		//Equals
		String expect = "JuaraCoding";
		String actual = "JuaraCoding";
		
		assertEquals ("Ada error", expect, actual);
	}
	
	@Test
	public void testAssert2() {
		
		//ArrayEquals
		char [] expect = {'J','u','a','r','a'};
		char [] actual = "Juara".toCharArray();
		
		assertArraytEquals(expect, actual);
	}
	
	@Test
	public void testAssert3() {
		
		//ArrayEqualsNull
		char [] expect = Null;
		char [] actual = Null;
		
		assertArraytEquals(expect, actual);
	}
	
	private void assertArraytEquals(char[] expect, char[] actual) {
		
	}

	@Test
	public void testAssert4() {
		
		//Null
		Object motor = Null;
		
		assertNull("Object motor harus Null", motor);
	}
	

}
