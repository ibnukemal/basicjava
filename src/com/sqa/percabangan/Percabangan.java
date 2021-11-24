package com.sqa.percabangan;
import java.util.Scanner;

public class Percabangan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Jam : ");
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

	}

}
