package com.sumevenodd;

import java.util.Scanner;

public class SumOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int evenSum = 0;
		int oddSum = 0;
		int num1;

		System.out.print("Enter number: ");
		int num = sc.nextInt();
		if (num < 0) {
			num1 = -num;
		} else {
			num1 = num;
		}
		while (num1 > 0) {
			int digit = num1 % 10;
			if (digit % 2 == 0) {
				evenSum += digit;
			} else {
				oddSum += digit;
			}
			num1 /= 10;
		}
		System.out.println("Sum of even digits: " + evenSum);
		System.out.println("Sum of odd digits: " + oddSum);
	}
}
