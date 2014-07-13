package com.duplicate;
import java.util.*;
public class DuplicateStop {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		String input = "";
		ArrayList<String> inputs = new ArrayList<String>();
		int i = 0;
		
		inputs.add("");
		
		while (input.equals(inputs.get(i))) {
			System.out.print("Enter input: ");
			input = sc.nextLine();
			
			if (input.equals(inputs.get(i))) {
				System.out.println("Duplicate!");
			} else {
				inputs.add(input);
			}
			
			i++;
		}
		
		for (i = 0; i < inputs.size(); i++) {
			System.out.println(inputs.get(i));
		}
		
	}
}