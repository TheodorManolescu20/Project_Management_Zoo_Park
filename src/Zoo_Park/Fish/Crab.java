package Zoo_Park.Fish;

import Zoo_Park.Swimable;

public class Crab extends Fish implements Swimable {
    private int numberOfLegs;

    public Crab(String type, int height, double weight, String name, int age, String colour, int numberOfLegs) {
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
    public void swim() {
        System.out.println("I can swim");
    }
}
