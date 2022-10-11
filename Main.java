package com.greatlearning.iitr.dsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of array");

		for (int i = 0; i < size; i++)
			arr[i] = scanner.nextInt();
		System.out.println("Enter the total no. of targets that needs to be achieved");
		int targetNo = scanner.nextInt();
		while (targetNo != 0) {
			int flag = 0;
			long target;
			System.out.println("Enter the value of target");
			target = scanner.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println(" Target achieved after " + (i + 1) + "transactions");
					flag = 1;
					break;
				}
				if (flag == 0)
					System.out.println("Target is not achieved");
				targetNo--;

			}

		}
		scanner.close();
	}
}