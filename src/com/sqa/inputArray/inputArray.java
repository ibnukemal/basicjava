package com.sqa.inputArray;
import java.util.Arrays;
import java.util.Scanner;

public class inputArray {

	public static void main(String[] args) {
//		 Scanner input=new Scanner(System.in);
//		   
//	        System.out.print("Masukan Jumlah Kata : ");
//	        int n=input.nextInt();
//	        
//	        //Deklarasi array
//	        String kata[]=new String[n];
//	      
//	        //Input data ke array
//	        for(int i=0;i<kata.length;i++)
//	        {
//	           System.out.print("Kata ke "+(i+1)+" : ");
//	           kata [i]=input.next();
//	        }
//	        //Menampilkan data dalam array
//	        System.out.println("Kata-kata yang dimasukan");
//	        for(int i=0;i<kata.length;i++)
//	        {
//	          System.out.println(kata[i]);
//	        }
		 // membuat array buah-buahan
		Integer[] nomor = new Integer[5];
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin di Sort : ");
        Arrays.sort(nomor);
        for( int i : nomor){
            System.out.print(i);
        }
	}

}
