package com.sqa.castPromotion;
import java.util.Scanner;

public class castPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Automatic
		int a = 20;
		double b = a;
		char data2 = 'W';
		byte long_data = (byte)data2;
		//Manual
		byte c = 76;
		char l = (char) c;
		byte d = 79;
		char o = (char) d;
		byte dd = 86;
		char v = (char) dd;
		byte f = 69;
		char e = (char) f;
		Scanner input = new Scanner(System.in);
		System.out.print("Coba input casting : ");
		int cobainput = input.nextInt();
		double hasil = cobainput;
		System.out.println("Hasil casting int ke double : " + hasil);
		System.out.println("A : " +a);
		System.out.println("Casting B : " +b);
		System.out.println("Data2 : " +data2);
		System.out.println("Casting Ubah Data : " +long_data);
		System.out.println("C : " +c);
		System.out.println("Cetak LOVE : " +l+o+v+e);
	}

}
