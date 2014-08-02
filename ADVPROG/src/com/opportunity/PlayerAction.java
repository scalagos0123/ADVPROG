package com.opportunity;

public class PlayerAction {
	private int money;
	private int chance;
	private Player p;
	
	public void investOpportunity() {
		p = new Player();
		
		int currentMoney = p.getMoney() - 1000;
		int newMoney = p.setMoney(currentMoney); 
		int cardAtHand = 0;
		
		
        if (chance == 10) {
        	cardAtHand++;
            cardAtHand++;
            p.setCardAtHand(cardAtHand);
        } else {
            cardAtHand++;
            p.setCardAtHand(cardAtHand);
        }
	}
}
