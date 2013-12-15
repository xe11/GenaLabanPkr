package controller;

public interface Game {
	
	public boolean isInGame(int numberSit);
	
	public int getBet(int numberSit);
	public int getBank();
	
	public int lengthCard();
	public Card getCard(int i);
}
