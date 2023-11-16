package Zoo_Park.Bird;

import Zoo_Park.Flyable;

public class Dove extends Bird implements Flyable {
    private boolean livesInTheCity;

    public Dove(String type, int height, double weight, String colour, String name, int age, boolean livesInTheCity) {
        super(type, height, weight, colour, name, age);
        this.livesInTheCity = livesInTheCity;
    }

    public boolean isLivesInTheCity() {
        return livesInTheCity;
    }

    public void setLivesInTheCity(boolean livesInTheCity) {
        this.livesInTheCity = livesInTheCity;
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
