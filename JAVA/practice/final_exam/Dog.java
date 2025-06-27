import javax.swing.*;

public class Dog extends Animal{

    //canonical constructor
    public Dog (String name, ImageIcon animal) {
        //pass accepted name and animal values from objects inside Main class to Animal class
        super(name, animal);
    }
}
