package Zoo_Park.Bird;

import Zoo_Park.Flyable;

public class Eagle extends Bird implements Flyable {
    private int lenghtOfWings;

    public Eagle(String type, int height, double weight, String colour, String name, int age,int lenghtOfWings) {
        super(type, height, weight, colour, name, age);
        this.lenghtOfWings = lenghtOfWings;
    }

    public int getLenghtOfWings() {
        return lenghtOfWings;
    }

    public void setLenghtOfWings(int lenghtOfWings) {
        this.lenghtOfWings = lenghtOfWings;
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
