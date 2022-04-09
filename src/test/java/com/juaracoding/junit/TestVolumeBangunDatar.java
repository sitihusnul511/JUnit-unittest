package com.juaracoding.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit.calculator.VolumeBangunRuang;

public class TestVolumeBangunDatar {
	
	VolumeBangunRuang volume;
	int s;
	double r, p, l, t;

	@Before
	public void setUp() throws Exception {
		volume = new VolumeBangunRuang();
	}

	@Test
	public void testKubus() {
		int actual = volume.kubus(s);
		int expected = 9;
		
	}

	@Test
	public void testBalok() {
		
	}

	@Test
	public void testTabung() {
		
	}

}
