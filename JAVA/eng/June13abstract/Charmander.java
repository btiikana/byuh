public class Charmander extends Pokemon {

    public Charmander(String n) {
        super(n,45);
        setPicture("charmander.png");
    }

    @Override
    public abstract String greet();
}
