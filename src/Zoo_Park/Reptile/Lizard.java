package Zoo_Park.Reptile;

import Zoo_Park.Herbivore;

public class Lizard extends Reptile implements Herbivore {
    private int numberOfLegs;

    public Lizard(String type, int height, double weight, String name, String colour, int age, int numberOfLegs) {
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
    public void eatHerbs() {
        System.out.println("I like to eat herbs");
    }
}
