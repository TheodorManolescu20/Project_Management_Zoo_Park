package Zoo_Park.Reptile;

import Zoo_Park.Herbivore;

public class Turtle extends Reptile implements Herbivore {
    private boolean isSlow;

    public Turtle(String type, int height, double weight, String name, String colour, int age, boolean isSlow) {
        super(type, height, weight, name, colour, age);
        this.isSlow = isSlow;
    }

    public boolean isSlow() {
        return isSlow;
    }

    public void setSlow(boolean slow) {
        isSlow = slow;
    }

    @Override
    public void eatHerbs() {
        System.out.println("I eat herbs");
    }
}
