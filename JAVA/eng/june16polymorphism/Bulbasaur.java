public class Bulbasaur extends Pokemon {

    public Bulbasaur(String n) {
        super(n,45);
        setPicture("bulbasaur.png");
    }

    @Override
    public String greet() {
        return "I am like a toad with an onion on its back.";
    }
}
