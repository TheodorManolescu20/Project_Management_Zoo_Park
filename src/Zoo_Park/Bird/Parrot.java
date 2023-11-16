package Zoo_Park.Bird;

import Zoo_Park.Flyable;

public class Parrot extends Bird implements Flyable {
    private boolean canSpeak;

    public Parrot(String type, int height, double weight, String colour, String name, int age, boolean canSpeak) {
        super(type, height, weight, colour, name, age);
        this.canSpeak = canSpeak;
    }

    public boolean isCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
