package com.sqa.main;

public class Looping {
	//Counted Loop
	public static void main(String[] args) {
		int n = 8;
		for(int i=1; i<=10; i++) {
			System.out.printf("%d x %d = %d%n", n, i, n*i);
		}
	}
}
