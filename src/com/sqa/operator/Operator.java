package com.sqa.operator;
import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		//Donor darah
		int usia, beratBadan;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Usia Anda 	: ");
		usia = input.nextInt();
		System.out.print("Masukkan Berat Badan Anda : ");
		beratBadan = input.nextInt();
		
		if(usia >= 18) {
			if(beratBadan >= 50) {
				System.out.println("Selamat!!! Anda bisa donor darah");
				System.out.println("Karena usia anda " +usia+ " tahun dan berat badan anda  " +beratBadan+ " Kg");
			} else {
				System.out.println("Maaf!!! Anda tidak bisa donor darah");
				System.out.println("Karena usia anda " +usia+ " tahun dan berat badan anda  " +beratBadan+ " Kg");
			}
		} else if(usia >= 18 && beratBadan < 50) {
			System.out.println("Maaf!!! Anda bisa donor darah");
			System.out.println("Karena usia anda " +usia+ " tahun dan berat badan anda  " +beratBadan+ " Kg"); 
		} else {
			System.out.println("Maaf!!! Anda bisa donor darah");
			System.out.println("Karena usia anda " +usia+ " tahun dan berat badan anda  " +beratBadan+ " Kg"); 
		}
		
		//
		int x = 25;
		x += 4;
		System.out.println(x + 3);
		
		
	}

}
