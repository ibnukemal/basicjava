package com.sqa.method;
import java.util.Scanner;
public class belajarMethod {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       belajarMethod main = new belajarMethod();
       main.rekursi();
       main.hitungV1(5, 4);
       main.hitungV2(2, 4);
       
       
       System.out.println(main.cekSapaan("pria").toUpperCase()+ " Ibnu, selamat pagi");
       String nama = "Ibnu";
       
       String penampung =  main.printNamaSaya("Ibnu") +" sekali";
       System.out.println(penampung);  
    
       
     //Function Rekursi
	}
	public void rekursi () {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai yang ingin dihitung : ");
		int nilai = scan.nextInt();
		System.out.println("Nilainya adalah " +totalSemua(nilai));
	}
	private int totalSemua(int nilai){
		System.out.println(nilai + " ");
		if (nilai > 0) {
			if (nilai %2==1) {
			return nilai + totalSemua(nilai-1);
			} else {
				return totalSemua(nilai-1);
			}
		} else {
			System.out.println("");
			return nilai;
		}
	}
	
	//Function Hitung Nilai
	public void hitungV1 (int a,int b) {
		 int c = a + b ;
		 System.out.println(c);
	}
	
	public int hitungV2 (int a, int b) {
		System.out.println(a + b);
	    return  a + b ;
	}
	
	
	//Function nama dan sapaan
	public String printNamaSaya(String nama) {
		nama = nama + " keren";
	     System.out.println(nama);
		return nama;
	}
	
	
	public void printNama(int ulang, String word) {
		for (int i = 0; i < ulang; i++) {
			
			System.out.println(word);
			
		}
	}
	
	public String cekSapaan (String gender) {
		
		if(gender.equalsIgnoreCase("pria")) {
			return "Tuan";
			
		}else {
			return "Nyonya";
		}
		
	}
	
}