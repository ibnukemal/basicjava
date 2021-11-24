package com.sqa.uncounted;
import java.util.Scanner;

public class uncountedLoop {

	public static void main(String[] args) {
		boolean running = true;
		int count = 0;
		String jawab;
		Scanner scan = new Scanner(System.in);
		
		while(running) {
			System.out.println("Apakah anda ingin keluar dari aplikasi? ");
			System.out.println("Jawab [Ya/Tidak]> ");
			
			jawab = scan.nextLine();
			
			if (jawab.equalsIgnoreCase("Ya")) {
				running = false;
			}
			count++;
			System.out.println("Anda sudah melakukan perulangan sebanyak " + count + " kali");
		}
		
	}

}
