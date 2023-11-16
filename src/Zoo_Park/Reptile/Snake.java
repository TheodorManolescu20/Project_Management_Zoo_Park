package Zoo_Park.Reptile;

import Zoo_Park.Poisonous;

public class Snake extends Reptile implements Poisonous {
    private int numberOfLegs;

    public Snake(String type, int height, double weight, String name, String colour, int age, int numberOfLegs) {
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
    public void poison() {
        System.out.println("I am poisonous");
    }
}
