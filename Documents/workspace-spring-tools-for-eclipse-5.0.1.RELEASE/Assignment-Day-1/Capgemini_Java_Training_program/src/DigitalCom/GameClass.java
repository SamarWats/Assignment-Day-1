package DigitalCom;

public class GameClass {

    private String GameName;
    private String AuthorName;
    private float price;

    // Default Constructor
    public GameClass() {}

    // Parameterized Constructor
    public GameClass(String GameName, String AuthorName, float price) {
        this.GameName = GameName;
        this.AuthorName = AuthorName;
        this.price = price;
    }

    // Getters
    public String getGameName() {
        return GameName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game Name: " + GameName +
                ", Author: " + AuthorName +
                ", Price: ₹" + price;
    }
}
