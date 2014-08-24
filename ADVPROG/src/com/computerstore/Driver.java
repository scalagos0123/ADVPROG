package com.computerstore;
import java.util.Scanner; 

public class Driver {
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in); 
		
		Bundle b = new Bundle(); 

		CPU cpu = new CPU(1234,"intel",1499,"core i3"); 
		Monitor mon = new Monitor(3290, "acer", 3400, "1920x1080"); 
		OS os = new OS(2900,"microsoft",10500,"windows 8"); 
		
		Keyboard kbd = new Keyboard(5520,"razer",8000, 15, 
				"gaming"); 
		Mouse mou = new Mouse(9000, "elephant", 9999, 10, 5000);

		b.addComputerPart(cpu);
		b.addComputerPart(mon);
		b.addComputerPart(os); 
		b.addComputerPart(kbd); 
		b.addComputerPart(mou); 
		b.displayPartsSpecs();
		
		System.out.printf("Total price : PhP %.2f", 
		b.getTotalPrice()); 
				
	}

}

