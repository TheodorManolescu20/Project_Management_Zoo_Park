package Zoo_Park.Fish;

import Zoo_Park.Swimable;

public class Tuna extends Fish implements Swimable {
    private boolean livesInTheSea;

    public Tuna(String type, int height, double weight, String name, int age, String colour, boolean livesInTheSea) {
        super(type, height, weight, name, age, colour);
        this.livesInTheSea = livesInTheSea;
    }

    public boolean isLivesInTheSea() {
        return livesInTheSea;
    }

    public void setLivesInTheSea(boolean livesInTheSea) {
        this.livesInTheSea = livesInTheSea;
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
