package Zoo_Park.Bird;

import Zoo_Park.Swimable;

public class Duck extends Bird implements Swimable {
    private boolean livesInTheCity;

    public Duck(String type, int height, double weight, String colour, String name, int age, boolean livesInTheCity) {
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
    public void swim() {
        System.out.println("I can swim!");
    }
}
