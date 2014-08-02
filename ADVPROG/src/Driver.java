import java.util.ArrayList;


public class Driver {
	public static void main(String[] args) {
		
	SlicedBread sb = new SlicedBread();
	WheatBread wb = new WheatBread();
	BlackForestBread bb = new BlackForestBread();
	RaisinBread rb = new RaisinBread();
	ButterscotchBread tb = new ButterscotchBread();
	
	ArrayList<Integer> slices = new ArrayList<Integer>(); 
	
	int sliceCounterSB = 0;
	int sliceCounterWB = 0;
	int sliceCounterBB = 0;
	int sliceCounterRB = 0;
	int sliceCounterTB = 0;
	
//	sb.displayIngredients();
	wb.displayIngredients();
	bb.displayIngredients();
	
	for (int i = 0; i < 10; i++) {
		sb = new SlicedBread();
		int slice = sb.slice();
		sliceCounterSB = sliceCounterSB + slice;
	}
	
	for (int i = 0; i < 5; i++) {
		sb = new SlicedBread();
		int slice = sb.slice(10);
		sliceCounterSB = sliceCounterSB + slice;
	}
	
	for (int i = 0; i < 5; i++) {
		sb = new SlicedBread();
		int slice = sb.slice(15);
		sliceCounterSB = sliceCounterSB + slice;
	}
	
	System.out.println(SlicedBread.getCounter());
	
	for (int i = 0; i < 15; i++) {
		wb = new WheatBread();
		}
	
	System.out.println(WheatBread.getCounter());
	}
}
