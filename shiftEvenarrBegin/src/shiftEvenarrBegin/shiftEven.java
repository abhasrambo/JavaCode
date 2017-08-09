package shiftEvenarrBegin;

import java.util.Scanner;

public class shiftEven {
	private static Scanner sc;

	public static void main(String[] args) {

		int a;
		sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements\n");
		a = sc.nextInt();
		int count = a - 1;
		int start = 0;
		int[] arr = new int[a];
		System.out.print("Enter Elements\n");
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arrNew = new int[a];

		for (int i = 0; i < a; i++) {

			if (arr[i] % 2 == 0) {

				arrNew[start] = arr[i];
				start++;
				//
			} else {
				arrNew[count] = arr[i];
				count--;
			}

		}

		for (int i = 0; i < a; i++) {
			System.out.println(arrNew[i]);
		}
	}
}
