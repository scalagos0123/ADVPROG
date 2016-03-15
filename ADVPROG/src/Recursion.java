import java.util.*;

public class Recursion {
	
	public static String rec() {
		Scanner sc = new Scanner(System.in);
		String c;
		System.out.print("Enter input: ");
		c = sc.next();
		System.out.printf("Your input: %s\n", c);
		System.out.println();
		
		if (c.equalsIgnoreCase("c")) {
			return c;	
		} else {
			return rec();
		}
		
	}
	
	public static void main(String[] args) {
		String c = rec();
		System.out.print("Congratulations!");
	}

	asdasdasdasdsadsadasd
}
