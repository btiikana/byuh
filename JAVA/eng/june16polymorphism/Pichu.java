import java.awt.*;

public class Pichu extends Pokemon {

    //this is an "initializer block"...
    //the compiler will automatically insert
    //this code into each constructor
    {
        setPicture("pichu.png");
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
    }

    public Pichu(String n, int h) {
        super(n, h);
    }

    @Override
    public String greet() {
        return "I am adorable, but I could electrocute you.";
    }
}
