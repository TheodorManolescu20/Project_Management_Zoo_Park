package Zoo_Park.Bird;

import Zoo_Park.Animal.Animal;

public class Bird extends Animal {

    private String colour;
    private String name;
    private int age;

    public Bird(String type, int height, double weight, String colour, String name, int age) {
        super(type, height, weight);
        this.colour = colour;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
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

    @Override
    public void beDangerous() {
        System.out.println("We are not that dangerous");
    }
}
