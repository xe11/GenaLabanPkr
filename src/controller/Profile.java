package controller;

import java.awt.Image;

public class Profile {
	private String name = null;
	private Image image = null;
	
	private int money = 0;
	private int sitNumner = 0;
	
	public Profile(String name, Image image, int money, int sitNumber) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.image = image;
		this.money = money;
		this.sitNumner = sitNumber;
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

	public int getSitNumner() {
		return sitNumner;
	}
}
