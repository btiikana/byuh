import java.awt.*;
import java.util.*;

public class Pichu extends Pokemon {
    
    //initializer block
    // the compiler will automatically insert
    //this code into constructor
    {
        addSpecialPower("electric tail");
        addSpecialPower("yellow fur");
        addSpecialPower("two pointy ears");
        addSpecialPower("can electrocute you");
        addSpecialPower("like to play detective");
    }

    public Pichu(String n) {
        super(n,20);
    }

    public Pichu() {
        super("Generic Pichu", 20);
    }

     public Pichu(int h) {
        super("Generic Pichu", h);
        setPicture("pichu.png");
    }

     public Pichu(String n, int h) {
        super("Generic Pichu", 20);
    }
}
