package com.juaracoding.junit;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit.bangunDatar.BangunDatar;

public class TestBangunDatar {
	
	BangunDatar bangunDatar;

	@Before
	public void setUp() throws Exception {
		bangunDatar = new BangunDatar();
	}


	@Test
	public void test() {
		for (String isi : readFile("persegi.csv")) {
			String data [] = isi.split(",");
			
			String sisi = data[0];
			String expect = data[1];
			
			System.out.println(sisi+" "+expect);
			assertEquals(Double.parseDouble(expect), bangunDatar.luasPersegi(Double.parseDouble(sisi)), 0.0);
		}
	}
	
	public List<String> readFile(String nameFile) {
		List<String> penampung = new ArrayList<String>();
		
		try {
			InputStream myFile = getClass().getClassLoader().getResourceAsStream(nameFile);
			Scanner reader = new Scanner(myFile);
			
			while (reader.hasNextLine()) {
				penampung.add(reader.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return penampung;
	}

}
