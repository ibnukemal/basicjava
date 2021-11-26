package com.sqa.array2loop;
import java.util.Arrays;
import java.util.Collections;

public class array2loop {

	public static void main(String[] args) {
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        String[] mobil = {"mitsubishi", "mercedes benz", "honda", "subaru", "audi", "bmw"};
 
        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(mobil, Collections.reverseOrder());

        System.out.printf("mobil : %s", Arrays.toString(mobil));
        System.out.println();
        System.out.printf("Terbesar Terkecil : %s", Arrays.toString(arr));


	}

}
