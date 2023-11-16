package Zoo_Park.Reptile;

import Zoo_Park.Animal.Animal;

public class Reptile extends Animal {

    private String name;
    private String colour;
    private int age;

    public Reptile(String type, int height, double weight, String name, String colour, int age) {
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void beDangerous() {
        System.out.println("Most of us are very dangerous!");
    }
}
