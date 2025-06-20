public class Charmander extends Pokemon {

    public Charmander(String n) {
        super(n,39);
        setPicture("charmander.png");
    }

    @Override
    public String greet() {
        return "I look like a lizard, but my tail's on fire!";
    }
}
