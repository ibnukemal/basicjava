package com.sqa.ternary;


public class Ternary {

	public static void main(String[] args) {
		int nilai = 75;
		String keterangan;
		
		keterangan = nilai >=60? "Lulus": "Remedial";
		
		System.out.println(keterangan);
		//
		//
		String kata = "Pengumuman";
		System.out.println(kata.substring(4,8));
		System.out.println(kata.length());
	}

}
