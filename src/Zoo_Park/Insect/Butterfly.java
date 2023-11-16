package Zoo_Park.Insect;

import Zoo_Park.Flyable;

public class Butterfly extends Insect implements Flyable {
    private boolean hasWings;

    public Butterfly(String type, int height, double weight, String name, int age, String colour, boolean hasWings) {
        super(type, height, weight, name, age, colour);
        this.hasWings = hasWings;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
