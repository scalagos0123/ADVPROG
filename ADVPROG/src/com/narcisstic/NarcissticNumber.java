package com.narcisstic;
import java.util.*;

public class NarcissticNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int input = 0;
		int length = 0;
		String toString = "";
		
		System.out.println("Enter number: ");
		input = sc.nextInt();
		
		toString = "" + input;
		length = toString.length();
		
		int[] numbers = new int[length];
		
		for (int i = 0; i < length; i++) {
			numbers[i] = toString.charAt(i) - '0';
		}
		
		/*char[] c = toString.toCharArray();
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(new String(c[i]));
			System.out.println(numbers[i]);
		}*/
	}
}
