package com.priIt.com;

public class AsendingOrder {
	public static void main(String[] args) {
		int a[] = { 1, 9, 5, 4 };

		int temp;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					System.out.println(a[i] + "=======" + a[j] + "");
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "      OUTPUT");
		}

	}

}
