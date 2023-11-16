package Zoo_Park.Fish;

import Zoo_Park.Carnivore;
import Zoo_Park.Swimable;

public class Shark extends Fish implements Swimable, Carnivore {
   private int tailLenght;

    public Shark(String type, int height, double weight, String name, int age, String colour, int tailLenght) {
        super(type, height, weight, name, age, colour);
        this.tailLenght = tailLenght;
    }

    public int getTailLenght() {
        return tailLenght;
    }

    public void setTailLenght(int tailLenght) {
        this.tailLenght = tailLenght;
    }

    @Override
    public void eatMeat() {
        System.out.println("I like to eat meat!");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
