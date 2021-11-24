package com.sqa.nested;

public class Nested {

	public static void main(String[] args) {
		String jenisKelamin = "Pria";
		Boolean menikah = false;
		int pajak = 0;
		if (jenisKelamin == "Pria") {
			if (menikah = true) {
				pajak = 5;
			} else {
				pajak = 10;
			}
		} else {
			if (menikah = true) {
				pajak = 9;
			} else {
				pajak = 11;
			}
		}
		System.out.println("Jenis Kelaminnya adalah " + jenisKelamin + " Pajaknya " + pajak + "%");
	}

}
