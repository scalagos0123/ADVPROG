package com.computerstore;
import java.util.Scanner; 

public class Driver {
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in); 
		
		Bundle b = new Bundle(); 
		CPU cpu = new CPU(1, "Kat", 10.0, "P"); 
		Monitor mon = new Monitor(2, "Shaun", 10.0, "P"); 
		OS os = new OS(3, "Shaun", 10.0, "P"); 
		
		Keyboard kbd = new Keyboard(4, "Shaun", 10.0, 10.0, "P"); 
		Mouse mou = new Mouse(5, "Shaun", 10.0, 10.0, 1);
		
		
		b.addComputerPart(cpu);
		b.addComputerPart(mon);
		b.addComputerPart(os); 
		b.addComputerPart(kbd); 
		b.addComputerPart(mou); 
		
		
		
		b.displayPartsSpecs();
		
				
		
		
		
	}

}

