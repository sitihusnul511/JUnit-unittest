package com.juaracoding.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.juaracoding.junit.siswa.Siswa;

public class TestSiswa {
	
	String expect_nama = "Husnul";
	Siswa siswa = new Siswa (expect_nama);

	@Test
	public void test() {
		assertEquals(expect_nama, siswa.tampilkanNama());
	}

}
