package com.onlinejava;

import java.util.Scanner;

public class Sheet6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
/*		System.out.print("Enter string : ");
		String string = sc.nextLine();
		count(string);
		System.out.println("--------------------------------------");
		// 2
		removeSpace(string);
		System.out.println("--------------------------------------");
		// 3
		System.out.print("Enter string for palindrome check : ");
		String str = sc.nextLine();
		isPalindrome(str);
		System.out.println("--------------------------------------");
		// 4
		System.out.println("Enter 2 String for rotaion check : ");
		System.out.print("First String: ");
		String str1 = sc.nextLine();
		System.out.print("Second String: ");
		String str2 = sc.nextLine();
		isRotation(str1, str2);
		System.out.println("--------------------------------------");
		// 5
		System.out.println("Enter string for checking duplicate words : ");
		String s = sc.nextLine();
		duplicateWords(s);
		System.out.println("--------------------------------------");
		// 6
		findLargestSmallestWords(s);
		System.out.println("--------------------------------------");*/
		// 7
		System.out.println("Enter two string for swap : ");
		System.out.print("First String: ");
		String s1 = sc.nextLine();
		System.out.print("Second String: ");
		String s2 = sc.nextLine();
		swap(s1, s2);
		System.out.println("--------------------------------------");
		// 8
		isAnagram(s1, s2);
		System.out.println("--------------------------------------");

	}

	private static void count(String string) {
		char ch[] = string.toCharArray();
		int vowel = 0, consonant = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I'
					|| ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U') {
				vowel++;
			} else if (ch[i] == ' ') {
				continue;
			} else {
				consonant++;
			}
		}
		System.out.println("Vowel : " + vowel + "   " + "Consonant : " + consonant);
	}

	private static void removeSpace(String string) {
		String str = string.trim();
		str = str.replace(" ", "");
		System.out.print("String without white space : " + str + "\n");
	}

	private static void isPalindrome(String str) {
		int high = str.length() - 1;
		boolean flag = true;
		for (int low = 0; low < high; low++) {
			if (str.charAt(low) == str.charAt(high)) {
				high--;
			} else {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Palindrome.");
		} else {
			System.out.println("Not Palindrome.");
		}

	}
	
/*	private static void isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		boolean flag = true;
		while(left <= right) {
			if(str.charAt(left) == str.charAt(right)) {
				left++;
				right--;
			}else {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Palindrome.");
		} else {
			System.out.println("Not Palindrome.");
		}
	}*/

	private static void isRotation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("str2 is not rotation of str1");
		} else {
			str1 = str1 + str1;
			if (str1.contains(str2)) {
				System.out.println("str2 is rotation of str1");
			} else {
				System.out.println("str2 is not rotation of str1");
			}
		}

	}
	//Sushma		Ranju
	private static void swap(String s1, String s2) {
		s1 = s1 + s2; // SushmaRanju
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length() );
		System.out.println("After Swap");
		System.out.println("s1 : " + s1 + "   " + "s2 : " + s2);
	}

	private static void isAnagram(String s1, String s2) {
		boolean bool = true;
		int a[] = find(s1);
		int b[] = find(s2);
		for (int i = 0; i < 26; i++) {
			if (a[i] != b[i]) {
				bool = false;
				break;
			}
		}
		if (bool)
			System.out.println("Given String is Anagram");
		else
			System.out.println("Given String is Not Anagram");
	}

	private static int[] find(String s1) {
		int a[] = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch <= 'Z' && ch >= 'A')
				a[ch - 65]++;
			else
				a[ch - 97]++;
		}
		return a;
	}

	private static void duplicateWords(String s) {
		s = s.toLowerCase();
		String str[] = s.split(" ");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			count = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
					str[j] = "0";
				}
			}
			if (count > 1 && str[i] != "0") {
				System.out.println(str[i]);
			}
		}

	}

	private static void findLargestSmallestWords(String s) {
		String str[] = s.split(" ");
		int min = str[0].length(), max = min, k = 0, j = 0;
		for (int i = 0; i < str.length; i++) {
			int len = str[i].length();
			if (min > len) {
				min = len;
				k = i;
			}
			if (max < len) {
				max = len;
				j = i;
			}
		}
		System.out.print("Largest Word : " + str[j] + "\n");
		System.out.print("Smallest Word : " + str[k] + "\n");
	}

}
