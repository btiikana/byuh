import java.awt.*;
import javax.swing.*;
import java.util.*;

public class BeteroTiikana extends Person{
    //fields
    private String favoriteGame;
    private String gameVersion;
    private String favoriteFood;

    //initializer block
    {
        favoriteGame = "World of Tanks";
        gameVersion = "PC";
        favoriteFood = "Spam Musubi";
    }

    //constructor
    public BeteroTiikana() {

    }

    //method
    public void talk() {
        System.out.println("And I love to play " + favoriteGame + " " + gameVersion);
        System.out.println("I also enjoy going out to get some " + favoriteFood + " at Foodland.");
    }
}
