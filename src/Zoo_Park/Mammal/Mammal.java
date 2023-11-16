package Zoo_Park.Mammal;

import Zoo_Park.Animal.Animal;

public class Mammal extends Animal {

    private String name;
    private int age;
    private String colour;

    public Mammal(String type, int height, double weight, String name, int age, String colour) {
        super(type, height, weight);
        this.age = age;
        this.colour = colour;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void beDangerous() {
        System.out.println("Some of us may be very dangerous");
    }
}
