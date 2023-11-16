package Zoo_Park.Mammal;

import Zoo_Park.Swimable;

public class Dog extends Mammal implements Swimable {
    private boolean lovesPeople;

    public Dog(String type, int height, double weight, String name, int age, String colour, boolean lovesPeople) {
        super(type, height, weight, name, age, colour);
        this.lovesPeople = lovesPeople;
    }

    public boolean isLovesPeople() {
        return lovesPeople;
    }

    public void setLovesPeople(boolean lovesPeople) {
        this.lovesPeople = lovesPeople;
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
