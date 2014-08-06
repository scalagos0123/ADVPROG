package com.computerstore;
import java.util.Scanner; 

public class Driver {
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in); 
		
		Bundle b = new Bundle(); 
<<<<<<< HEAD
		CPU cpu = new CPU(1, "Kat", 10.0, "P"); 
		Monitor mon = new Monitor(2, "Shaun", 10.0, "P"); 
		OS os = new OS(3, "Shaun", 10.0, "P"); 
		
		Keyboard kbd = new Keyboard(4, "Shaun", 10.0, 10.0, "P"); 
		Mouse mou = new Mouse(5, "Shaun", 10.0, 10.0, 1);
=======
		CPU cpu = new CPU(1234,"intel",1499,"core i3"); 
		Monitor mon = new Monitor(3290, "acer", 3400, "1920x1080"); 
		OS os = new OS(2900,"microsoft",10500,"windows 8"); 
		
		Keyboard kbd = new Keyboard(5520,"razer",8000, 15, "gaming"); 
		Mouse mou = new Mouse(9000, "elephant", 9999, 10, 5000);
>>>>>>> origin/master
		
		
		b.addComputerPart(cpu);
		b.addComputerPart(mon);
		b.addComputerPart(os); 
		b.addComputerPart(kbd); 
		b.addComputerPart(mou); 
		
<<<<<<< HEAD
=======
		for (int i = 0; i < b.bundleSize(); i++){ 
			
		}
>>>>>>> origin/master
		
<<<<<<< HEAD
		System.out.println("Total price : PhP"); 
		b.getTotalPrice();
=======
		
		b.displayPartsSpecs();
>>>>>>> origin/master
		
				
		
		
		
	}

}

