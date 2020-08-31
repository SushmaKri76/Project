package com.onlinejava;

import java.util.Scanner;

public class Sheet7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		int len = length(str);
		System.out.print("Length of string : " + len + "\n");
		System.out.println("-------------------------------");
		// 2
		System.out.print("Enter a number to find factorial : ");
		int num = sc.nextInt();
		int factorial = fact(num);
		System.out.println("Factorial of " + num + " : " + factorial);
		System.out.println("-----------------------------------------------");
		// 3
		System.out.print("Enter range for fibonacci series : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(fibo(i));
		}
		System.out.println("----------------------------");
		// 4
		System.out.print("Enter a natural number for table : ");
		int number = sc.nextInt();
		table(number, 1);
	}

	private static int length(String str) {
		if (str.isEmpty())
			return 0;
		return 1 + length(str.replaceFirst(str.charAt(0) + "", ""));
	}

	private static int fact(int num) {
		if (num == 1)
			return 1;
		return num * fact(num - 1);
	}

	private static int fibo(int i) {
		if (i == 0)
			return 0;
		else if (i == 1)
			return 1;
		return fibo(i - 1) + fibo(i - 2);
	}

	private static void table(int number, int i) {
		if (i > 10)
			return;
		System.out.printf("%d * %d = %d", number, i, (number * i));
		System.out.println();
		table(number, ++i);
	}

}
