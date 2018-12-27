//lab2 треба шоб значення в масиві змінились таким чином щоб вони незбігались між собою
package Change;

import java.util.Random;

public class Change {
	public Change() {
		// construct
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = new int[6];

		b[0] = b[0] + a[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			System.out.print(" a = " + a[i]);
			b[i + 1] = b[i + 1] + a[i];
		}
		System.out.println("");
		for (int i = 0; i < b.length - 1; i++) {
			System.out.print(" b = " + b[i]);
		}
	}
}

/*
 * or import java.util.Random; public static void main(String [] args) { int[]
 * arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9}; int[] arr2 = new int[9]; Random rand =
 * new Random(); int index = 0; for (int i = 0;i < 9;i++) { while(true){ index =
 * rand.nextInt(9); if(index != i && arr2[index] == 0){ arr2[index] = arr[i];
 * break; }
 * 
 * }
 * 
 * } for (int i = 0;i < 9;i++) { System.out.printf("%d ", arr2[i]); } }
 */
