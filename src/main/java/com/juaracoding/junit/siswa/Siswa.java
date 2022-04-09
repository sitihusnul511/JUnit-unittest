package com.juaracoding.junit.siswa;

public class Siswa {
	private String nama;
	private String batch;
	
	public Siswa (String nama) {
		this.nama = nama;
	}


	
	public String tampilkanNama() {
		System.out.println(nama);
		return nama;
	}
	
}
