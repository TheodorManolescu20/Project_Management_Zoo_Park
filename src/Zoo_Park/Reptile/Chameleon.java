package Zoo_Park.Reptile;

import Zoo_Park.Herbivore;

public class Chameleon extends Reptile implements Herbivore {
    private boolean canChangeColour;

    public Chameleon(String type, int height, double weight, String name, String colour, int age, boolean canChangeColour) {
        super(type, height, weight, name, colour, age);
        this.canChangeColour = canChangeColour;
    }

    public boolean isCanChangeColour() {
        return canChangeColour;
    }

    public void setCanChangeColour(boolean canChangeColour) {
        this.canChangeColour = canChangeColour;
    }

    @Override
    public void eatHerbs() {
        System.out.println("I eat herbs");
    }
}
