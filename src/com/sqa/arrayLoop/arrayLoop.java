package com.sqa.arrayLoop;
import java.util.Arrays;

public class arrayLoop {

	public static void main(String[] args) {
		//int
		int angka[] = {0,4,4,3,1,2};
		//sorting
		for (int j = 0; j < angka.length; j++) {
			for (int i = j; i < angka.length; i++) {
				//cek elemen
				int temp = 0;
				//if (true)
				if(angka[i]<angka[j]) {
					temp = angka[j];
					angka[j] = angka[i];
					angka[i] = temp;
				}
			}
			System.out.print(angka[j]+" ");
		}System.out.println();
		//string
		String mobil[] = {"mitsubishi", "hyundai", "nissan", "jeep", "ford", "audi", "chevrolet", "ferrari", "lamborghini","mercedes"};
		
		for(String i : mobil) {
			System.out.println("Ini adalah penampung mobil : " +i);
		}
		Arrays.sort(mobil);
		System.out.println("Ini adalah hasil sort dari mobil");
		for(String penampung : mobil) {
			System.out.println("Ini hasil sort dari penampung di atas : " +penampung);
		}
		//char
		char kar[] = {'g','x','e','r','q'};
		for (char c : kar) {
			System.out.println("Ini dari penampung karakter: " +c);			
		}
		Arrays.sort(kar);
		for(char d : kar) {
			System.out.println("Ini hasil sortnya : " +d );
		}
		//int
		int r[] = {1,4,3,8,5,9}; 
		Arrays.sort(r);
		for(int s : r) {
			System.out.println("Ini angka diurutkan : " +s);
		}
	}
}