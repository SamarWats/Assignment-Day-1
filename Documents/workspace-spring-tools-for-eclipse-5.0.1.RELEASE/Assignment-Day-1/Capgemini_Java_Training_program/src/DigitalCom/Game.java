package DigitalCom;

public class Game {
	private String GameName;
	private String AuthorName;
	private float  price;
	
	public Game() {}
	
	public Game(String GameName, String AuthorName, float price) {
		this.GameName = GameName;
		this.AuthorName = AuthorName;
		this.price = price;
	}
	
	public String getGameName() {
		return GameName;
	}
	
	public String getAuthorName() {
		return AuthorName;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String toString() {
        return "Game Name: " + GameName + ", Author: " + AuthorName + ", Price: " + price;
    }
}
