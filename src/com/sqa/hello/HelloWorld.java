package com.sqa.hello;

import java.text.DecimalFormat;

public class HelloWorld {

	public static void main(String[] args) {
		String nama = "Ibnu";
		String kota_asal = "Bekasi";
		int usia = 2021-1994;
		boolean var1,var2,var3;
		var1 = 10<9;
		var2 = 10>9;
		var3 = "a" == "A";
		double nilai;
		float nilai2;
		char grade = 'A';
		nilai = 7.58992492;
		nilai2 = 7.58992492450f;
		DecimalFormat df=new DecimalFormat("#.##");
		System.out.println("Hello World");
		System.out.println("Identitas Diri");
		System.out.println("Nama 		:" +nama);
		System.out.println("Kota Asal 	:" +kota_asal);
		System.out.println("Usia		:" +usia);
		System.out.println("Jawaban 1	:" +var1);
		System.out.println("Jawaban 2	:" +var2);
		System.out.println("Jawaban 3	:" +var3);
		System.out.println("Coba Nilai	:" +df.format(nilai*1000000));
		System.out.println(String.format("%.3f", nilai*1000000));
		System.out.println(String.format("%.3f", nilai2*1000000));
		System.out.println(grade);
		
	}

}
