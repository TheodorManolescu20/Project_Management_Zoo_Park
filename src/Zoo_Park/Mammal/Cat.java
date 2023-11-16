package Zoo_Park.Mammal;

import Zoo_Park.Swimable;

public class Cat extends Mammal  {
    private boolean lovesPeople;

    public Cat(String type, int height, double weight, String name, int age, String colour, boolean lovesPeople) {
        super(type, height, weight, name, age, colour);
        this.lovesPeople = lovesPeople;
    }

    public boolean isLovesPeople() {
        return lovesPeople;
    }

    public void setLovesPeople(boolean lovesPeople) {
        this.lovesPeople = lovesPeople;
    }
}
