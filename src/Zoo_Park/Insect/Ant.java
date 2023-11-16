package Zoo_Park.Insect;

import Zoo_Park.Herbivore;

public class Ant extends Insect implements Herbivore {
    private boolean cabBite;

    public Ant(String type, int height, double weight, String name, int age, String colour, boolean cabBite) {
        super(type, height, weight, name, age, colour);
        this.cabBite = cabBite;
    }

    public boolean isCabBite() {
        return cabBite;
    }

    public void setCabBite(boolean cabBite) {
        this.cabBite = cabBite;
    }

    @Override
    public void eatHerbs() {
        System.out.println("I eat herbs!");
    }
}
