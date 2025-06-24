class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}


public class TestInstanceof {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  // a Dog stored in an Animal reference
        Animal myPet = new Cat();  // a Cat stored in an Animal reference


        System.out.println(myAnimal instanceof Dog);    // true
        System.out.println(myAnimal instanceof Cat);    // false
        System.out.println(myAnimal instanceof Animal); // true

        System.out.println(myPet instanceof Dog);    // false
        System.out.println(myPet instanceof Cat);    // true
        System.out.println(myPet instanceof Animal); // true
    }
}

