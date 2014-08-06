package com.computerstore;
import java.util.Scanner; 

public class Driver {
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in); 
		
		Bundle b = new Bundle(); 
		CPU cpu = new CPU(); 
		Monitor mon = new Monitor(); 
		OS os = new OS(); 
		
		Keyboard kbd = new Keyboard(); 
		Mouse mou = new Mouse();
		
		
		b.addComputerPart(cpu);
		b.addComputerPart(mon);
		b.addComputerPart(os); 
		b.addComputerPart(kbd); 
		b.addComputerPart(mou); 
		
		for(int i = 0; b.getBundle.size(); i++){ 
			
		}
		
		System.out.println("Total price : PhP"); 
	
		
		b.displayPartsSpecs();
		
		
		
		
		
	}

}

