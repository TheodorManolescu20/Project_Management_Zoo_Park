package Zoo_Park.Mammal;

import Zoo_Park.Swimable;

public class Whale extends Mammal implements Swimable {
    private boolean isTheBiggestMammal;

    public Whale(String type, int height, double weight, String name, int age, String colour, boolean isTheBiggestMammal) {
        super(type, height, weight, name, age, colour);
        this.isTheBiggestMammal = isTheBiggestMammal;
    }

    public boolean isTheBiggestMammal() {
        return isTheBiggestMammal;
    }

    public void setTheBiggestMammal(boolean theBiggestMammal) {
        isTheBiggestMammal = theBiggestMammal;
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
