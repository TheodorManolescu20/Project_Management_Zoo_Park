package Zoo_Park.Bird;

import Zoo_Park.Flyable;

public class Owl extends Bird implements Flyable {
    private boolean likesToBeAwakeAtNight;

    public Owl(String type, int height, double weight, String colour, String name, int age, boolean likesToBeAwakeAtNight) {
        super(type, height, weight, colour, name, age);
        this.likesToBeAwakeAtNight = likesToBeAwakeAtNight;
    }

    public boolean isLikesToBeAwakeAtNight() {
        return likesToBeAwakeAtNight;
    }

    public void setLikesToBeAwakeAtNight(boolean likesToBeAwakeAtNight) {
        this.likesToBeAwakeAtNight = likesToBeAwakeAtNight;
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
