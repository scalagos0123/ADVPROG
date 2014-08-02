package com.opportunity;

import java.util.Scanner;

/**
 * 
 * @author Shaun Calagos
 * @author Kat Delfin
 *
 */


public class Run {
     /**
     * main method
     * @param main method
     * 
     * 
     */
     
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 
        int[][] flipCoin = new int[2][2];
        String choice;

         for (int player = 0; player < 2; player++) {
             for (int die = 0; die < 2; die++) {
              Player p1 = new Player("Shaun");
              Player p2 = new Player("Kat");
          
            System.out.println("******** OPPORTUNITY ********");         //from here
            System.out.println("Player 1 currently has : ");  
            System.out.println(p1.getCardAtHand()+ " cards in hand."); 
            System.out.println(" PhP " + p1.getMoney()); 
            
			 System.out.println("What would you like to do?"); 
			 System.out.println(" 1 - Invest in opportunity"); 
			 System.out.println(" 2 - Abstain turn "); 
			 choice = sc.next();
             
             if(choice.equals("1")){ 
                 p1.investOnOpportunity();
                 choice = "";
             } else if(choice.equals("2")){ 
                    System.out.println("******** OPPORTUNITY ********");         //from here
					System.out.println("Player 2 currently has : "); 
					System.out.println( " cards in the deck."); 
					System.out.println(p2.getCardAtHand()+ " cards in hand."); 
					System.out.println(" PhP " + p2.getMoney()); 
					 
					System.out.println("What would you like to do?"); 
					System.out.println(" 1 - Invest in opportunity"); 
					System.out.println(" 2 - End turn ");
					
					choice = sc.next();
					
					if (choice.equals("1")) {
						p2.investOnOpportunity();
						choice = "";
					}
             } else {
            	 System.out.println("Invalid choice");
             }
             }
         }
    }
}