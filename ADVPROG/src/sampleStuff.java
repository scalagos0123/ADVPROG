
public class sampleStuff {
	public static void main(String[] args) {
		String s1 = "1000";
		String s2 = "2000";
		
		if (s1.compareTo(s2) > s2.compareTo(s1)) {
			System.out.println("S1 is bigger");
		} else {
			System.out.println("S2 is bigger");
		}
	}
}
