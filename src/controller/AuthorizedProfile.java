package controller;

import java.awt.Image;

public class AuthorizedProfile {
	private String name = null;
	private Image image = null;
	
	private int money = 0;
	private int interruptedGame = 0;
	
	public AuthorizedProfile(String name, Image image, int money, int game) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.image = image;
		this.money = money;
		this.interruptedGame = game;
	}

	public String getName() {
		return name;
	}

	public Image getImage() {
		return image;
	}

	public int getMoney() {
		return money;
	}

	public int getInterruptedGame() {
		return interruptedGame;
	}
}
