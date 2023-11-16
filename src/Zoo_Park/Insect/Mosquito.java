package Zoo_Park.Insect;

import Zoo_Park.Flyable;

public class Mosquito extends Insect implements Flyable {
    private boolean canBite;

    public Mosquito(String type, int height, double weight, String name, int age, String colour, boolean canBite) {
        super(type, height, weight, name, age, colour);
        this.canBite = canBite;
    }

    public boolean isCanBite() {
        return canBite;
    }

    public void setCanBite(boolean canBite) {
        this.canBite = canBite;
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
