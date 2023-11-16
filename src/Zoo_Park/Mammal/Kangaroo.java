package Zoo_Park.Mammal;

import Zoo_Park.Herbivore;

public class Kangaroo extends Mammal implements Herbivore {
    private boolean canLeap;

    public Kangaroo(String type, int height, double weight, String name, int age, String colour, boolean canLeap) {
        super(type, height, weight, name, age, colour);
        this.canLeap = canLeap;
    }

    public boolean isCanLeap() {
        return canLeap;
    }

    public void setCanLeap(boolean canLeap) {
        this.canLeap = canLeap;
    }

    @Override
    public void eatHerbs() {
        System.out.println("I eat herbs!");
    }
}
