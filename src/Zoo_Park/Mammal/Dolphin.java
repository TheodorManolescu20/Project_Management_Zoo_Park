package Zoo_Park.Mammal;

import Zoo_Park.Swimable;

public class Dolphin extends Mammal implements Swimable {
    private int tailLenght;

    public Dolphin(String type, int height, double weight, String name, int age, String colour, int tailLenght) {
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
    public void swim() {
        System.out.println("I can swim");
    }
}
