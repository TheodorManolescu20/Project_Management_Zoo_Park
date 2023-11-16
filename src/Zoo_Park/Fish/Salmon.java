package Zoo_Park.Fish;

import Zoo_Park.Swimable;

public class Salmon extends Fish implements Swimable {
    private boolean livesInSaltWater;

    public Salmon(String type, int height, double weight, String name, int age, String colour, boolean livesInSaltWater) {
        super(type, height, weight, name, age, colour);
        this.livesInSaltWater = livesInSaltWater;
    }

    public boolean isLivesInSaltWater() {
        return livesInSaltWater;
    }

    public void setLivesInSaltWater(boolean livesInSaltWater) {
        this.livesInSaltWater = livesInSaltWater;
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
