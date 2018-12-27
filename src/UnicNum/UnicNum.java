package UnicNum;

import java.util.Random;

public class UnicNum {
	public static void main(String args[]) {
		// #1

		int sum = 1;

		int[] arr = { 1, 5, 9, 3, 5, 7, 7, 9, 2 };

		for (int i = 1; i < arr.length; i++) {
			boolean is = false;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					is = true;
					break;
				}
			}
			if (is == false) {
				sum += 1;
			}
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
