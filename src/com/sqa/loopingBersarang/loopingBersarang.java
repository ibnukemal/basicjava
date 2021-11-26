package com.sqa.loopingBersarang;

public class loopingBersarang {

	public static void main(String[] args) {
//		for(int a = 1; a <= 5; a++) {
//			for(int b = 4; b >= a; b--) {
//				System.out.print("");
//			}
//			for(int c = 1; c <= a; c++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for (int i = 1; i <= 5; i++){
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
