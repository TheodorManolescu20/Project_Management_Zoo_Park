package Zoo_Park.Insect;

import Zoo_Park.Flyable;

public class Bee extends Insect implements Flyable {
    private boolean lovesThePollen;

    public Bee(String type, int height, double weight, String name, int age, String colour, boolean lovesThePollen) {
        super(type, height, weight, name, age, colour);
        this.lovesThePollen = lovesThePollen;
    }

    public boolean isLovesThePollen() {
        return lovesThePollen;
    }

    public void setLovesThePollen(boolean lovesThePollen) {
        this.lovesThePollen = lovesThePollen;
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
