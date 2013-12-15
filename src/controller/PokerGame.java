package controller;

import java.util.ArrayList;

public class PokerGame implements Game{
	private boolean[] inGame  = null;
	
	private int[] bets = null;
	private int bank = 0;
	
	private ArrayList<Card> cards = null;

	@Override
	public boolean isInGame(int numberSit) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(numberSit < inGame.length && numberSit > 0) {
			result = inGame[numberSit];
		}
		
		return result;
	}

	@Override
	public int getBet(int numberSit) {
		// TODO Auto-generated method stub
		int bet = -1;
		if(isInGame(numberSit)) {
			bet = bets[numberSit];
		}
		
		return bet;
	}

	@Override
	public int getBank() {
		// TODO Auto-generated method stub
		return bank;
	}

	@Override
	public int lengthCard() {
		// TODO Auto-generated method stub
		return cards.size();
	}

	@Override
	public Card getCard(int i) {
		// TODO Auto-generated method stub
		Card card = null;
		if(i < cards.size() && i > 0){
			card = cards.get(i);
		}
		
		return card;
	}
	
	
}
