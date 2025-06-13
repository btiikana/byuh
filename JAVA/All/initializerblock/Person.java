import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Person {
    
    //fields
    private String name;
    private int age;
    

    //INITIALIZER BLOCK
    {
        name = "Betero Tiikana";
        age = 30;
    }

    //constructor --> we can still initialize here
    public Person () {   
    }

    //method
    public void introduce() {
        System.out.println("Hi my name is " + name);
    }

    //main method
    public static void main(String[] args) {
        BeteroTiikana info = new BeteroTiikana();
        info.introduce();
        info.talk();
    }
}
