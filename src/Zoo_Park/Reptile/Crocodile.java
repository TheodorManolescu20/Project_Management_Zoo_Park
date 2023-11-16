package Zoo_Park.Reptile;

import Zoo_Park.Carnivore;
import Zoo_Park.Swimable;

public class Crocodile extends Reptile implements Swimable , Carnivore {
    private int numberOfLegs;

    public Crocodile(String type, int height, double weight, String name, String colour, int age, int numberOfLegs) {
        super(type, height, weight, name, colour, age);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }

    @Override
    public void eatMeat() {
        System.out.println("I like to eat meat");
    }
}
