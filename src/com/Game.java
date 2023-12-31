package com;

public class Game {
	private String gameName;
	private String authorName;
	private float price;
	
	
	@Override
	public String toString() {
		return "Game [gameName=" + gameName + ", authorName=" + authorName + ", price=" + price + "]";
	}
	
	//Constructor
	public Game(String gameName, String authorName, float price) {
		super();
		this.gameName = gameName;
		this.authorName = authorName;
		this.price = price;
	}
	
	//getter and setter of member variable
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
