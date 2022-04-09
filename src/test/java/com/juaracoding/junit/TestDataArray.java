package com.juaracoding.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit.array.DataArray;

public class TestDataArray {

	@Test
	public void testCariMax() {
		DataArray array = new DataArray();
		
		int angka1[] = {10, 11, 12, 13};
		int actual = array.CariMax(angka1);
		
		assertEquals(13, actual);
	}
	
	@Test
	public void testCariMaxNegatif() {
		DataArray array = new DataArray();
		
		int angka1[] = {-10, -11, -12, -13};
		int actual = array.CariMax(angka1);
		
		assertEquals(-10, actual);
	}
	

}
