package com.sqa.percabangan;
import java.util.Scanner;

public class Percabangan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//IF..ELSE..
		System.out.print("Sekarang Jam Berapa? ");
		int jam = input.nextInt();
		
		if (jam <= 10) {
			System.out.println("Selamat Pagi");
		} else if (jam <= 15) {
			System.out.println("Selamat Siang");
		} else if (jam <= 18) {
			System.out.println("Selamat Sore");
		} else {
			System.out.println("Selamat Malam");
		}
		
		// SWITCH CASE
		System.out.println("Menu Makanan");
		System.out.println("1. Makanan Betawi");
		System.out.println("2. Makanan Padang");
		System.out.println("3. Makanan Sunda");
		System.out.print("Pilih menu makanan : ");
		int menu = input.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("Soto Betawi");
			break;
		case 2:
			System.out.println("Rendang");
			break;
		case 3:
			System.out.println("Sate Kuningan");
			break;
		default:
			System.out.print("Maaf pilihan tidak tersedia");
		}
		// Kondisi Bersarang
		int x = 30;
		int y = 10;
		
		if(x == 30) {
			if(y == 10) {
				System.out.println("X = 30, Y = 10");
			} else {
				System.out.println("Pilihan kurang tepat");
		}
				
	}
}

}
