package Zoo_Park.Fish;

import Zoo_Park.Animal.Animal;

public class Fish extends Animal {

    private String name;
    private int age;
    private String colour;

    public Fish(String type, int height, double weight,String name, int age, String colour) {
        super(type, height, weight);
        this.name = name;
        this.age = age;
        this.colour = colour;
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
        System.out.println("We can be a bit dangerous");
    }
}
