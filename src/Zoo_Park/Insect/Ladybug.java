package Zoo_Park.Insect;

import Zoo_Park.Flyable;

public class Ladybug extends Insect implements Flyable {
    private int numberOfLegs;

    public Ladybug(String type, int height, double weight, String name, int age, String colour, int numberOfLegs) {
        super(type, height, weight, name, age, colour);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
