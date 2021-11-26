package com.sqa.inputLoop;
import java.util.Scanner;
public class inputLoop {

	public static void main(String[] args) {
		int input, spasi;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan index yang akan di print : ");
        input = scanner.nextInt();
        System.out.println("Masukan Spasi yang di inginkan");
        spasi = scanner.nextInt();

         for (int i = 1; i <= input ; i++){
             for (int j = 1; j <= i; j++){
                 System.out.print(j);
             }
             System.out.println();
         }

	}

}
