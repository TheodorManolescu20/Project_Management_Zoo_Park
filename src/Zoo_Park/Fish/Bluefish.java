package Zoo_Park.Fish;

import Zoo_Park.Swimable;

public class Bluefish extends Fish implements Swimable {
    private boolean isBlue;

    public Bluefish(String type, int height, double weight, String name, int age, String colour, boolean isBlue) {
        super(type, height, weight, name, age, colour);
        this.isBlue = isBlue;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean blue) {
        isBlue = blue;
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
